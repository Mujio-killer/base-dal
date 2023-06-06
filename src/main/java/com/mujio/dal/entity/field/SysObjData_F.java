package com.mujio.dal.entity.field;

/**
 * 模型数据表 (relative field name for Javabean SysObjData)
 * @author Honey
 * Create on 2023-04-27 22:47:38
 */
public class SysObjData_F {

	private SysObjData_F() {}

	public static final String id = "id";//唯一主键

	public static final String tenantId = "tenantId";//租户ID，用于区分不同业务，0表示共享租户

	public static final String creator = "creator";//创建人，用于找到责任人

	public static final String modifier = "modifier";//修改人，用于找到责任人

	public static final String createTime = "createTime";//创建时间

	public static final String modifyTime = "modifyTime";//修改时间

	public static final String status = "status";//状态，0:删除, 1:正常, 2:其他

	public static final String objId = "objId";//所属对象ID

	public static final String guid = "guid";//业务主键

	public static final String uniqueId = "uniqueId";//唯一主键

	public static final String uk = "uk";//联合索引

	public static final String val0 = "val0";//字段0值

	public static final String val1 = "val1";//字段1值

	public static final String val2 = "val2";//字段2值

	public static final String val3 = "val3";//字段3值

	public static final String val4 = "val4";//字段4值

	public static final String val5 = "val5";//字段5值

	public static final String val6 = "val6";//字段6值

	public static final String val7 = "val7";//字段7值

	public static final String val8 = "val8";//字段8值

	public static final String val9 = "val9";//字段9值

	public static final String val10 = "val10";//字段10值

	public static final String val11 = "val11";//字段11值

	public static final String val12 = "val12";//字段12值

	public static final String val13 = "val13";//字段13值

	public static final String val14 = "val14";//字段14值

	public static final String val15 = "val15";//字段15值

	public static final String val16 = "val16";//字段16值

	public static final String val17 = "val17";//字段17值

	public static final String val18 = "val18";//字段18值

	public static final String val19 = "val19";//字段19值

	public static final String idx0 = "idx0";//索引0值

	public static final String idx1 = "idx1";//索引1值

	public static final String idx2 = "idx2";//索引2值

	public static final String ENTITY_NAME = "SysObjData";
	public static final String TABLE_NAME = "sys_obj_data";
	public static final String ALL_NAMES = "id,tenantId,creator,modifier,createTime,modifyTime,status,objId,guid,uniqueId,uk,val0,val1,val2,val3,val4,val5,val6,val7,val8,val9,val10,val11,val12,val13,val14,val15,val16,val17,val18,val19,idx0,idx1,idx2";
}