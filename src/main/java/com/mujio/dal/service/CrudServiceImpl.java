package com.mujio.dal.service;

import com.mujio.dal.entity.SysDatasource;
import com.mujio.dal.entity.SysObjData;
import com.mujio.dal.entity.SysObject;
import com.mujio.dal.model.Criteria;
import org.springframework.stereotype.Service;
import org.teasoft.bee.osql.Op;
import org.teasoft.bee.osql.api.Condition;
import org.teasoft.bee.osql.chain.Select;
import org.teasoft.honey.osql.chain.SelectImpl;
import org.teasoft.honey.osql.core.BeeFactory;
import org.teasoft.honey.osql.core.ConditionImpl;

import java.util.List;

/**
 * 通用的crud入口
 */
@Service
public class CrudServiceImpl implements CrudService {

    @Override
    public List<SysObjData> query(Criteria criteria) {
        return this.getSuid(criteria).select(new SysObjData(), new ConditionImpl());
    }

    @Override
    public List<SysDatasource> queryDataSource(Criteria criteria) {
        return this.getSuid().select(new SysDatasource(), new ConditionImpl());
    }

    @Override
    public List<SysObject> queryObj(Criteria criteria) {
        return null;
    }

//    public <T> List<T> queryByModelName(String modelName, Select t) {
//        this.getPreparedSql().select(t);
//    }



}
