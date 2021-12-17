public class Operator {
    public static void main(String[] args) {
        // 산술연산자
        int i1 = -5;
        int i2 = +i1; // 그대로 -5 나옴
        int i3 = -i1; // 5 나옴
        int i4 = ++i3; // i3 = i3 + 1 이므로 i3 = i4 = 6
        int i5 = i3++; // i3 = i3 + 1 인데 i5에는 i3이 들어가고, i3은 1이 늘어남. 따라서 i5 = 6, i3 = 7

        int i = 5;
        int j = 2;
        System.out.println(i + j); // 7
        System.out.println(i - j); // 3
        System.out.println(i * j); // 10
        System.out.println(i / j); // 2. 정수끼리의 나눗셈은 정수값으로만 나옴. 2.5가 나오려면 i랑 j 중 하나는 실수여야 함
        System.out.println(i / (double)j); // 2.5
        System.out.println(i % j); // 1

        // 비교연산자
        int a = 10; // 단순대입연산자. 왼쪽 변수에 오른쪽 값을 대입하는 것
        int b = 10;

        System.out.println(a == b); // true
        System.out.println(a != b); // false
        System.out.println(a < b); // false
        System.out.println(a <= b); // true
        System.out.println(a > b); // false
        System.out.println(a >= b); // true

        // 복합대입연산자: 정해진 연산을 수행한 후 결과를 변수에 저장하는 것
        a += 10; // a = a + 10
        System.out.println(a); // 20
        System.out.println(a -= 5); // 15

        // 연산자 우선순위
        int x = 5;
        int y = 10;
        int z = 15;
        System.out.println(x - y * z); // -145, * 부터 계산
        System.out.println((x - y) * z); // -75, 괄호 안부터 계산
        System.out.println(x > 5 && y > 5); // 비교연산자(>, < 등)가 논라연선자(&&, ||)보다 먼저 수행. 또 &&이 ||보다 우선순위 높음. 따라서 false 나옴
        System.out.println(++x - 5); // 증감연산자(++, --)가 산술연산자보다 우선순위 높음. 따라서 6 - 5 = 1이 나옴
        System.out.println(x); // ++x를 선언했기 때문에 6 출력
        System.out.println(x++ - 5); // 증가되기 전에 -가 선언되어 1이 출력. 하지만 출력 후 ++가 되기 때문에 x의 값은 7이 됨
        System.out.println(x); // 1

        // 논리연산자
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2); // false
        System.out.println(b1 && b3); // true
        System.out.println((b1 || b2)); // true
        System.out.println((b1 || b3)); // true
        System.out.println(b2 || b2); // false

        int score = 88;
        if (score <= 100 && score >= 70) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

        System.out.println(b1 ^ b3); // false
        System.out.println(b1 ^ b2); // true
        System.out.println(!b1); // false
        System.out.println(!b2); // true

        // 삼항연산자
        int c1 = (5 > 4) ? 50: 40; // 5가 4보다 크다면 c1에 50을, 아니면 40을 넣는 것
        System.out.println(c1); // 50

        int c2 = 0;
        if (5 < 4) {
            c2 = 50;
        } else {
            c2 = 40;
        }
        System.out.println(c2); // 40
    }
}
