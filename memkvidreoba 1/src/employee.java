class employee extends Person {
    private String employeeID;

    public employee(String firstName, String lastName, int age, String employeeID) {
        super(firstName, lastName, age);
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
}
