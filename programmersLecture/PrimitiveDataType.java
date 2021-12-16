public class PrimitiveDataType {
    public static void main(String[] args) {
        boolean isFun = true; // true, false만 가능. 1byte

        char c = 'f'; // 한 글자만 가능, 2byte

        int i = 12; // 정수, 4byte
        
        long n = 12345678l; // 긴 정수, 끝에 대소문자 관계없이 l 붙임. 8byte
        
        float f = 11.1f; // 실수, 끝에 대소문자 관계없이 f 붙임. 4byte

        double d = 1234567.124; // 긴 실수. 8byte
    }
}