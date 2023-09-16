public class RealN extends Nums {
  final double value;

  public RealN(double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }

  @Override
  public String toString() {
    return Double.toString(value);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof RealN) {
      RealN other = (RealN) o;
      return this.value == other.value;
    }
    return false;
  }
}
