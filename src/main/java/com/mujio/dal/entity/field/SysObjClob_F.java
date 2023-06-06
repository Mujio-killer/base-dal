package com.mujio.dal.entity.field;

/**
 * 模型大字段数据表 (relative field name for Javabean SysObjClob)
 * @author Honey
 * Create on 2023-04-27 22:47:38
 */
public class SysObjClob_F {

	private SysObjClob_F() {}

	public static final String id = "id";//唯一主键

	public static final String tenantId = "tenantId";//租户ID，用于区分不同业务，0表示共享租户

	public static final String creator = "creator";//创建人，用于找到责任人

	public static final String modifier = "modifier";//修改人，用于找到责任人

	public static final String createTime = "createTime";//创建时间

	public static final String modifyTime = "modifyTime";//修改时间

	public static final String status = "status";//状态，0:删除, 1:正常, 2:其他

	public static final String objId = "objId";//所属对象ID

	public static final String guid = "guid";//业务主键

	public static final String clob0 = "clob0";//大字段0值

	public static final String clob1 = "clob1";//大字段1值

	public static final String clob2 = "clob2";//大字段2值

	public static final String clob3 = "clob3";//大字段3值

	public static final String clob4 = "clob4";//大字段4值

	public static final String clob5 = "clob5";//大字段5值

	public static final String clob6 = "clob6";//大字段6值

	public static final String clob7 = "clob7";//大字段7值

	public static final String clob8 = "clob8";//大字段8值

	public static final String clob9 = "clob9";//大字段9值

	public static final String ENTITY_NAME = "SysObjClob";
	public static final String TABLE_NAME = "sys_obj_clob";
	public static final String ALL_NAMES = "id,tenantId,creator,modifier,createTime,modifyTime,status,objId,guid,clob0,clob1,clob2,clob3,clob4,clob5,clob6,clob7,clob8,clob9";
}