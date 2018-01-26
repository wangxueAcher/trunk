package com.zking.crmProject004.mapper;

import com.zking.crmProject004.model.CstLinkman;

public interface CstLinkmanMapper {
    int deleteByPrimaryKey(Long lkmId);

    int insert(CstLinkman record);

    int insertSelective(CstLinkman record);

    CstLinkman selectByPrimaryKey(Long lkmId);

    int updateByPrimaryKeySelective(CstLinkman record);

    int updateByPrimaryKey(CstLinkman record);
}