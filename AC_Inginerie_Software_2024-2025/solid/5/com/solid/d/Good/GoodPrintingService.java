package com.solid.d.Good;

import com.solid.i.Good.GoodInvoicePrinter;
import com.solid.i.Invoice;

public class GoodPrintingService {
    private GoodInvoicePrinter p;
    private HtmlInvoicePrinter h;
    public GoodPrintingService(HtmlInvoicePrinter g)
    {
        this.h=g;
    }
    public GoodPrintingService(GoodInvoicePrinter d)
    {
        this.p=d;
    }
    public void print(Invoice inovice)
    {
        if(p==null)
            this.h.print(inovice);
        else
            this.p.print(inovice);
    }

    public HtmlInvoicePrinter getH() {
        return h;
    }

    public void setH(HtmlInvoicePrinter h) {
        this.h = h;
    }
}
