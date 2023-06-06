package com.mujio.dal.codebygpt;

// 定义service入口，调用BaseDaoFactory创建dao代理对象，实现工厂的解耦
public class BaseService {

  public <T extends BaseDao<?, ?>> T createDao(Class<T> daoClass, String dataSourceName) {
    return BaseDaoFactory.createDao(daoClass, dataSourceName);
  }

}