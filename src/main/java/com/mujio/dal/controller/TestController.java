package com.mujio.dal.controller;

import com.mujio.dal.entity.SysDatasource;
import com.mujio.dal.model.Criteria;
import com.mujio.dal.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teasoft.bee.osql.api.Suid;
import org.teasoft.honey.osql.core.BeeFactoryHelper;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private CrudService crudService;

    @GetMapping("/get")
    public Object create() {
        Suid suid = BeeFactoryHelper.getSuid();
        SysDatasource sysDataSource = new SysDatasource();
        sysDataSource.setId(0);
        List<SysDatasource> select = suid.select(sysDataSource);
        return select;
    }

    @GetMapping("/query")
    public List<SysDatasource> query() {
        Criteria criteria = new Criteria();
        criteria.setDataSourceName("mujio");
        criteria.setDataSourceType("mysql");
        return crudService.queryDataSource(criteria);
    }


}
