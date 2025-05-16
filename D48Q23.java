public class D48Q23 {
    public static void main(String[] args) {
        int i = 1;
        for (;;) {
            i = i + 3;
            if (i < 10) {
                System.out.println(i);
                continue;
            } else {
                break;
            }
        }
    }
}
