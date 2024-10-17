package com.solid.s.Good;

public class EmployeeRepository {
    public void save(GoodEmployee e) {

        System.out.printf("%s saved to database.\n", e.getName());
    }

}
