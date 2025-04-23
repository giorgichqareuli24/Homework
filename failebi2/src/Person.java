class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void introduce() {
        System.out.println("გამარჯობა, ჩემი სახელია " + firstName + " " + lastName + " და მე ვარ " + age + " წლის.");
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public void printAdultStatus() {
        if (isAdult()) {
            System.out.println(firstName + " ზრდასრულია.");
        } else {
            System.out.println(firstName + " არაა ზრდასრული.");
        }
    }
}