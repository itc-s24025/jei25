public class D53Q22 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    break;
                }
            }
            if (i % 4 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
