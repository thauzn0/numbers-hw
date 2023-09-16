class Main {
  public static void main(String[] args) {

    Nums r1 = new RationalN(14, 10);
    Nums r2 = new RationalN(7, 5);
    ((RationalN) r1).getGcd(14, 10);
    ((RationalN) r2).getGcd(7, 5);
    // System.out.println(r1.toString());
    // System.out.println(r1.equals(r2));

    Nums c1 = new ComplexN(14, 9);
    // System.out.println(((ComplexN)c1).toString());
    // System.out.println(((ComplexN)c1).equals(new ComplexN(14, 9)));

    Nums re1 = new RealN(5);
    // System.out.println(((RealN) re1).equals(new RealN(5)));

    Nums in1 = new IntegerN(5);
    // System.out.println(((IntegerN) in1).equals(new IntegerN(5)));

    Nums l1 = new NaturalN(6);
    // System.out.println(((NaturalN) l1).equals(new NaturalN(6)));
  }
}