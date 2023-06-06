package com.mujio.dal.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 数据源信息表
 *
 * @author Honey
 * Create on 2023-04-27 22:26:37
 */
@Data
public class SysDatasource implements Serializable {

    private static final long serialVersionUID = 1598923831985L;
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
     * 状态，0:测试, 1:生产, 2:废弃
     */
    private Byte status;

    /**
     * 数据源名称,长度不超过50
     */
    private String userName;

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

    @Override
    public String toString() {
        return "SysDatasource{" +
                "status=" + status +
                ", userName='" + userName + '\'' +
                ", labelName='" + labelName + '\'' +
                ", url='" + url + '\'' +
//                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", extInfo='" + extInfo + '\'' +
                '}';
    }
}