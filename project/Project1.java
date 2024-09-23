//package project;
//
//import java.util.Scanner;
//
//public class Project1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the valid Employee id: ");
//        String eid = sc.nextLine();
//
//        Employee[] employee = {
//
//                new Employee("1001", "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000),
//                new Employee("1002", "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000),
//                new Employee("1003", "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000),
//                new Employee("1004", "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000),
//                new Employee("1005", "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000),
//                new Employee("1006", "Suman", "01/01/2000", "e", "Manufacturing", 23000, 9000, 4400),
//                new Employee("1007", "Tanmay", "12/06/2006", "c", "PM", 29000, 12000, 10000)
//        };
//
//        Employee emp = FindEmployeeById(employee,eid);
//        if(emp != null) {
//            String designation = getDesignation(emp.getDesignationCode());
//            int da = getDA(emp.getDesignationCode());
//            int salary = emp.getBasics() + emp.getHra() + emp.getIt() + da;
//            System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
//            System.out.println(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getDepartment() + "\t" + designation + "\t" + salary);
//
//        }
//        else{
//            System.out.println("Employee not found");
//        }
//        sc.close();
//    }
//}
