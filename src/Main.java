public class Main {
    public static void main(String[] args) {
        String unluckyNumber4 = "4";
        String unluckyNumber9 = "9";
        int counter = 0;
        while (counter <= 154) {
            counter++;
            if (!(String.valueOf(counter).contains(unluckyNumber4) || String.valueOf(counter).contains(unluckyNumber9))) {
                System.out.println(counter);
            }
        }
    }
}



