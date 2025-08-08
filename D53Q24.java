public class D53Q24 {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++) {
            System.out.println(n + " ");
            switch (n) {
                case 2:
                    n *= 3;
                    break;
                case 7:
                    n -= 3;
                    break;
                case 6:
                    n += 3;
                    break;
            }
        }
    }
}
