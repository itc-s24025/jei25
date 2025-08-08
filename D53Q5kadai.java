public class D53Q5kadai {
    private static int[] taxes = {8, 10};
    private static int FOOD = 0;
    private static int OTHER = 1;

    public static void main(String[] args) {
        int dataSize = Integer.parseInt(args[0]);
        String[] names = new String[dataSize];
        int[] prices = new int[dataSize];
        int[] nums = new int[dataSize];
        char[] types = new char[dataSize];

        int argsIdx = 1;

        int totalZeinuki = 0;
        int totalZeikomi = 0;
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[argsIdx++];
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }
        System.out.println("商品名\t税抜\t税込\tタイプ");
        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i];
            int zeikomi, taxType;
            taxType = types[i] == 'f' ? FOOD : OTHER;
            zeikomi = zeinuki * (taxes[taxType] + 100) / 100;
            System.out.print(names[i] + "\t" + zeinuki + "円\t");
            System.out.println(zeikomi + "円\t" + viewType(types[i]));

            totalZeinuki += zeinuki;
            totalZeikomi += zeikomi;
        }
        System.out.println("合計\t" + totalZeinuki + "円\t" + totalZeikomi + "円\t");

    }
    private static String viewType(char c) {
        return c == 'f' ? "食品等" : "その他";
    }
    }

