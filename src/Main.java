public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] q = new int[3];
        q[0]=1;
        q[1]=2;
        q[2]=3;
        double[] w = {1.57,7.654,9.986};
        int[] e = {1,2,3,4,5};
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] q = new int[3];
        q[0]=1;
        q[1]=2;
        q[2]=3;
        double[] w = {1.57,7.654,9.986};
        int[] e = {1,2,3,4,5};
        System.out.println(q[0] + ", " + q[1] + ", " + q[2]);
        System.out.println(w[0] + ", " + w[1] + ", " + w[2]);
        System.out.println(e[0] + ", " + e[1] + ", " + e[2] + ", " + e[3] + ", " + e[4]);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] q = new int[3];
        q[0] = 1;
        q[1] = 2;
        q[2] = 3;
        double[] w = {1.57, 7.654, 9.986};
        int[] e = {1, 2, 3, 4, 5};
        System.out.println(q[2] + ", " + q[1] + ", " + q[0]);
        System.out.println(w[2] + ", " + w[1] + ", " + w[0]);
        System.out.println(e[4] + ", " + e[3] + ", " + e[2] + ", " + e[1] + ", " + e[0]);
    }
}