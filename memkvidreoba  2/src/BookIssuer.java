public class BookIssuer extends Employee {
    private String startTime;
    private String endTime;

    public BookIssuer(String firstName, String lastName, int id, String startTime, String endTime) {
        super(firstName, lastName, id);
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void printWorkingHours() {
        System.out.println(getFullName() + " works from " + startTime + " to " + endTime);
    }
}
