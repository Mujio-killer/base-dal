package com.mujio.dal.model;

import lombok.Data;
import org.teasoft.bee.osql.api.Condition;

import java.util.List;

@Data
public class Criteria {

    String dataSourceName;

    String dataSourceType;

    int tenantId;

    String tableName;

    List<String> selectFields;

    Condition condition;
}
