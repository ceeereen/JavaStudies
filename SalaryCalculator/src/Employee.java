import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class Employee {
    String name;
    BigDecimal salary;
    int workHours;
    LocalDate hireYear;

    public Employee(String name, BigDecimal salary, int workHours, LocalDate hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //calculate tax
    public void tax(){
        if(salary.compareTo(BigDecimal.valueOf(1000)) < 0){
            System.out.println("Tax will not be applied.");
         // if salary is over 1000 %3 tax is applied.
        }else{
            this.setSalary(this.getSalary().subtract(this.getSalary().multiply(BigDecimal.valueOf(3).divide(BigDecimal.valueOf(100)))));
            System.out.println(this.getSalary());
        }
    }

    //calculate payment for bonus hours
    public void bonus(){
        if(this.getWorkHours()>40){
            int bonusHours = this.getWorkHours() - 40;
            //add bonus hour payment to salary
            this.setSalary(this.getSalary().add(BigDecimal.valueOf(bonusHours).multiply(BigDecimal.valueOf(30))));
            System.out.println(this.getSalary());
        } else{
            System.out.println("No bonus hour in this mounth.");
        }
    }

    public  void  raiseSalary(){
        LocalDate date = LocalDate.ofYearDay(2021,1);
        int differnceBetweenDates = date.compareTo(this.getHireYear());
        if(differnceBetweenDates<10){
            this.setSalary(this.getSalary().add(this.getSalary().multiply(BigDecimal.valueOf(5)).divide(BigDecimal.valueOf(100))));
            System.out.println(this.getSalary());
        } else if (differnceBetweenDates>9&&differnceBetweenDates<20) {
            this.setSalary(this.getSalary().add(this.getSalary().multiply(BigDecimal.valueOf(10)).divide(BigDecimal.valueOf(100))));
            System.out.println(this.getSalary());
        } else {
            this.setSalary(this.getSalary().add(this.getSalary().multiply(BigDecimal.valueOf(15)).divide(BigDecimal.valueOf(100))));
            System.out.println(this.getSalary());
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public LocalDate getHireYear() {
        return hireYear;
    }

    public void setHireYear(LocalDate hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
