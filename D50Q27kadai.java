public class D50Q27kadai {
    public static void main(String[] args) {
        int control = 3;
        String mode = "";

        switch (control) {
            case 1:
                mode = "Warm";
                break;
                case 2:
                    mode = "Cool";
                    break;
                    case 3:
                        mode = "Wind";
                        break;
        }
        System.out.println(mode);
    }
}
