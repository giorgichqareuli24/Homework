class Library {
    private int id;
    private String name;

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("bibliotekis ID: " + id);
        System.out.println("bibliotekis saxeli: " + name);

        class Book {
            private int bookId;
            private String bookName;

            public Book(int bookId, String bookName) {
                this.bookId = bookId;
                this.bookName = bookName;
            }

            public void printBookInfo() {
                System.out.println("  wignis ID: " + bookId);
                System.out.println("  wignis saxeli: " + bookName);
            }
        }

        Book book = new Book(111, "Java Programming");
        book.printBookInfo();
    }
}
