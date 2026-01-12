package step2;

import java.util.ArrayList;


public class Calculator {

//    컬렉션 선언
    private ArrayList<Integer> result = new ArrayList<>();


    public int calculator(int num1, int num2, char symbol) {
        int sum=0;

        switch (symbol) {
            case '+':
                sum=num1+num2;
                break;
            case '-':
                sum=num1-num2;
                break;
            case 'x':
                sum=num1*num2;
                break;
            case '%':
                sum=num1/num2;
                break;
            default:
                // 반환하기때문에
                return 0;
        }
        // 연산 결과를 필드에 저장. 반환하기 위해.
        result.add(sum);
        return sum;

    }
    public ArrayList<Integer>getSums(){
    return result;

    }

    public void setSums(int num3){
        // 컬렉션 요소에 하나의 값을 추가
        this.result.add(num3);

    }

    public void removeResult(){
        result.remove(0);
    }
}

//    result.add(sum);
//    return result;



    // Getter 메서드 구현

    // Setter 메서드 구현

    // 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현
//    public void removeResult(){
//
//    }

