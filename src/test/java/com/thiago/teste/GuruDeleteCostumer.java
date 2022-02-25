package com.thiago.teste;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruDeleteCostumer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InvokedMethodListener.class)
public class GuruDeleteCostumer {

    @Test
    public void guruDeleteCostumer() throws Exception {

        new PageGuruDeleteCostumer()
                .openPage(PageGuruDeleteCostumer.class, "http://demo.guru99.com/test/delete_customer.php")
                .deletecostumer("ola");
    }

}
