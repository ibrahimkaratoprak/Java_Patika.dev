package PatikaJava;

public class DiziOrtalamaHesaplama {
    public static void main(String[] args) {
        int[] list = {1, 5, 7, 9, 5, 4, 7, 6, 5};
        double sum = 0;
        double average = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        average = sum / list.length;
        System.out.println(average);
    }
}
