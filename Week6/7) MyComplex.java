public class MyComplex {

    // private instance variables
    private double real;
    private double imag;


    // constructors
    public MyComplex() {    //default
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {    // overloaded
        this.real = real;
        this.imag = imag;
    }

    // getters and setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // method to set both values at once
    public void setValue(double newReal, double newImag) {
        this.real = newReal;
        this.imag = newImag;
    }

    // toString method "3+4i"
    public String toString() {
        return real + "+" + imag + "i";
    }

    // boolean methods to check if real / imaginary parts = 0
    public boolean isReal() {
        return imag == 0;
    }
    public boolean isImaginary() {
        return real ==0;
    }

    // two different methods to compare two complex numbers
    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }
    public boolean equals(MyComplex another) {
        return (this.real == another.real) && (this.imag == another.imag);
    }

    // method to calculate magnitude
    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }


    /* two ways of adding complex numbers, c1 + right
       first method add into c1, returning the original instance c1, c1 changes
       second method only uses the values of c1 and right to create a new instance, c1 no change */
    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
}
