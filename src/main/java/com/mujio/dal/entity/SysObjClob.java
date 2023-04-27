package com.mujio.dal.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 模型大字段数据表
 *
 * @author Honey
 * Create on 2023-04-27 22:26:37
 */
@Data
public class SysObjClob extends SysBaseParam implements Serializable {

    private static final long serialVersionUID = 1592486078279L;

    /**
     * 状态，0:删除, 1:正常, 2:其他
     */
    private Byte status;

    /**
     * 所属对象ID
     */
    private Integer objId;

    /**
     * 业务主键
     */
    private String guid;

    /**
     * 大字段0值
     */
    private String clob0;

    /**
     * 大字段1值
     */
    private String clob1;

    private String clob2;

    private String clob3;

    private String clob4;

    private String clob5;

    private String clob6;

    private String clob7;

    private String clob8;

    private String clob9;
}