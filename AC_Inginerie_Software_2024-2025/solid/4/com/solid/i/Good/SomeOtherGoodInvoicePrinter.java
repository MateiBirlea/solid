package com.solid.i.Good;

import com.solid.i.Invoice;

public class SomeOtherGoodInvoicePrinter implements SomeOtherGoodInvoicePrinter_I{
    @Override
    public void someOtherPrintMethod(Invoice invoice) {
        System.out.println("Printing the invoice in a totally different way "
                + invoice);
    }
}
