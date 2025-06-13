public class D50Q6 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        if (max < min) {
            int tmp = max;
            max = min;
            min = tmp;
        }
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNembers(max);
        int[] part = primeNumbers.getPart(min, max);

        for (int prime : part) {
            System.out.printf("%d, ", prime);
        }
    }
}

class PrimeNumbers {
    boolean[] isPrimeNembers;

    void initializePrimeNembers(int max) {
        isPrimeNembers = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrimeNembers[i] = true;
        }

        for (int p = 2; p <= Math.sqrt(max); p++) {
            if (isPrimeNembers[p]) {
                for (int m = p * 2; m <= max; m += p) {
                    isPrimeNembers[m] = false;
                }
            }
        }
    }
        int[] getPart ( int min, int max){
        int count = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNembers[n]) {
                count++;
            }
        }
        int[] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNembers[n]) {
                part[index++] = n;
            }
        }
        return part;
        }
    }


