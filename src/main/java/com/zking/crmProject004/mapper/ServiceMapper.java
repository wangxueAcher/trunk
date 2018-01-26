package com.zking.crmProject004.mapper;

import com.zking.crmProject004.model.Service;

public interface ServiceMapper {
    int deleteByPrimaryKey(Long svrId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long svrId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}