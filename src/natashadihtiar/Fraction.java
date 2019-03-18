package natashadihtiar;

public class Fraction {


    double numerator =0;
    double denominator = 0;

    public void setNumerator(double numerator) {

        this.numerator = numerator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }
        public double getNumerator() {
            return numerator;
        }

        public double getDenominator() {
            return denominator;
        }


     public String backFraction(){

        return this.getDenominator()+ "/" + this.getNumerator();

         }



    public Fraction() {
    }

    public Fraction(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }


    public String toString()

    {
        return this.getNumerator() + "/" + this.getDenominator() ;
    }


}
