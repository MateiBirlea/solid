package com.solid.d;

import com.solid.d.Good.GoodPrintingService;
import com.solid.d.Good.HtmlInvoicePrinter;
import com.solid.d.bad.BadPrintingService;
import com.solid.i.Good.GoodInvoicePrinter;
import com.solid.i.Invoice;


public class DMain {

    public static void main(String[] args) {
//        testBadD();
        testGoodD();
    }

    private static void testBadD() {
        /*Invoice invoice = new Invoice(665);

        BadPrintingService badPrintingService = new BadPrintingService();
        badPrintingService.print(invoice);

        // now what?
        // badPrintingService = new BadPrintingService(new HtmlInvoicePrinter()); // but why!?*/
    }

    private static void testGoodD() {
        Invoice invoice = new Invoice(665);

        GoodPrintingService goodPrintingService = new GoodPrintingService(
                new GoodInvoicePrinter());
        goodPrintingService.print(invoice);

        goodPrintingService = new GoodPrintingService(new HtmlInvoicePrinter());
        goodPrintingService.print(invoice);
    }

}
