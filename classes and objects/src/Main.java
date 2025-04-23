public class Main {
    public static void main(String[] args) {

        Book myBook1 = new Book("Mamis mkvleli", "Aleqsandre kazbegi", 180);
        myBook1.displayBookInfo();


        System.out.println();


        Book myBook2 = new Book("Sherlock Holmes", "Artur Conan Doyle");
        myBook2.displayBookInfo();


        System.out.println();


        Rectangle myRectangle = new Rectangle(7.0, 4.0);
        myRectangle.displayRectangleInfo();


        System.out.println();


        Time myTime = new Time(15, 24, 55);
        myTime.displayTimeInfo();
    }
}
