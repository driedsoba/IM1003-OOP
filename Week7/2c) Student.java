public class Student extends Person {  // Student is subclass of Person
    // Student is a Person

    // private instance variables
    private String program;
    private int year;
    private double fee;

    // invoking Person Superclass constructor for name and address parameters
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    // getters and setters
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    /* overriding Superclass toString method with @Override
      then invoking Superclass toString method with keyword super()
    */
    @Override
    public String toString() {
        return "Student[" + super.toString() +
                "," + "program=" + program +
                "," + "year=" +year +
                "," + "fee=" + fee +
                "]";
    }
}
