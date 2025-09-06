import java.util.Scanner;

interface Calculate {
    void calculateSalary();
}

class Regularemp implements Calculate {
    int BP = 25000;
    int HRA = 15000;
    int TA = 5000;

    public void calculateSalary() {
        System.out.println("Basic Pay of regularemp: " + BP);
        System.out.println("House Rent Allowance of regularemployee: " + HRA);
        System.out.println("Travel Allowance of regularemployee: " + TA);
        System.out.println("Regular Employee totalSalary is: " + (BP + HRA + TA));
    }
}

class Contractemp implements Calculate {
    int BP = 12000;
    int TA = 3000;

    public void calculateSalary() {
        System.out.println("Basic Pay of contractemployee: " + BP);
        System.out.println("Travel Allowance of contractemployee: " + TA);
        System.out.println("Contract Employee totalSalary is: " + (BP + TA));
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee name: ");
        String name = sc.nextLine();
        System.out.println("enter the empolyee type (Regular/Contract): ");
        String type = sc.nextLine();
        System.out.println("Employee name is: " + name);
        if (type.toUpperCase().equals("REGULAR")) {
            Calculate emp1 = new Regularemp();
            emp1.calculateSalary();
        } else if (type.toUpperCase().equals("CONTRACT")) {
            {
                Calculate emp2 = new Contractemp();
                emp2.calculateSalary();
            }
        }else {
            System.out.println("Invalid employee type.");
        }
    }
}