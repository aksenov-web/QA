public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i <=10 ) {
            if (i % 2 != 0) {
                System.out.println(i + " Odd");
            }
            else {
                System.out.println(i + " Even");
            }
            i++;
        }
        System.out.println("Test ended");


    }
}