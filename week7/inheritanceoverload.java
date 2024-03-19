class A {
    public void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b));
    }
}

class B extends A {
    public void add(double a, double b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    public void add(double a, double b, double c) {
        System.out.println(a + " + " + b + " + " + c + " = " + (a + b));
    }
}

class methodOverloadingin {
    public static void main(String[] args) {
        B obj = new B();
        obj.add(10,71);
        obj.add(12.45,65.28);
        obj.add(82.47,41.06,87.08);
    }
}
