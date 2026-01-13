package step3;

import java.util.ArrayList;

public class Calculator {


    //    컬렉션 선언
    private ArrayList<Integer> result = new ArrayList<>();


    public int calculator(int num1, int num2, char symbol) {
        int sum=0;

        OperatorType operatorType=OperatorType.Symbol(symbol);
        switch (operatorType.getSymbol()) {
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
