/*
 * Copyright 2016-2020 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package com.mujio.dal;

import org.teasoft.bee.osql.BeeException;
import org.teasoft.honey.osql.autogen.GenBean;
import org.teasoft.honey.osql.autogen.GenConfig;
import org.teasoft.honey.osql.core.HoneyConfig;

/**
 * @author Kingstar
 * @since  1.7.2
 */
public class GenBeanExam {
	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		 try{
			 // driverName,url,username,password config in bee.properties.
			String dbName=HoneyConfig.getHoneyConfig().getDbName();

			GenConfig config = new GenConfig();
			config.setDbName(dbName);
			// 生成toString方法
			config.setGenToString(true);
			// 生成序列化
			config.setGenSerializable(true);
			config.setGenComment(true);
		 	config.setGenSelfName(true);
			// 更改成本地的具体路径  change to your real path
			config.setBaseDir("/Users/gaoziyou/workSpace/project/idea/base-dal/src/main/java/");
			// 包路径
			config.setPackagePath("com.mujio.dal.test.entity");

			GenBean genBean = new GenBean(config);
		
//			config.setGenComment(true);
			config.setGenFieldFile(true);
			config.setCommentPlace(1);
			
			//设置相对Entity的文件夹; 空表示与Entity同一个文件夹
//			config.setFieldFileRelativeFolder("field"); //默认
			
			config.setOverride(true); //是否覆盖原来的文件
			
//			genBean.genAllBeanFile();  //生成某个库所有表对应的Javabean

			 String tableNames = "sys_datasource,sys_object,sys_obj_field,sys_obj_data,sys_obj_clob,sys_obj_sequence";
			genBean.genSomeBeanFile(tableNames);

			//it is easy way.   最简单的用法,所有的都用默认配置.
			new GenBean().genSomeBeanFile(tableNames);
		  } catch (BeeException e) {
			 e.printStackTrace();
		  }
	}
}
