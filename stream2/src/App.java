import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class App {
    static List<Employee> employeeList = new ArrayList<>();

    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();
        employeeList = employeeFactory.getAllEmployee();

//        ორიგინალი კოდი
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }




//        2 სავარჯიშო
//        for (Employee emp : employeeList) {
//            if (emp.getFirstName().startsWith("A")) {
//                System.out.println(emp.getFirstName() + " " + emp.getLastName());
//            }
//        }




//        3 სავარჯიშო
//        List<Employee> joinedIn2023 = new ArrayList<>();
//
//        for (Employee emp : employeeList) {
//            String employeeId = emp.getId();
//            String yearJoined = employeeId.substring(0, 4);
//            if (yearJoined.equals("2023")) {
//                joinedIn2023.add(emp);
//            }
//        }
//
//        for (Employee emp : joinedIn2023) {
//            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " - " + emp.getId());
//        }




//        4 სავარჯიშო
//        Collections.sort(employeeList, (emp1, emp2) -> {
//            int nameComparison = emp1.getFirstName().compareTo(emp2.getFirstName());
//
//            if (nameComparison == 0) {
//                return Integer.compare(emp1.getSalary(), emp2.getSalary());
//            }
//
//            return nameComparison;
//        });
//
//        for (Employee emp : employeeList) {
//            System.out.println(emp.getFirstName() + " " + emp.getLastName() + " - " + emp.getSalary());
//        }

    }
}











