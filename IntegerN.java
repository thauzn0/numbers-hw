public class IntegerN extends Nums {
  final int value;

  public IntegerN(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof IntegerN) {
      IntegerN other = (IntegerN) o;
      return value == other.value;
    }
    return false;
  }
}