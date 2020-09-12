import java.util.Random;
public class P {
    public static void forArray() {
        int myArray[] = {3, 5, 7, 12};
        int sum1 = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum1 = sum1 + myArray[i];
        }
        System.out.println(sum1);
        System.out.println("for");
    }

    public static void whileArray() {
        int myArray[] = {2, 5, 8, 12};
        int sum2 = 0;
        int i = 0;
        while (i < myArray.length) {
            sum2 = sum2 + myArray[i];
            i++;
        }
        System.out.println(sum2);
        System.out.println("while");
    }

    public static void dowhileArray() {
        int myArray[] = {1, 5, 3, 12};
        int sum3 = 0;
        int i = 0;
        do {
            sum3 = sum3 + myArray[i];
            i++;
        }
        while (i < 4);
        System.out.println(sum3);
        System.out.println("while do");
    }

    public static void MassivMath() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random()*200 - 100)%100;
            System.out.println(array[i]);
        }
        System.out.println("Sort");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Math");
    }
    public static void Massivrand() {
        int[] array = new int[10];
        int rnd;
        Random random = new Random();
        for (int i = 0; i < 10; i++){
            rnd = random.nextInt(100+1);
            array[i]=rnd;
            System.out.println(array[i]);
        }
        System.out.println("Sort");
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Random");
    }
    public static void Factorial(){
        int a = 8;
        int fac = 1;
        for (int i = 1; i<= a; i++){
            fac = fac * i;
        }
        System.out.println("Factorial");
        System.out.println(fac);
    }

    public static void main(String[] args) {
        forArray();
        whileArray();
        dowhileArray();
        MassivMath();
        Massivrand();
        Factorial();
    }
}

