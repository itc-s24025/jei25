public class D51Q22 {
    public static void main(String[] args) {
        view(false, "true");
    }
    public  static void view(boolean b, String s) {
        // b + s を文字列結合するために最初に " " をつける
        // 最初に文字列結合と判断されたら後ろも文字列結合になる
        System.out.println("" + b + s);
    }
}
