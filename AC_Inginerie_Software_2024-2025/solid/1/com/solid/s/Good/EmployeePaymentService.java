package com.solid.s.Good;

public class EmployeePaymentService {
  private EmployeeAdditionalPaymentService payment_per_hour;
  public EmployeePaymentService(EmployeeAdditionalPaymentService m)
  {
      payment_per_hour=m;
  }
  public void calculatePay(GoodEmployee e)
  {
      System.out.println("Payment:"+payment_per_hour.Additional(e)*e.getHours());
  }
}
