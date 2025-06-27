import javax.swing.*;
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

        for (int i = 0; i <= binary2.size() - 1; i++) {
            System.out.println(binary2.get(i));
            }
        }
        }


