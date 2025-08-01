public class D53Q25kadai {
    public static void main(String[] args) {
        // == 2つの変数が全く同じオブジェクトを参照しているか(メモリ上の場所)
        // 2つのオブジェクトの中身（値）が同じか
        // 上記の違いがあるのでs1とs2の中身を全く同じにすると true trueになる
        String s1 = "ABC";
        String s2 = "ABC";
        boolean b1 = s1 == s2;
        boolean b2 = s1.equals(s2);
        System.out.println(b1 + " " + b2);
    }
}
