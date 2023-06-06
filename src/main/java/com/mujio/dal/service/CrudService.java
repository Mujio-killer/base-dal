package com.mujio.dal.service;

import com.mujio.dal.config.DataSourceConfig;
import com.mujio.dal.entity.SysDatasource;
import com.mujio.dal.entity.SysObjData;
import com.mujio.dal.entity.SysObject;
import com.mujio.dal.model.Criteria;
import org.teasoft.bee.osql.ObjToSQL;
import org.teasoft.bee.osql.api.PreparedSql;
import org.teasoft.bee.osql.api.SuidRich;

import java.util.List;

/**
 * 通用的crud入口
 */
public interface CrudService {


    List<SysObjData> query(Criteria criteria);


    List<SysObject> queryObj(Criteria criteria);


    List<SysDatasource> queryDataSource(Criteria criteria);


    /**
     * 利用系统数据源查询
     */
    default SuidRich getSuid() {
        return new DataSourceConfig().getSystemSuid();
    }
    /**
     * 利用系统数据源查询
     */
//    default PreparedSql getPreparedSql() {
//        return new DataSourceConfig().getPreparedSql();
//    }

    /**
     * 根据参数获取对应数据源信息
     *
     * @param criteria
     * @return
     */
    default SuidRich getSuid(Criteria criteria) {
        return new DataSourceConfig().getSuid(criteria.getTenantId(), criteria.getDataSourceName(), criteria.getDataSourceType());
    }

}
