import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int swapNum;
        swapNum = ((num & 0x0F) << 4 | (num & 0xF0) >> 4);
        System.out.println( swapNum);
        scanner.close();
    }
}
