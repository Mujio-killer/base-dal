package com.mujio.dal.entity;

import lombok.Data;
import org.teasoft.bee.osql.annotation.Column;

import java.util.Date;

/**
 * 系统基础字段
 */
@Data
public class SysBaseParam {

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

}
