package exam_questions;

class Test2 {

    static int x = 5;

    static {
        x += 5;
        System.out.print("Static ");
    }

    {
        x += 2;
        System.out.print("Instance ");
    }

    public Test2() {
        x += 3;
        System.out.print("Constructor ");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(x);
    }
}

