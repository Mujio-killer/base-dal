package com.mujio.dal.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 模型字段表
 *
 * @author Honey
 * Create on 2023-04-27 22:26:37
 */
@Data
public class SysObjField implements Serializable {

    private static final long serialVersionUID = 1596076787929L;
    /**
     * ID
     */
    private int id;

    /**
     * 租户ID
     */
    private int tenantId;

    /**
     * 创建人，不传默认sys
     */
    private String creator;

    /**
     * 修改人，不传默认sys
     */
    private String modifier;

    /**
     * 创建时间，默认当前时间
     */
    private Date createTime;

    /**
     * 修改时间，不传默认当前时间
     */
    private Date modifyTime;

    /**
     * 状态，0:删除, 1:正常, 2:其他
     */
    private Byte status;

    /**
     * 所属对象ID
     */
    private Integer objId;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 别名，提高辨识度，长度不超过50
     */
    private String labelName;

    /**
     * 字段说明
     */
    private String comment;

    /**
     * 字段顺序
     */
    private Byte colOrder;

    /**
     * 字段类型
     */
    private String colType;

    /**
     * 字段所属列
     */
    private String position;

    /**
     * 字段长度，特殊字段无需判断
     */
    private Long length;

    /**
     * 是否允许为空，0:否， 1:是
     */
    private Byte allowNull;

    /**
     * 是否唯一，0:否， 1:是
     */
    private Byte isPrimary;

    /**
     * 是否必填，0:否， 1:是
     */
    private Byte isRequired;

    /**
     * 是否为大字段，0:否， 1:是
     */
    private Byte isClob;

    /**
     * 是否为索引，0:否， 1:是
     */
    private Byte isIndex;

    /**
     * 是否为联合索引，0:否， 1:是
     */
    private Byte isUk;

    /**
     * 额外信息,冗余字段，用于后续扩展
     */
    private String extInfo;
}