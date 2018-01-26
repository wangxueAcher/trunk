package cst;

import base.BaseTestCase;
import com.zking.crmProject004.biz.cst.ICstCustomerBiz;
import com.zking.crmProject004.model.CstCustomer;
import com.zking.crmProject004.util.PageBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class CstCustomerBizImplTest extends BaseTestCase {

@Autowired
private ICstCustomerBiz cstCustomerBiz;
private CstCustomer cstCustomer;


    @Override
    public void setUp() throws Exception {
        super.setUp();
        cstCustomer=new CstCustomer();

    }

    @Test
    public void listCustomers() {
         PageBean pageBean=new PageBean();
//        cstCustomer.setCustNo("0000");
//        cstCustomer.setCustName("客户");
        cstCustomer.setCustManagerName("h");
        List<CstCustomer> cstCustomers = cstCustomerBiz.listCustomers(cstCustomer, pageBean);
    for(CstCustomer c:cstCustomers){
    System.out.println(c);

}

    }

    @Test
    public void addCustomer() {

    }

    @Test
    public void loadCustomer() {
        cstCustomer.setCustNo("KH071207174");
        CstCustomer c = cstCustomerBiz.loadCustomer(cstCustomer);
        System.out.println(c);
    }

    @Test
    public void editCustomer() {
        cstCustomer.setCustNo("KH_20110824_00007");
        cstCustomer.setCustAddr("湖南");
        cstCustomer.setCustSatisfy(3);
        cstCustomerBiz.editCustomer(cstCustomer);
    }
}