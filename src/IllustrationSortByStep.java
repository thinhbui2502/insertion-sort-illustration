import java.util.Arrays;
import java.util.Scanner;

public class IllustrationSortByStep {
    public static void main(String[] args) {
        int[] list = inputData();
        //In ra ket qua
        System.out.println("Your input list: ");
        System.out.println(Arrays.toString(list));
        System.out.println("=========================");
        System.out.println("Your list after insertion sorted: ");
        illustrationByStep(list);
        System.out.println(Arrays.toString(list));
    }

    //Cai dat phuong thuc thêm dữ liệu từ bàn phím
    private static int[] inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        return list;
    }

    //Cai dat phuong thuc sắp xếp
    public static void illustrationByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }
}
