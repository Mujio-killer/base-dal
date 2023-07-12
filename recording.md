# base-dal 元数据引擎

迭代记录：
## 20230519
>完成多数据源接口的开发
## 20230520 - 20230521
dal统一入口开发
#### 实现思路：
> 入口为统一的service层，如List<CommonObjData> CrudService.query(Criteria criteria, String modelName);
具体实现为 DataSourceConfig.get(criteria).query(modelName, Condition);

## 20230604
> 开发过程中发现查询等方法首先比较大，模型初始化必须new，int等类型会有默认值，导致查询受限

## 20230606
> 实现多数据源切换查询；
> 发现Bee框架受限越来越多，准备重构，转投Mybatis-plus怀抱

## 20230611
> 转为Mybatis-plus,实现基本功能
> 预期实现通用查询方法： 
通用查询 
select(List<Fields>).from(String tableName).where(Condition condition);
通用更新
update()


