public class Final {
    public static void main(String[] args){
        int i;
        i = 10;
        i = 5;

        final int J; // 상수는 대문자 사용하는게 규칙
        J = 10;
        // J = 5; 이건 불가능, 상수이기 때문

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;

        final int OIL_PRICE = 1450; // 단어와 단어 사이에 _ 넣기
        int totalPrice = 50 * OIL_PRICE;

    }
}
