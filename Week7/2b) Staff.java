public class Staff extends Person {    // subclass of Person
    // Staff is a person

    // private instance variables unique to Staff
    private String school;
    private double pay;

    // invoking Person superclass constructor for name and address parameters
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    // getters and setters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /* overriding Superclass toString method with @Override
       then invoking Superclass toString method with keyword super()
     */
    public String toString() {
        return "Staff[" + super.toString() +
                "," + "school=" + this.school +
                "," + "pay=" + this.pay +
                "]";
    }
}
