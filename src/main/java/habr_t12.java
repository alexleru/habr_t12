import java.util.ArrayList;

public class habr_t12 {
    public static void main(String[] args) {
        int[] array = new int[99];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 2;
        }
        //for(int item : array) System.out.println(item);
        System.out.println(рrimeNumber(array));
    }

    private static ArrayList<Integer> рrimeNumber(int[] array){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        primeNumbers.add(array[0]);
        for (int i = 0; i < array.length; i++) {
            int checkInt = array[i];
            boolean isPrime = true;
            for (int j = 0; j < primeNumbers.size(); j++) {
                boolean is = array[i]/2 < primeNumbers.get(j);
                if(is) break;
                if(checkInt% primeNumbers.get(j) == 0 || checkInt == primeNumbers.get(j)){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) primeNumbers.add(checkInt);
        }
        return primeNumbers;
    }
}
