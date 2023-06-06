package com.mujio.dal.entity.field;

/**
 * 数据源信息表 (relative field name for Javabean SysDatasource)
 * @author Honey
 * Create on 2023-04-27 22:47:38
 */
public class SysDatasource_F {

	private SysDatasource_F() {}

	public static final String id = "id";//唯一主键

	public static final String tenantId = "tenantId";//租户ID，用于区分不同业务，0表示共享租户

	public static final String creator = "creator";//创建人，用于找到责任人

	public static final String modifier = "modifier";//修改人，用于找到责任人

	public static final String createTime = "createTime";//创建时间

	public static final String modifyTime = "modifyTime";//修改时间

	public static final String status = "status";//状态，0:测试, 1:生产, 2:废弃

	public static final String datasourceName = "datasourceName";//数据源名称,长度不超过50

	public static final String labelName = "labelName";//别名，提高辨识度，长度不超过50

	public static final String url = "url";//链接url

	public static final String password = "password";//密钥

	public static final String type = "type";//数据源类型

	public static final String extInfo = "extInfo";//额外信息,冗余字段，用于后续扩展

	public static final String ENTITY_NAME = "SysDatasource";
	public static final String TABLE_NAME = "sys_datasource";
	public static final String ALL_NAMES = "id,tenantId,creator,modifier,createTime,modifyTime,status,datasourceName,labelName,url,password,type,extInfo";
}