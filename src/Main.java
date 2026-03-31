public class Main {
    public static void main(String[] args) {
    // Задание 1
        System.out.println("Задание 1");
        int [] hockey = new int [3];
        double [] bottle = {1.57, 7.654, 9.986};
        int [] weightBarbell = {25, 30,80,120};
    //Задание 2
        System.out.println("Задание 2");
        System.out.println(hockey[0] + "," + hockey[1] + "," + hockey[2]);;
        System.out.println(bottle[0] + "," + bottle[1] + "," +bottle[2]);
        System.out.println(weightBarbell[0] + "," +weightBarbell[1] + "," +weightBarbell[2] + "," +weightBarbell[3]);
    //Задание 3
        System.out.println("Задание 3");
        System.out.println(hockey[2] + "," + hockey[1] + "," + hockey[0]);;
        System.out.println(bottle[2] + "," + bottle[1] + "," +bottle[0]);
        System.out.println(weightBarbell[3] + "," +weightBarbell[2] + "," +weightBarbell[1] + "," +weightBarbell[0]);
    //Задание 4
        System.out.println("Задание 4");
        for (int i = 0; i < weightBarbell.length; i ++) {
            if ((weightBarbell[i] % 2) == 0) {
                weightBarbell[i] = weightBarbell[i] + 1;

            }
        }
        System.out.println(weightBarbell[0] + "," +weightBarbell[1] + "," +weightBarbell[2] + "," +weightBarbell[3]);
    }
}