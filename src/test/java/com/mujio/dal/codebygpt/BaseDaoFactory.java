package com.mujio.dal.codebygpt;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 定义工厂，返回动态数据源下的BaseDao代理对象
public class BaseDaoFactory {

  public static <T extends BaseDao<?, ?>> T createDao(Class<T> daoClass, String dataSourceName) {
    // 通过动态代理实现动态数据源切换
    ClassLoader classLoader = daoClass.getClassLoader();
    Class<?>[] interfaces = new Class[]{daoClass};
    InvocationHandler invocationHandler = new DaoInvocationHandler(dataSourceName, daoClass);
    return (T) Proxy.newProxyInstance(classLoader, interfaces, invocationHandler);
  }

  // 定义InvocationHandler，实际执行数据源和方法的切换
  private static class DaoInvocationHandler implements InvocationHandler {

    private final String dataSourceName;

    private final Class<?> daoClass;

    public DaoInvocationHandler(String dataSourceName, Class<?> daoClass) {
      this.dataSourceName = dataSourceName;
      this.daoClass = daoClass;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      Object result;
      try {
        DynamicDataSourceManager.setDatabaseType(dataSourceName);
        BaseDao<?, ?> dao = (BaseDao<?, ?>) daoClass.newInstance();
        result = method.invoke(dao, args);
      } finally {
        DynamicDataSourceManager.clearDataSource();
      }
      return result;
    }

  }

}
