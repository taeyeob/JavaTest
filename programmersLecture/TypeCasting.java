public class TypeCasting {
    public static void main(String[] args) {
        int x = 10000;
        long y = x; // 잘 담김

        long x2 = 5;
        int y2 = (int) x2; // 앞에 (int)를 넣어주면서 형변환을 시켜줘야 담김. Long이 int보다 크기 때문에 일어나는 현상. 크기가 큰 그릇의 물건을 작은 그릇으로 옮길 때를 생각하면 됨.
    }
}
