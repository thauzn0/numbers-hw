public class NaturalN extends Nums {
  final int value;

  public NaturalN(int value) {
    if (value < 0) {
      // System.out.println("Arithmetic Exception");
      throw new ArithmeticException("Arithmetic Exception");
    }
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof NaturalN) {
      NaturalN other = (NaturalN) o;
      return this.value == other.value;
    }
    return false;
  }
}