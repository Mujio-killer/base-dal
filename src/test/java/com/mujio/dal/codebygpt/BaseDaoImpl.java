package com.mujio.dal.codebygpt;

// 实现BaseDao接口
public class BaseDaoImpl<T, PK> implements BaseDao<T, PK> {

  // 通过泛型获取实体类类型
  private final Class<T> entityClass;

  public BaseDaoImpl(Class<T> entityClass) {
    this.entityClass = entityClass;
  }

  @Override
  public int insert(T entity) {
    String sql = "INSERT INTO " + entityClass.getSimpleName() + "(...) VALUES (...)";
    ...
  }

  @Override
  public int update(T entity) {
    String sql = "UPDATE " + table + " SET ... WHERE ...";
    ...
  }

  @Override
  public T getByPk(PK pk) {
    String sql = "SELECT * FROM " + entityClass.getSimpleName() + " WHERE id = ?";
    ...
  }

  @Override
  public int deleteByPk(PK pk) {
    String sql = "DELETE FROM " + entityClass.getSimpleName() + " WHERE id = ?";
    ...
  }

}
