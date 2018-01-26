package com.zking.crmProject004.mapper;

import com.zking.crmProject004.model.CstLost;

public interface CstLostMapper {
    int deleteByPrimaryKey(Long lstId);

    int insert(CstLost record);

    int insertSelective(CstLost record);

    CstLost selectByPrimaryKey(Long lstId);

    int updateByPrimaryKeySelective(CstLost record);

    int updateByPrimaryKey(CstLost record);
}