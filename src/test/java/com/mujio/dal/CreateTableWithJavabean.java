///*
// * Copyright 2016-2021 the original author.All rights reserved.
// * Kingstar(honeysoft@126.com)
// * The license,see the LICENSE file.
// */
//
//package com.mujio.dal;
//
//import com.automvc.enet.order.entity.Orderhistory;
//import org.teasoft.bee.osql.Suid;
//import org.teasoft.honey.distribution.GenIdFactory;
//import org.teasoft.honey.osql.autogen.Ddl;
//import org.teasoft.honey.osql.core.BeeFactoryHelper;
//import org.teasoft.honey.osql.core.Logger;
//
///**
// * @author Kingstar
// * @since  1.9
// */
//public class CreateTableWithJavabean {
//
//	public static void main(String[] args) {
//		try {
//
//			Suid suid=BeeFactoryHelper.getSuid();
////			suid.select(new Orderhistory());
//
//			//直接运行main方法, 配置信息是从bee.properties获取
//            //run the main method directly, the config info get from bee.properties.
//			Ddl.createTable(new Orderhistory(), false);
//
//			//test data
//			Orderhistory entity=new Orderhistory();
//			entity.setName("Bee");
//			entity.setOrderNo(GenIdFactory.get()+"");
//			entity.setRemark("test for spring boot");
//			suid.insert(entity);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//			Logger.error("In CreateTableWithJavabean (Exception):" + e.getMessage());
//
//		}
//	}
//
//}
