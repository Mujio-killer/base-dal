package com.mujio.dal.codebygpt;
// 定义接口，作为所有dal层接口的标准，包括基本增删改查方法
public interface BaseDao<T, PK> {

  public int insert(T entity);

  public int update(T entity);

  public T getByPk(PK pk);

  public int deleteByPk(PK pk);

}




