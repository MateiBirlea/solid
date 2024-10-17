package com.solid.s.Good;

public class EmployeeAdditionalPaymentService {
    public int Additional(GoodEmployee employee)
    {
        switch (employee.getStatus()) {
            case "A":
                return 1;
            case "B":
                return 2;
            default:
                return 0;
        }
    }
}
