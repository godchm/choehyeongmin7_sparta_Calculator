package step1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String answer1;

        while (true) {

            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

//            입력받는 자료형이 정수-> 문자열로 바뀌므로 사용한다.
//            남아있던 \n을 읽기때문
            sc.nextLine();

//           +, -, x, %
            System.out.println("사칙연산 기호를 입력하세요: (+, -, x, %)");

//            예외 처리
            char symbol;
            while (true){
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

            switch (symbol){
                    case '+':
                        System.out.println("결과: " + (num1 + num2));
                        break;
                    case '-':
                        System.out.println("결과: " + (num1 - num2));
                        break;
                    case 'x':
                        System.out.println("결과: " + (num1 * num2));
                        break;
                    case '%':
                        System.out.println("결과: " + (num1 / num2));
                        break;
                    default:
                        System.out.println("올바른 사직연산자를 입력하시오..");
                }

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
        sc.close();
        }
    }
