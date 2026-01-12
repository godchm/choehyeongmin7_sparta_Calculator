package step1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


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
            char symbol=sc.next().charAt(0);

//            입력받는 자료형이 정수-> 문자열로 바뀌므로 사용한다.
//            남아있던 \n을 읽기때문
            sc.nextLine();

            if(symbol=='%'&&num2==0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//                다시 입력하라고 해야함. 따라서 건너뛰는 continue를 사용.
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

                System.out.println("더 계산하시겠습니까? (yes/exit)  (exit 입력 시 종료)");
                String answer = sc.nextLine();

                if(answer.equals("exit")){
                    System.out.println("계산기 종료");
                    break;
                }
            }
        sc.close();
        }
    }
