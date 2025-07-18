public class D52Q17 {
    public static void main(String[] args) {
        int x = 1;
        for (int i = 0; i < 10 || x < 10; i++) {
            x += i;
            System.out.println(x + ", ");
        }
    }
}
