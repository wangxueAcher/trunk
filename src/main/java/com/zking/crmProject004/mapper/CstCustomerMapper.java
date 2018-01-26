package com.zking.crmProject004.mapper;

import com.zking.crmProject004.model.CstCustomer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CstCustomerMapper {
    int deleteByPrimaryKey(String custNo);

    //  销售模块客户开发成功新增客户记录：客户名称，联系人，联系电话，客户状态
    int insert(CstCustomer record);
    int insertSelective(CstCustomer record);
    //查单个客户
    CstCustomer selectByPrimaryKey(String custNo);

    int updateByPrimaryKeySelective(CstCustomer record);
    //编辑客户信息
    int updateByPrimaryKey(CstCustomer record);
    //根据客户状态、编号、名称、客户经理、客户等级、经理查所有客户
    List<CstCustomer> listCustomers(CstCustomer customer);

}