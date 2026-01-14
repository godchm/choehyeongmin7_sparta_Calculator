package step3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    // 타입 변환 int/double 형태로 구분해서 결과를 출력하기 위해
    private static Number Convert(String num){
        if(num.contains(".")){
            return Double.parseDouble(num);
        }else {
            return Integer.parseInt(num);
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator1 = new Calculator();
        String answer1, answer2;
        List<Integer> arrayList =new ArrayList<>();

        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            String num1 = sc.nextLine();
            System.out.println("두 번째 숫자를 입력하세요: ");
            String num2 = sc.nextLine();

//           +, -, x, %
            System.out.println("사칙연산 기호를 입력하세요: (+, -, x, %)");

            char symbol;
//            사칙연산 처리 main에서 한다.
            while (true){
//                            과제 가이드 예시 활용.
                symbol = sc.next().charAt(0);
                sc.nextLine();
            if (symbol == '+' || symbol == '-' || symbol == 'x' || symbol == '%') {

                break;
            }else{
                System.out.println("올바른 사칙연산자를 입력하세요.");
                }
            }

            //   변환
            Number num3 =Convert(num1);
            Number num4=Convert(num2);

//            num4를 double 형으로 변환해주는 메서드 사용.
            if (symbol=='%' &&  num4.doubleValue()== 0.0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                다시 입력하라고 해야함. 따라서 건너뛰는 continue를 사용. while문 안에 있기때문에 반복문을 벗어나지는 못한다.
                continue;
            }

            double result = calculator1.calculator(num3, num4, symbol);

            System.out.println("결과 :" + result);

            while (true) {
                System.out.println("더 계산하시겠습니까? (yes/exit) (exit 입력 시 종료)");
                answer1 = sc.nextLine();
                if (answer1.equals("yes") || answer1.equals("exit"))
                {
                    break;
                } else {
                    System.out.println("yes / exit 중에서 입력하세요.");
                }
            }
            if (answer1.equals("yes")) {
                continue;
            }

            if(answer1.equals("exit")){
                System.out.println("계산기 종료");
                break;
            }

        }

//        예외 처리
        while (true) {
            System.out.println("세터로 값을 추가?(yes/no)");
            answer1 = sc.nextLine();
            if (answer1.equals("yes") || answer1.equals("no"))
            {
            break;
            } else {
                System.out.println("yes / no 중에서 입력하세요.");
            }
        }
        if (answer1.equals("yes")) {
            System.out.println("저장할 정수를 입력(세터 추가): ");
            int num3 = sc.nextInt();
            sc.nextLine();
            calculator1.setSums(num3);
        }
        while (true) {
            System.out.println("첫번째 값을 삭제하겠습니까?(yes/no) ");
             answer2 = sc.nextLine();
            if (answer2.equals("yes") || answer2.equals("no")) {
                break;
            }else{
                System.out.println("yes / no 중에서 입력하세요.");
            }
        }
        if (answer2.equals("yes")){
            calculator1.removeResult();
        }

        calculator1.getSums();
        System.out.println("결과값 :" + calculator1.getSums());
        System.out.println();

        System.out.println("값 입력");
        double num5 = sc.nextDouble();
        calculator1.setSums(num5);

//        구글링을 통해서 orElseThrow(); 추가. 논리적으로 빈 컬렉션이 오지 않는다는것을 자바는 모른다. 따라서 써준다.
//        람다 메서드와 스트림 활용... 어렵다...
        double max =calculator1.getSums()
                             .stream()
                             .max((num1,num2)->num1.compareTo(num2))
                             .orElseThrow();

        System.out.println("최대값은 :"+max);

}
}