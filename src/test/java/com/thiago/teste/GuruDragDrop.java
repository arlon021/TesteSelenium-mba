package com.thiago.teste;

import com.thiago.core.InvokedMethodListener;
import com.thiago.page.PageGuruDragDrop;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(InvokedMethodListener.class)
public class GuruDragDrop {

    @Test
    public void guruDradDrop() throws Exception {
        new PageGuruDragDrop()
                .openPage(PageGuruDragDrop.class, "https://demo.guru99.com/test/drag_drop.html")
                .arrastar();
    }

}
