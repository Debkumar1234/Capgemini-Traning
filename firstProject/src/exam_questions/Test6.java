package exam_questions;

public class Test6 {

    static int a = 10;
    int b = 5;

    Test6() {
        a += 5;
        b += 5;
    }

    void update(int a) {
        this.a = a + b;
        b += 10;
        show();
    }

    void show() {
        System.out.print(a + " " + b + " ");
    }

    public static void main(String[] args) {
    	Test6 d1 = new Test6();
    	Test6 d2 = new Test6();

        d1.update(5);
        d2.show();
    }
}

