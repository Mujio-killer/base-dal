package com.mujio.dal.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 数据源信息表
 *
 * @author Honey
 * Create on 2023-04-27 22:26:37
 */
@Data
public class SysDatasource extends SysBaseParam implements Serializable {

    private static final long serialVersionUID = 1598923831985L;

    /**
     * 状态，0:测试, 1:生产, 2:废弃
     */
    private Byte status;

    /**
     * 数据源名称,长度不超过50
     */
    private String datasourceName;

    /**
     * 别名，提高辨识度，长度不超过50
     */
    private String labelName;

    /**
     * 链接url
     */
    private String url;

    /**
     * 密钥
     */
    private String password;

    /**
     * 数据源类型
     */
    private String type;

    /**
     * 额外信息,冗余字段，用于后续扩展
     */
    private String extInfo;

}