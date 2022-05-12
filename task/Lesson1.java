public class Lesson1 {
    public static void main(String[] arg) {
        String greeting1 = "HelloWorld";
        String greeting2 = "Hello";
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                System.out.println(greeting1);
            } else {
                System.out.println(greeting2);
            }
        }
    }
}
