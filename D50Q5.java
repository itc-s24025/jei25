public class D50Q5 {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i -1; j >= 0 && num[j] > num[j + 1]; j--) {
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;
            }
        }

        for (int val : num) {
            System.out.print(val + " ");
        }
    }
}
