public class D53kadaiA {
    public static void main(String[] args) {
        int sum = 0;
        if (args.length == 0) {
            System.out.println("引数が指定されていません。");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            sum += num;
        }
        System.out.println("合計は " + sum + " です。");
    }
}
