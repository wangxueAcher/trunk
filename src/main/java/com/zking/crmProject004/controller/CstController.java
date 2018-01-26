package com.zking.crmProject004.controller;

import com.github.pagehelper.PageInfo;
import com.zking.crmProject004.biz.cst.ICstCustomerBiz;
import com.zking.crmProject004.model.CstCustomer;
import com.zking.crmProject004.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CstController {
    @Autowired
    private ICstCustomerBiz cstCustomerBiz;

    @ModelAttribute
    public void init(Model model, @ModelAttribute CstCustomer cstCustomer){
        model.addAttribute("cstCustomer",cstCustomer);

    }

    @RequestMapping("toListCustomer")
    public String toListCustomer(Model model,@ModelAttribute CstCustomer cstCustomer,HttpServletRequest request){

        PageBean pageBean = new PageBean();
        List<CstCustomer> cstCustomers = cstCustomerBiz.listCustomers(cstCustomer, pageBean);
        pageBean.setRequest(request);
        PageInfo pageInfo=new PageInfo(cstCustomers);

        pageBean.setPageRecord(3);
        pageBean.setTotalRecord(pageInfo.getTotal()+"");

        model.addAttribute("cstCustomers",cstCustomers);
        model.addAttribute("pageBean",pageBean);
        return "cst/cusList";
    }

    @RequestMapping("listCustomer")
    public String listCustomer(Model model,@ModelAttribute CstCustomer cstCustomer,HttpServletRequest request){
        System.out.println("aaaa");
        PageBean pageBean = new PageBean();
        List<CstCustomer> cstCustomers = cstCustomerBiz.listCustomers(cstCustomer, pageBean);
        pageBean.setRequest(request);
        PageInfo pageInfo=new PageInfo(cstCustomers);

        pageBean.setPageRecord(3);
        pageBean.setTotalRecord(pageInfo.getTotal()+"");

        model.addAttribute("cstCustomers",cstCustomers);
        model.addAttribute("pageBean",pageBean);
        System.out.println("bbbb");
        return "cusList";
    }

    @RequestMapping("toDetailCustomer")
    public String toDetailCustomer(Model model,@ModelAttribute CstCustomer cstCustomer){
     CstCustomer customer= cstCustomerBiz.loadCustomer(cstCustomer);
        model.addAttribute("customer",customer);

        return "cst/cusList";
    }
}
