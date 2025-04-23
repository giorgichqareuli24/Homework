import java.text.ParseException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ParseException {
//        1 სავარჯიშო
//        ArrayList<BasketballPlayer> players = new ArrayList<>();
//        players.add(new BasketballPlayer("Michael", "Jordan", 30, 8, 3, 5, 2));
//        players.add(new BasketballPlayer("LeBron", "James", 25, 7, 2, 8, 3));
//        players.add(new BasketballPlayer("Kobe", "Bryant", 28, 5, 1, 6, 4));
//
//        System.out.println("დასორტირებული რეიტინგის კლებადობით:");
//        Collections.sort(players, new BasketballPlayerComparator.ByRatingDescending());
//        for (BasketballPlayer player : players) {
//            System.out.println(player);
//        }
//
//        System.out.println("\nდასორტირებული რეიტინგის ზრდის მიხედვით:");
//        Collections.sort(players, new BasketballPlayerComparator.ByRatingAscending());
//        for (BasketballPlayer player : players) {
//            System.out.println(player);
//        }





//        2 სავარჯიშო
//        ArrayList<Student> students = new ArrayList<>();
//
//        students.add(new Student("Nino", "Beridze", new GregorianCalendar(2000, Calendar.MARCH, 15).getTime(),
//                new ArrayList<>(Arrays.asList(85, 90, 78))));
//        students.add(new Student("Giorgi", "Khutsishvili", new GregorianCalendar(1999, Calendar.JULY, 22).getTime(),
//                new ArrayList<>(Arrays.asList(92, 88, 95))));
//        students.add(new Student("Ana", "Makharadze", new GregorianCalendar(2001, Calendar.JANUARY, 10).getTime(),
//                new ArrayList<>(Arrays.asList(75, 80, 82))));
//
//        System.out.println("სტუდენტები დაულაგებლად:");
//        students.forEach(System.out::println);
//
//        students.sort(Comparator.comparing(Student::getLastName));
//        System.out.println("\nსტუდენტები ლექსიკოგრაფიულად (გვარის მიხედვით დალაგებული):");
//        students.forEach(System.out::println);
//
//        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
//        System.out.println("\nსტუდენტები საშუალო ქულების მიხედვით დალაგებული:");
//        students.forEach(System.out::println);
//
//        students.sort(Comparator.comparing(Student::getBirthDate));
//        System.out.println("\nსტუდენტები დაბადების თარიღის მიხედვით დალაგებული:");
//        students.forEach(System.out::println);







//        3 სავარჯიშო
//        List<Car> cars = new ArrayList<>();
//        cars.add(new Car("Toyota", "Camry", 2020, 45000, new Engine("ბენზინი", 4, 2.5)));
//        cars.add(new Car("BMW", "e60", 2008, 120000, new Engine("დიზელი", 10, 5.0)));
//        cars.add(new Car("Mercedes", "C63 amg", 2015, 30000, new Engine("ბენზინი", 8, 3.5)));
//        cars.add(new Car("Ford", "Mustang", 2019, 60000, new Engine("ბენზინი", 6, 6.2)));
//
//        System.out.println("დაულაგებელი სია:");
//        printCars(cars);
//
//        cars.sort(Comparator.comparingInt(Car::getYear));
//        System.out.println("\nდალაგებული გამოშვების წელის მიხედვით:");
//        printCars(cars);
//
//        cars.sort(Comparator.comparingInt(Car::getMileage));
//        System.out.println("\nდალაგებული გარბენის მიხედვით:");
//        printCars(cars);
//
//        cars.sort(Comparator.comparingDouble(Car::getEngineCapacity));
//        System.out.println("\nდალაგებული ძრავის მოცულობის მიხედვით:");
//        printCars(cars);
//    }
//
//    private static void printCars(List<Car> cars) {
//        for (Car : cars) {
//            System.out.println(car);
//        }

    }
}
