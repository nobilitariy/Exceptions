package seminar2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс эллемента массива");
        int index = 0;
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
        }
        try{
            arr[index] = 1;
        } catch(Exception e){
            System.out.println("Указан индекс за пределамми массива");
        }
    }
}
