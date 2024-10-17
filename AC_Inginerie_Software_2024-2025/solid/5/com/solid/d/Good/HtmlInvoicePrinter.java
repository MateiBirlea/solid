package com.solid.d.Good;

import com.solid.i.Invoice;

public class HtmlInvoicePrinter {
    public void print(Invoice invoice)
    {
        System.out.println("<html>");
        System.out.println("<body>");
        System.out.println("<h1>Invoice #" + invoice + "</h1>");
        // Aici adaugă restul detalii ale facturii
        System.out.println("</body>");
        System.out.println("</html>");
    }
}
