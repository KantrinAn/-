public class Main {
    public static void main(String[] args) {
        String badNumber4 = "4";
        String badNumber9 = "9";
        int counter = 0;
        while (counter < 100) {
            counter++;
            if (!(String.valueOf(counter).contains(badNumber4) || String.valueOf(counter).contains(badNumber9))) {
                System.out.println(counter);
            }
        }
    }
}



