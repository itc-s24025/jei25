public class D51Q5kadai {
    public static void main(String[] args) {
        // Double.MAX_VALUE doubleの最大値 57.0以上の場合
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};
        double[] unit = {0.0, 2.0, 3.0, 5.0};   // 単位
        int[] rate = {0, 20, 18, 15};           // 従量料金単価
        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }
        double amount = Double.parseDouble(args[0]);
        if (amount < 0) {
            System.out.println("0.0以上の使用量を入力");
            return;
        }

        int i, price = 1300;    //int i, i の宣言をしているだけ初期化はしていない price = 1200 基本使用料
        for (i = 1; amount >= level[i]; i++) {
            price += (int) ((level[i] - level[i - 1]) / unit[i]) * rate[i];     // 57.0未満の計算
        }
        price += (int) Math.ceil((amount - level[i - 1]) / unit[i]) *  rate[i]; // 57.0以上の計算
        System.out.println("今月のガス料金 " + price + "円");
    }
}
