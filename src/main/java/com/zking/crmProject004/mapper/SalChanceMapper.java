package com.zking.crmProject004.mapper;

import com.zking.crmProject004.model.SalChance;
import org.springframework.stereotype.Repository;

@Repository
public interface SalChanceMapper {
    int deleteByPrimaryKey(Long chcId);

    int insert(SalChance record);

    int insertSelective(SalChance record);

    SalChance selectByPrimaryKey(Long chcId);

    int updateByPrimaryKeySelective(SalChance record);

    int updateByPrimaryKey(SalChance record);
}