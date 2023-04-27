package com.mujio.dal.controller;

import com.mujio.dal.entity.SysDatasource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.teasoft.bee.osql.Suid;
import org.teasoft.honey.osql.core.BeeFactoryHelper;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/get")
    public Object create() {
        Suid suid = BeeFactoryHelper.getSuid();
        SysDatasource sysDataSource = new SysDatasource();
        sysDataSource.setId(0);
        List<SysDatasource> select = suid.select(sysDataSource);
        return select;
    }
}
