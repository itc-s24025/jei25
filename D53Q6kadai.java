//public class D53Q6kadai {
//    public static void main(String[] args) {
//        if (args.length != 5) {
//            return;
//        }
//        if (args[0].equals("b")) {
//            for (int i = 1; i <= 4; i++) {
//                int num = hex.indexOf(intToStr(num));
//            }
//        } else if (args[0].equals("g")) {
//            for (int i = 1; i <= 4; i++) {
//                System.out.println(strToInt(args[i]));
//            }
//        }
//    }
//    public  static String intToStr(int x) {
//        String s = "";
//        for (int i = 0; i < 4; i++) {
//            if (x % 2 == 0) {
//                s = "." + s;
//            } else {
//                s = "o" + s;
//            }
//            x /= 2;
//        }
//        return s;
//    }
//    public static int strToInt(String s) {
//        int x = 1, sum = 0;
//        for (int i = 3; i >= 0; i--) {
//            if (s.charAt(i) == 'o') {
//                sum += x;
//            }
//            x *= 2;
//        }
//        return hex.substring(0, 1).equals("b") ? sum : sum + 1;
//    }
//}
