class A {
    public void mul(int a, int b) {
        System.out.println(a + " X " + b + " = " + (a * b));
    }

    public void mul(int a, int b, int c) {
        System.out.println(a + " X " + b + " X " + c + " = " + (a * b * c));
    }

    public void mul(double a, double b) {
        System.out.println(a + " X " + b + " = " + (a * b));
    }

    public void mul(double a, double b, double c) {
        System.out.println(a + " X " + b + " X " + c + " = " + (a * b * c));
    }
}

class methodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.mul(17,9);
        obj.mul(42.12,32.12);
        obj.mul(2.9, 1.2, 3.6);
    }
}
