public class For {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            // if (i % 2 != 0) {
            //     continue; // 반복문 실행 X
            // }
            total += i;
            if (i == 50) {
                break; // 멈춤
            }
        }

        System.out.println(total);
    }
}
