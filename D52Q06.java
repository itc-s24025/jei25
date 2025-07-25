public class D52Q06 {
    public static void main(String[] args) {
        Drink[] dr = {
        new Drink("Gomacola", 150),
        new Drink("MrPepper", 130),
        new Drink("Saltwater", 320)
        };

        // 自動販売機の準備
        VendingMachine vm = new VendingMachine(dr);

        vm.display();
        vm.execCom("i 100");    // 硬貨を自動販売機に投下
        vm.execCom("p 2");      // 指定した飲料水を購入する
        vm.execCom("i 500");    // 硬貨を自動販売機に投入
        vm.execCom("p 3");      // 指定した飲料水を購入する
        vm.execCom("c 0");      // お金を払い出す
    }
}

// 清涼飲料水の名前と価格を管理するクラス
class Drink {
    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    // 名前と価格の文字列を返す
    public String toString() {
        return "[" + name + "] " + price + "円";
    }
}

// 自動販売機クラス
class VendingMachine {
    private Drink[] drinks;
    private int cash = 0; // 現在投入されている金額
    // 投入可能な硬貨・紙幣の種類
    private int[] coins = {500, 100, 50, 10};

    VendingMachine(Drink[] drinks) {
        this.drinks = drinks;
    }

    // ドリンク一覧の表示
    public void display() {
        int idx = 1;
        for (Drink drink : drinks) {
            System.out.println(" [" + idx + "]" + drink);
            idx++;
        }
    }

    // 自動販売機が受け付ける金額が正しい場合 真 を返す
    public void execCom(String command) {
        String[] s = command.split(" ");
        switch (s[0]) {
            case "i":
                if (isCoin(s[1])) cash += Integer.parseInt(s[1]);
                break;
            case "p":
                int idx = Integer.parseInt(s[1]) - 1;
                if (idx < 0 || idx >= drinks.length)
                    return;
                int price = drinks[idx].getPrice();
                if (price <= cash) {
                    eject(idx);
                    cash -= price;
                    payChange();
                } else {
                    System.out.println("お金が足りません");
                }
                break;
            case "c":
                payChange();
                break;
            default:
                break;
        }
    }

    private boolean isCoin(String s) {
        int c = Integer.parseInt(s);
        for (int coin : coins) {
            if (c == coin) return true;
        }
        return false;
    }

    private void eject(int idx) {
        System.out.println(drinks[idx] + "が排出されました");
    }

    // お釣りを払い出す
    private void payChange() {
        if (cash == 0) {
            System.out.println("お釣り なし");
            return;
        }
        String s = "お釣り ";
        for (int coin : coins) {
            if (cash / coin > 0) {
                s += coin + "円:" + (cash / coin) + "枚 ";
                cash %= coin;
            }
        }
        System.out.println(s);
    }
}


