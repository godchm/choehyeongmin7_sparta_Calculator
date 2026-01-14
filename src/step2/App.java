package step2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator calculator1=new Calculator();
        String answer1;

        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

//            남아있던 \n을 읽기때문. \n을 처리하기 위해 사용.
            sc.nextLine();

//           +, -, x, %
            System.out.println("사칙연산 기호를 입력하세요: (+, -, x, %)");


//            사칙연산 처리 main에서 한다. 예외처리
            char symbol;
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
            if(symbol=='%'&&num2==0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                다시 입력하라고 해야함. 따라서 건너뛰는 continue를 사용. while문 안에 있기때문에 반복문을 벗어나지는 못한다.
                continue;
            }

          int result=calculator1.calculator(num1,num2,symbol);

            System.out.println("결과 :" +result);

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

        if(answer1.equals("yes")){
        System.out.println("저장할 정수를 입력(세터 추가): ");
        int num3=sc.nextInt();
        sc.nextLine();
        calculator1.setSums(num3);}

        System.out.println("첫번째 값을 삭제하겠습니까?(yes/no) ");
        String answer2=sc.nextLine();
        if(answer2.equals("yes")){
        calculator1.removeResult();}

        calculator1.getSums();
        System.out.println("결과값 :"+ calculator1.getSums());


    }
}
