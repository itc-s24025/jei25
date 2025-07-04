public class D51q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n) {
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            default:
                s += "?";
                break;
        }
        System.out.println(s);
    }
}

// case             switch文で条件分岐を行う際に使う
// break            条件が一致してそこで終了したいときに使う
// fall-througth    swich文等でbreakをつけ忘れ次のケースまで実行されてしまうこと
