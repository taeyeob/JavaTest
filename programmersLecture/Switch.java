import java.util.Calendar;
public class Switch {
    public static void main(String[] args) {
        // switch, case, default, break
        int value = 2;
        switch(value){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default: // else같은 느낌
                System.out.println("그 외 다른 숫자");
        } // break를 넣지 않으면 value가 1이면 case 1부터 다 출력, 2면 case 2부터 출력.

        String str = "A"; // JDK 7 이후의 버전부터는 숫자 외 다른 type도 case 처리 가능.
        switch(str){
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("그 외 다른 문자");
        }

        
        // 오늘이 몇 월인지 month에 저장합니다.
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        String season = "";
        
        // 다음과 같이 case문을 한번에 사용하면 더 짧게 코드를 짤 수 있습니다.
        switch(month) {
            case 1:
            case 2:
            case 12:
                season = "겨울";
                break;
            case 3:
            case 4:
            case 5:
                season = "봄";
                break;
            case 6:
            case 7:
            case 8:
                season = "여름";
                break;
            case 9:
            case 10:
            case 11:
                season = "가을";
                break;
        }
        System.out.println("지금은 " + month + "월이고, " + season + "입니다.");
    }
}
