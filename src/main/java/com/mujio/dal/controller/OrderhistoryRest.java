///*
// * Copyright 2016-2019 the original author.All rights reserved.
// * Kingstar(aiteasoft@163.com)
// * The license,see the LICENSE file.
// */
//
//package com.mujio.dal.controller;
//
//import com.automvc.common.jquery.Result;
//import com.automvc.enet.order.entity.Orderhistory;
//import com.automvc.moreds.RwDsTest;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.teasoft.bee.osql.BeeSQLException;
//import org.teasoft.bee.osql.service.ObjSQLRichService;
//import org.teasoft.bee.osql.service.ObjSQLService;
//import org.teasoft.honey.osql.core.Logger;
//
//import java.util.List;
//
///**
// * @author AiTeaSoft.com
// * @since  1.0
// * Create on 2019-04-16 11:48:24
// */
//@RestController
//@RequestMapping("/orderhistory")
//public class OrderhistoryRest {
//	@Autowired
//	ObjSQLService objSQLService;
//
//	@Autowired
//	ObjSQLRichService objSQLRichService;
//
//	@RequestMapping("/list")
//	public Result list(Orderhistory orderhistory, @RequestParam(value = "page", defaultValue = "1", required = false) int page,
//			@RequestParam(value = "rows", defaultValue = "20", required = false) int rows) {
//		Result result = new Result();
//		try {
//			int total = objSQLRichService.count(orderhistory);
//			List<Orderhistory> list = objSQLRichService.select(orderhistory, (page - 1) * rows, rows);
//			result.setRows(list);
//			result.setTotal(total);
//		} catch (BeeSQLException e) {
//			Logger.error(e.getMessage(),e);
//			result.setErrorMsg(e.getMessage());
//		}catch (Exception e) {
//			Logger.error(e.getMessage(),e);
//			result.setErrorMsg(e.getMessage());
//		}
//
//		return result;
//	}
//
//	@RequestMapping("/testMoreDatasource")
//	public Result testMoreDatasource() {
//		Result result = new Result();
//		RwDsTest.testMoreDatasource();
//		result.setMsg("testMoreDatasource");
//		return result;
//	}
//
//	@RequestMapping("/add")
//	public Result insert(Orderhistory orderhistory) {
//
//		Result result = new Result();
//		try {
//			int num = objSQLService.insert(orderhistory);
//			result.setTotal(num);
//			if (num <= 0) result.setErrorMsg("insert failed!");
//		} catch (BeeSQLException e) {
//			result.setErrorMsg(e.getMessage());
//		}
//		return result;
//	}
//
//	@RequestMapping("/edit")
//	public Result update(Orderhistory orderhistory) {
//		Result result = new Result();
//		try {
//			int num = objSQLService.update(orderhistory);
//			result.setTotal(num);
//			if (num <= 0) result.setErrorMsg("update failed!");
//		} catch (BeeSQLException e) {
//			result.setErrorMsg(e.getMessage());
//		}
//		return result;
//	}
//
//	@RequestMapping("/del")
//	public Result delete(String ids) {
//		Result result = new Result();
//		try {
//			int num = objSQLRichService.deleteById(Orderhistory.class, ids);
//			result.setTotal(num);
//			if (num <= 0) result.setErrorMsg("delete failed!");
//		} catch (BeeSQLException e) {
//			result.setErrorMsg(e.getMessage());
//		}
//		return result;
//	}
//
//}
