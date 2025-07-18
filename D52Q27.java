enum Signal {
    RED, YELLOW, GREEN;
}

public class D52Q27 {
    public static void main(String[] args) {
        Signal sig = Signal.YELLOW;
        if (sig == Signal.GREEN) {
            System.out.println("緑");
        }else if (sig == Signal.YELLOW) {
            System.out.println("黃");
        } else {
            System.out.println("赤");
        }
    }
}
