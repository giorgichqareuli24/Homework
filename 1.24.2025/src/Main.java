public class Main {
    public static void main(String[] args) {

//        1 Savarjisho
        Writer writer1 = new Writer("John", "Doe");
        Writer writer2 = new Writer("Jane", "Smith");

        Book[] books = {
                new Book("Mystery of the Night", 250, "Mystery", writer1),
                new Book("Adventures in Wonderland", 320, "Adventure", writer2),
                new Book("The Silent Forest", 200, "Thriller", writer1)
        };

        for (Book book : books) {
            System.out.println(book);
        }


        System.out.println();
        System.out.println();
        System.out.println();


//        2 Savarjisho
        QuadraticEquation[] equations = {
                new QuadraticEquation(1, -3, 2),
                new QuadraticEquation(1, -2, 1),
                new QuadraticEquation(1, 2, 1),
                new QuadraticEquation(1, -3, 3)
        };

        int count = 0;
        for (int i = 0; i < equations.length; i++) {
            for (int j = i + 1; j < equations.length; j++) {
                if (equations[i].equals(equations[j])) {
                    count++;
                }
            }
        }

        System.out.println("Number of equal quadratic equations: " + count);

        for (QuadraticEquation eq : equations) {
            System.out.println(eq);
        }
    }
}