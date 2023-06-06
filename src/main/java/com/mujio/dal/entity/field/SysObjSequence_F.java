package com.mujio.dal.entity.field;

/**
 * 模型自增ID记录表 (relative field name for Javabean SysObjSequence)
 * @author Honey
 * Create on 2023-04-27 22:47:38
 */
public class SysObjSequence_F {

	private SysObjSequence_F() {}

	public static final String id = "id";//唯一主键

	public static final String tenantId = "tenantId";//租户ID，用于区分不同业务，0表示共享租户

	public static final String creator = "creator";//创建人，用于找到责任人

	public static final String modifier = "modifier";//修改人，用于找到责任人

	public static final String createTime = "createTime";//创建时间

	public static final String modifyTime = "modifyTime";//修改时间

	public static final String status = "status";//状态，0:删除, 1:正常, 2:废弃

	public static final String objId = "objId";//模型ID

	public static final String fieldId = "fieldId";//模型字段ID

	public static final String minVal = "minVal";//最小值

	public static final String maxVal = "maxVal";//最大值

	public static final String currentVal = "currentVal";//当前值

	public static final String step = "step";//自增步长

	public static final String extInfo = "extInfo";//额外信息,冗余字段，用于后续扩展

	public static final String ENTITY_NAME = "SysObjSequence";
	public static final String TABLE_NAME = "sys_obj_sequence";
	public static final String ALL_NAMES = "id,tenantId,creator,modifier,createTime,modifyTime,status,objId,fieldId,minVal,maxVal,currentVal,step,extInfo";
}