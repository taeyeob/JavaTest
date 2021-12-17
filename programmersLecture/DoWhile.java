import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner (System.in); // 키보드로부터 값을 입력받는 것
        do{
            // 반복할 문장들 입력
            value = scan.nextInt(); // nextInt: 입력받은 값 출력하는 메서드.
            System.out.println("입력받은 값 :" + value);
        } while (value != 10);

        System.out.println("반복문 종료");
    }
}
