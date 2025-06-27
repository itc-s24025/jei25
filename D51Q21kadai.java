import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D51Q21kadai {
    // 異なる基数同士を計算するプログラムを作ってください
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> binary = new ArrayList<>();

        int num = sc.nextInt(); // リストに追加する値を入力
        binary.add(num);    // binary(2進数)変数 に値を追加

        calculation(binary);
    }
    // 変換するメソッド
    public static void calculation(List<Integer> binary2) {
        System.out.println(binary2);
        /*
        一つづつバラしたリストを作る
        for(5の位には16を　4の位には8を　3の位には4を　2の位には２を　１の位には1を)
        全部並べた数字を出力
         */

            }
        }



