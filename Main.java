class PayrollSystem {

    // a. Basic calculation using just employeeID (e.g., fetching a fixed base salary)
    public void computeSalary(int employeeID) {
        double baseSalary = 3000.00; 
        System.out.println("ID: " + employeeID + " | Base Salary: $" + baseSalary);
    }

    // b. Using hours_worked and rate
    public void computeSalary(double hoursWorked, double rate) {
        double total = hoursWorked * rate;
        System.out.println("Hourly Employee | Total: $" + total);
    }

    // c. ID with bonus
    public void computeSalary(int employeeID, double bonus) {
        double base = 3000.00;
        double total = base + bonus;
        System.out.println("ID: " + employeeID + " | Salary with Bonus: $" + total);
    }

    // d. Annual salary (converting to monthly)
    public void computeSalary(double annualSalary) {
        double monthly = annualSalary / 12;
        System.out.println("Annual Contract | Monthly Equivalent: $" + monthly);
    }

    // e. With overtime
    public void computeSalary(double regularPay, int overtimeHours, double overtimeRate) {
        double total = regularPay + (overtimeHours * overtimeRate);
        System.out.println("Salary with Overtime | Total: $" + total);
    }

    // f. With deductions (e.g., tax or insurance)
    // FIX: Added 'String deductionType' to make the method signature unique from Scenario B.
    public void computeSalary(double basePay, String deductionType, double deductions) {
        double total = basePay - deductions;
        System.out.println("Salary after " + deductionType + " Deductions | Net: $" + total);
    }

    // g. With bonus and deductions
    public void computeSalary(double basePay, double bonus, double deductions) {
        double total = (basePay + bonus) - deductions;
        System.out.println("Comprehensive (Bonus & Deductions) | Net: $" + total);
    }
}

public class Main {
    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        System.out.println("--- Employee Payroll Computations ---");
        
        // Examples of calling the overloaded methods
        payroll.computeSalary(101);                                 // Scenario A
        payroll.computeSalary(40.0, 25.0);                          // Scenario B
        payroll.computeSalary(102, 500.0);                          // Scenario C
        payroll.computeSalary(60000.0);                             // Scenario D
        payroll.computeSalary(2500.0, 10, 35.0);                    // Scenario E
        payroll.computeSalary(3000.0, "Health Insurance", 150.0);   // Scenario F (Added to test)
        payroll.computeSalary(3000.0, 150.0, 50.0);                 // Scenario G
    }
}