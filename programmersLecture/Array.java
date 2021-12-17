public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[100]; // 100개의 정수값을 저장할 수 있는 int형 배열 array1 생성
        array1[0] = 50;
        array1[10] = 100;

        int[] array2 = new int[]{1,2,3,4}; // 4개짜리 int형 배열 생성 및 1부터 4까지의 숫자가 배열에 들어감
        int[] array3 = {1, 2, 3, 4}; // array2와 같음

        System.out.println(array3[3]); // 4
        
        int value = array3[0];
        System.out.println(value); // 1
    }
}
