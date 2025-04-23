class Manager extends employee {
    private String managerID;

    public Manager(String firstName, String lastName, int age, String employeeID, String managerID) {
        super(firstName, lastName, age, employeeID);
        this.managerID = managerID;
    }

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }
}
