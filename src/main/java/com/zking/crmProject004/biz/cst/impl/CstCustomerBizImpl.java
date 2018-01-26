package com.zking.crmProject004.biz.cst.impl;

import com.zking.crmProject004.biz.cst.ICstCustomerBiz;
import com.zking.crmProject004.mapper.CstCustomerMapper;
import com.zking.crmProject004.model.CstCustomer;
import com.zking.crmProject004.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CstCustomerBizImpl implements ICstCustomerBiz {
    @Autowired
    private CstCustomerMapper cstCustomerMapper;

    @Override
    public List<CstCustomer> listCustomers(CstCustomer customer, PageBean pageBean) {
        return cstCustomerMapper.listCustomers(customer);
    }

    @Override
    public void addCustomer(CstCustomer customer) {
        cstCustomerMapper.insert(customer);
    }

    @Override
    public CstCustomer loadCustomer(CstCustomer customer) {
        return cstCustomerMapper.selectByPrimaryKey(customer.getCustNo());
    }

    @Override
    public void editCustomer(CstCustomer customer) {
        cstCustomerMapper.updateByPrimaryKey(customer);
    }
}
