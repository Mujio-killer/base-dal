package com.mujio.dal.entity.field;

/**
 * 模型元数据表 (relative field name for Javabean SysObject)
 * @author Honey
 * Create on 2023-04-27 22:47:38
 */
public class SysObject_F {

	private SysObject_F() {}

	public static final String id = "id";//唯一主键

	public static final String tenantId = "tenantId";//租户ID，用于区分不同业务，0表示共享租户

	public static final String creator = "creator";//创建人，用于找到责任人

	public static final String modifier = "modifier";//修改人，用于找到责任人

	public static final String createTime = "createTime";//创建时间

	public static final String modifyTime = "modifyTime";//修改时间

	public static final String status = "status";//状态，0:删除, 1:正常, 2:其他

	public static final String datasourceName = "datasourceName";//数据源名称,长度不超过50

	public static final String name = "name";//模型名称

	public static final String labelName = "labelName";//别名，提高辨识度，长度不超过50

	public static final String comment = "comment";//模型说明

	public static final String version = "version";//模型版本

	public static final String extInfo = "extInfo";//额外信息,冗余字段，用于后续扩展

	public static final String ENTITY_NAME = "SysObject";
	public static final String TABLE_NAME = "sys_object";
	public static final String ALL_NAMES = "id,tenantId,creator,modifier,createTime,modifyTime,status,datasourceName,name,labelName,comment,version,extInfo";
}