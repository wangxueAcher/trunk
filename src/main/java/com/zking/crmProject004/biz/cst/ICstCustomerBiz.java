package com.zking.crmProject004.biz.cst;

import com.zking.crmProject004.model.CstCustomer;
import com.zking.crmProject004.util.PageBean;

import java.util.List;

public interface ICstCustomerBiz {

    List<CstCustomer> listCustomers(CstCustomer customer, PageBean pageBean);
    void addCustomer(CstCustomer customer);
    CstCustomer loadCustomer(CstCustomer customer);
    void editCustomer(CstCustomer customer);


}
