package com.mujio.dal.entity.field;

/**
 * 模型字段表 (relative field name for Javabean SysObjField)
 * @author Honey
 * Create on 2023-04-27 22:47:38
 */
public class SysObjField_F {

	private SysObjField_F() {}

	public static final String id = "id";//唯一主键

	public static final String tenantId = "tenantId";//租户ID，用于区分不同业务，0表示共享租户

	public static final String creator = "creator";//创建人，用于找到责任人

	public static final String modifier = "modifier";//修改人，用于找到责任人

	public static final String createTime = "createTime";//创建时间

	public static final String modifyTime = "modifyTime";//修改时间

	public static final String status = "status";//状态，0:删除, 1:正常, 2:其他

	public static final String objId = "objId";//所属对象ID

	public static final String name = "name";//字段名称

	public static final String labelName = "labelName";//别名，提高辨识度，长度不超过50

	public static final String comment = "comment";//字段说明

	public static final String colOrder = "colOrder";//字段顺序

	public static final String colType = "colType";//字段类型

	public static final String position = "position";//字段所属列

	public static final String length = "length";//字段长度，特殊字段无需判断

	public static final String allowNull = "allowNull";//是否允许为空，0:否， 1:是

	public static final String isPrimary = "isPrimary";//是否唯一，0:否， 1:是

	public static final String isRequired = "isRequired";//是否必填，0:否， 1:是

	public static final String isClob = "isClob";//是否为大字段，0:否， 1:是

	public static final String isIndex = "isIndex";//是否为索引，0:否， 1:是

	public static final String isUk = "isUk";//是否为联合索引，0:否， 1:是

	public static final String extInfo = "extInfo";//额外信息,冗余字段，用于后续扩展

	public static final String ENTITY_NAME = "SysObjField";
	public static final String TABLE_NAME = "sys_obj_field";
	public static final String ALL_NAMES = "id,tenantId,creator,modifier,createTime,modifyTime,status,objId,name,labelName,comment,colOrder,colType,position,length,allowNull,isPrimary,isRequired,isClob,isIndex,isUk,extInfo";
}