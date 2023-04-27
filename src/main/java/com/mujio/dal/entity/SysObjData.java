package com.mujio.dal.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 模型数据表
 *
 * @author Honey
 * Create on 2023-04-27 22:26:37
 */
@Data
public class SysObjData extends SysBaseParam implements Serializable {

    private static final long serialVersionUID = 1598410792102L;

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
     * 唯一主键
     */
    private String uniqueId;

    /**
     * 联合索引
     */
    private String uk;

    /**
     * 字段0值
     */
    private String val0;

    private String val1;

    private String val2;

    private String val3;

    private String val4;

    private String val5;

    private String val6;

    private String val7;

    private String val8;

    private String val9;

    private String val10;

    private String val11;

    private String val12;

    private String val13;

    private String val14;

    private String val15;

    private String val16;

    private String val17;

    private String val18;

    private String val19;

    private String idx0;

    private String idx1;

    private String idx2;
}