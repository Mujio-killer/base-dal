package com.mujio.dal.codebygpt;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

// 定义数据源工厂
public class DataSourceFactory {

  private static final Map<String, DataSource> dataSourceMap = new HashMap<>();

  private
  static{
    //读取配置文件，初始化数据源
    // dataSourceMap.put(name, DataSourceUtil.createDataSource(dataSourceConfig))
  }

  public static DataSource getDataSource(String dataSourceName) {
    return dataSourceMap.get(dataSourceName);
  }

}
