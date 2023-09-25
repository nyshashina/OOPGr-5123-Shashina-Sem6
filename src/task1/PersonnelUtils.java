package task1;

import task1.Employee;

public class PersonnelUtils {

    public static int calculateNetSalary(Employee employee) {
        int bs = employee.getBaseSalary();
        int tax = (int) (bs * 0.25);//calculate in otherway
        return bs - tax;
    }
}
