public class RationalN extends Nums {
  final int numerator;
  final int denominator;
  private int gcd;

  public RationalN(int numerator, int denominator) {
    if (denominator == 0) {
      // System.out.println("Arithmetic Exception");
      throw new ArithmeticException("Arithmetic Exception");
    } else {
      this.numerator = numerator;
      this.denominator = denominator;
    }
  }

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public double getResult() {
    return Double.parseDouble(this.toString());
  }

  public int getGcd(int a, int b) {
    // stores minimum(a, b)
    int i;
    if (a < b)
      i = a;
    else
      i = b;

    // take a loop iterating through smaller number to 1
    for (i = i; i > 1; i--) {

      // check if the current value of i divides both
      // numbers with remainder 0 if yes, then i is
      // the GCD of a and b
      if (a % i == 0 && b % i == 0) {
        this.gcd = i;
        return i;
      }
    }

    // if there are no common factors for a and b other
    // than 1, then GCD of a and b is 1
    this.gcd = 1;
    return 1;
  }

  @Override
  public String toString() {
    int reducedNumerator = this.numerator / this.gcd; // 1
    int reducedDenominator = this.denominator / this.gcd; // 1

    if (reducedDenominator == 0)
      return Double.toString(reducedNumerator);
    else if (reducedNumerator == 0)
      return "0";
    else
      return reducedNumerator + "/" + reducedDenominator;
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof RationalN) {
      RationalN other = (RationalN) o;
      for (int i = 0; i < this.toString().length(); i++) {
        if (this.toString().charAt(i) != other.toString().charAt(i))
          return false;
      }
    }
    return true;
  }
}