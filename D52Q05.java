public class D52Q05 {
    public static void main(String[] args) {
        String majors = "+----";

        int LIMIT = 400;    // 整数の上限

        if (args.length == 0) return;   // 整数値が一つも指定されていないとき return で終了

        int max = 0, i = 0;

        int[] data = new int[args.length];

        for (String s : args) {
            data[i] = Integer.parseInt(s);

            if (data[i] <= 0 || data[i] >= LIMIT) return;   // 0以上 LIMIT以下 であれば実行、でなければ return で終了

            if (max < data[i]) {    // 最大値 max の記録
                max = data[i];
            }
            i++;
        }

        // 目盛り表示
        int majormax = (max - 1) / 5 + 1;   // 目盛り行の長さを計算

        System.out.print("       ");

        for (i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % 5));
        }
        System.out.println("");

        // グラフ表示
        for (i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);

            int n = (data[i] - 1) / 5 + 1;  // 5単位で棒グラフの長さを決めている

            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
