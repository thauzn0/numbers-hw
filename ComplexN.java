public class ComplexN extends Nums {
  final double imaginaryNum;
  final double realNum;

  public ComplexN(double realNum, double imaginaryNum) {
    this.realNum = realNum;
    this.imaginaryNum = imaginaryNum;
  }

  public double getImaginaryPart() {
    return imaginaryNum;
  }

  public double getRealPart() {
    return realNum;
  }

  @Override
  public String toString() {
    if (this.imaginaryNum < 0) {
      return this.realNum + " - " + Math.abs(this.imaginaryNum) + "i";
    } else {
      return this.realNum + " + " + this.imaginaryNum + "i";
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof ComplexN) {
      ComplexN other = (ComplexN) o;
      for (int i = 0; i < this.toString().length(); i++) {
        if (this.toString().charAt(i) != other.toString().charAt(i))
          return false;
      }
    }
    return true;
  }
}