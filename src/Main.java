import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int [] hockey = new int [3];
        hockey [0] = 45;
        hockey [1] = 30;
        hockey [2] = 75;
        double [] bottle = {1.57, 7.654, 9.986};
        int [] weightBarbell = {25, 30, 80, 120};
        //Задание 2
        System.out.println("Задание 2");
        System.out.println(Arrays.toString (hockey));
        System.out.println(Arrays.toString (bottle));
        System.out.println(Arrays.toString (weightBarbell));
        //Задание 3
        System.out.println("Задание 3");
        for (int i = hockey.length - 1; i >= 0; i--) {
            if (i > 0){
                System.out.print(hockey[i] + ", ");
            }else {
                System.out.print(hockey[i]);
            }
        }
        System.out.println();
        for (int o = bottle.length - 1; o >= 0; o--) {
            if (o > 0){
                System.out.print(bottle[o] + ", ");
            }else {
                System.out.print(bottle[o]);
            }
        }
        System.out.println();
        for (int p = weightBarbell.length - 1; p >= 0; p--) {
            if (p > 0){
                System.out.print(weightBarbell[p] + ", ");
            }else {
                System.out.print(weightBarbell[p]);
            }
        }
        //Задание 4
        System.out.println();
        System.out.println("Задание 4");

        for (int w = 0; w <= (hockey.length - 1); w++) {
            if (hockey[w] % 2 != 0){
                hockey[w] = hockey[w] + 1;
            }
        }
        System.out.println(Arrays.toString (hockey));

    }
}
