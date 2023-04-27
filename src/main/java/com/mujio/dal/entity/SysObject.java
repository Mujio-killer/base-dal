package com.mujio.dal.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 模型元数据表
 *
 * @author Honey
 * Create on 2023-04-27 22:26:37
 */
@Data
public class SysObject extends SysBaseParam implements Serializable {

    private static final long serialVersionUID = 1593803349276L;

    /**
     * 状态，0:删除, 1:正常, 2:其他
     */
    private Byte status;

    /**
     * 数据源名称,长度不超过50
     */
    private String datasourceName;

    /**
     * 模型名称
     */
    private String name;

    /**
     * 别名，提高辨识度，长度不超过50
     */
    private String labelName;

    /**
     * 模型说明
     */
    private String comment;

    /**
     * 模型版本
     */
    private String version;

    /**
     * 额外信息,冗余字段，用于后续扩展
     */
    private String extInfo;
}