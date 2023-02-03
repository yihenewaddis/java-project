package number2;
import java.util.Scanner;
public class  EmployeeTest {
    int employ_number;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee first = new Employee("yihenew", "addis", 1203346, 2000);
        Employee second = new Employee("alemu", "bekelle", 1203347, 1500);
        System.out.println("");
        System.out.println("employee information and yearly salary");
        System.out.println("-----------------------------------------------------------");
        System.out.println("first name= " + first.getFirst_name());
        System.out.println("father name= " + first.getFather_name());
        System.out.println("id number= " +first.getId_number() )  ;
        System.out.println("monthly salary= " + first.getMonthly_salary());
        System.out.println("yearly salary= " + first.getYearlySalary());
        System.out.println(" ");
        System.out.println("employee information and yearly salary after raised by 50%");
        System.out.println("-----------------------------------------------------------");
        System.out.println("first name=  " +  second.getFirst_name());
        System.out.println("father name=  " +  second.getFather_name());
        System.out.println("id number=  " +  second.getId_number() );
        System.out.println("monthly salary=  " +  second.getMonthly_salary());
        System.out.println("monthly salary after rised=  " +second.getRaiseSalary());
        System.out.println("**********************************************************************************************");
        System.out.println(" ");
        for (int i = 0; i <= 0; i++) {
            System.out.println("would you went to set some information about the employ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("press  1   if you went...\npress  0  if you don't went ..");
            System.out.println(" ");
            int choice = input.nextInt();
            if (choice == 0)
                break;
            else {

                System.out.println("which employee information do you went to set");
                System.out.println("press 1 for employee 1");
                System.out.println("press 2 for employee 2");
                int employ_number = input.nextInt();
                System.out.println(" ");
                    System.out.println("please set all employee "+employ_number+" information properly");
                System.out.println("-----------------------------------------------------------");
                System.out.println(" ");
                String name = input.nextLine();
                    System.out.print("please inter first name=");
                    String first_name=input.nextLine();
                System.out.println(" ");
                    System.out.print("please inter father name=");
                    String father_name=input.nextLine();
                System.out.println(" ");
                    System.out.print("please inter id=");
                    int id_number=input.nextInt();
                System.out.println(" ");
                    System.out.print("please inter monthly_salary=");
                    double monthly_salary=input.nextDouble();
                System.out.println("---------------------------------------------------------------");
                System.out.println(" you have finished your set operations  bye bye");
                System.out.println("---------------------------------------------------------------");
            }
        }
    }
}
class Employee {
    private String first_name;
    private String father_name;
    private int id_number;
    private double monthly_salary;

    public Employee(String first_name, String father_name, int id_number, double monthly_salary) {
        this.first_name = first_name;
        this.father_name = father_name;
        this.id_number = id_number;

        if (monthly_salary < 0.0) {
            this.monthly_salary = 0.0;
        } else {
            this.monthly_salary = monthly_salary;
        }
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public int getId_number() {
        return id_number;
    }

    public void setMonthly_salary(double monthly_salary) {
        if (monthly_salary < 0.0) {
            this.monthly_salary = 0.0;
        }
        else {
            this.monthly_salary = monthly_salary;
        }
    }

    public double getMonthly_salary() {
        return monthly_salary;
    }

    // method to retrieve yearly salary
    public double getYearlySalary() {
        double yearlySalary = monthly_salary * 12;
        return yearlySalary;
    }

    public double getRaiseSalary() {
        double raise = monthly_salary * 0.5;
        double raiseSalary = (monthly_salary + raise) * 12;
        return raiseSalary;
    }


}
