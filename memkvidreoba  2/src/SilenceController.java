public class SilenceController extends Employee {
    private double strictness;

    public SilenceController(String firstName, String lastName, int id, double strictness) {
        super(firstName, lastName, id);
        this.strictness = strictness;
    }

    public void printStrictness() {
        System.out.println(getFullName() + " controls silence with strictness level: " + strictness);
    }
}
