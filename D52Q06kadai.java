public class D52Q06kadai {
    public static void main(String[] args) {
        // ドリンクの準備
        Drink2[] dr = {
                new Drink2("Gomacola", 150),
                new Drink2("MrPepper", 130),
                new Drink2("Saltwater", 320)
        };

        // 自動販売機の準備
        VendingMachine2 vm = new VendingMachine2(dr);

        // ドリンク一覧の表示
        vm.display();

        // コマンドを配列にまとめる
        String[] scenario = {
                "i 100",
                "p 2",
                "i 500",
                "p 3",
                "c 0"
        };

        // 配列に格納されたコマンドを順に実行
        System.out.println("--------------------");
        for (String command : scenario) {
            System.out.println("コマンド: " + command);
            vm.execCom(command);
        }
    }
}

// 清涼飲料水の名前と価格を管理するクラス
class Drink2 {
    private String name;
    private int price;

    public Drink2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    public String toString() {
        return "[" + name + "] " + price + "円";
    }
}

// 自動販売機クラス
class VendingMachine2 {
    private Drink2[] drinks;
    private int cash = 0;
    private int[] coins = {500, 100, 50, 10};

    VendingMachine2(Drink2[] drinks) {
        this.drinks = drinks;
    }

    public void display() {
        int idx = 1;
        for (Drink2 drink : drinks) {
            System.out.println(" [" + idx + "]" + drink);
            idx++;
        }
    }

    public void execCom(String command) {
        String[] s = command.split(" ");
        switch (s[0]) {
            case "i":
                if (isCoin(s[1])) {
                    int insertedCash = Integer.parseInt(s[1]);
                    cash += insertedCash;
                    System.out.println(insertedCash + "円が投入されました。");
                } else {
                    System.out.println("不正な硬貨です。");
                }
                break;
            case "p":
                int idx = Integer.parseInt(s[1]) - 1;
                if (idx < 0 || idx >= drinks.length) {
                    System.out.println("商品番号が不正です。");
                    return;
                }
                int price = drinks[idx].getPrice();
                if (price <= cash) {
                    eject(idx);
                    cash -= price;
                } else {
                    System.out.println("お金が足りません。");
                }
                break;
            case "c":
                payChange();
                break;
            default:
                System.out.println("不正なコマンドです。");
                break;
        }
    }

    private boolean isCoin(String s) {
        try {
            int c = Integer.parseInt(s);
            for (int coin : coins) {
                if (c == coin) return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return false;
    }

    private void eject(int idx) {
        System.out.println(drinks[idx].getName() + "が排出されました。");
    }

    private void payChange() {
        if (cash == 0) {
            System.out.println("お釣り なし");
            return;
        }
        System.out.print("お釣り ");
        for (int coin : coins) {
            if (cash / coin > 0) {
                System.out.print(coin + "円:" + (cash / coin) + "枚 ");
                cash %= coin;
            }
        }
        System.out.println();
    }
}