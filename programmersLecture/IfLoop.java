public class IfLoop{
    public static void main(String[] args) {
        int x = 50;
        int y = 60;

        if (x < y)
            System.out.println("x는 y보다 작습니다.");
        

        if (x == y) {
            System.out.println("x는 y와 같습니다.");
        } else if (x < y) { // 가능하면 너무 많은 else if 문을 쓰지 않는게 좋다.
            System.out.println("x는 y보다 작습니다.");
        } else {
            System.out.println("x와 y는 다릅니다.");
        }
    }
}