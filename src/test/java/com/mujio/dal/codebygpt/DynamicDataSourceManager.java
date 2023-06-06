package com.mujio.dal.codebygpt;

// 定义动态数据源管理器
public class DynamicDataSourceManager {

  private static final ThreadLocal<String> DATASOURCES = new ThreadLocal<>();

  public static void setDatabaseType(String dataSourceName) {
    DATASOURCES.set(dataSourceName);
  }

  public static String getDatabaseType() {
    return DATASOURCES.get();
  }

  public static void clearDataSource() {
    DATASOURCES.remove();
  }

}
