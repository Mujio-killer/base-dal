package com.mujio.dal.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 模型自增ID记录表
 *
 * @author Honey
 * Create on 2023-04-27 22:26:37
 */
@Data
public class SysObjSequence extends SysBaseParam implements Serializable {

    private static final long serialVersionUID = 1599406069000L;

    /**
     * 状态，0:删除, 1:正常, 2:废弃
     */
    private Byte status;

    /**
     * 模型ID
     */
    private Integer objId;

    /**
     * 模型字段ID
     */
    private Integer fieldId;

    /**
     * 最小值
     */
    private Integer minVal;

    /**
     * 最大值
     */
    private Integer maxVal;

    /**
     * 当前值
     */
    private Integer currentVal;

    /**
     * 自增步长
     */
    private Integer step;

    /**
     * 额外信息,冗余字段，用于后续扩展
     */
    private String extInfo;

}