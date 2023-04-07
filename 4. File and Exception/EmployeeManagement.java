import java.io.*;
import java.util.*;

public class EmployeeManagement {
    static String FileName = "employees.txt";

    static class Employee {
        String name;
        int salary;
        int id;
        String designation;

        public Employee(String name, int salary, int id, String designation) {
            this.name = name;
            this.salary = salary;
            this.id = id;
            this.designation = designation;
        }

        @Override
        public String toString() {
            return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", designation=" + designation + "]";
        }
    }

    static void addEmployee(List<Employee> employees) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee designation: ");
        String designation = scanner.nextLine();

        Employee employee = new Employee(name, salary, id, designation);
        employees.add(employee);
        System.out.println("Employee added successfully!\n");
        try {
            File file = new File(FileName);
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(employee.name + "," + employee.salary + "," + employee.id + "," + employee.designation);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Employee details saved to file.");
        
       
    }

    static void displayAllEmployees(List<Employee> employees) {
        System.out.println("All employee details:");
        try {
            File file = new File(FileName);
            FileReader fr = new FileReader(file.getAbsoluteFile());
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);   
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            addEmployee(employees);
            System.out.print("Do you want to add another employee? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        
        displayAllEmployees(employees);

    }
}
