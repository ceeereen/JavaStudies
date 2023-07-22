import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("kemal", BigDecimal.valueOf(2000),45, LocalDate.ofYearDay(1985,1));
        employee.tax();
        employee.bonus();
        employee.raiseSalary();
    }
}