package com.solid.s.Good;

public class EmployeeTimetrackingService {
    public String reportHours(GoodEmployee e) {
        return String.format("%s worked %d hours.\n", e.getName(), e.getHours());
    }
}
