package step3;

import java.util.ArrayList;

public class Calculator {

    //    컬렉션 선언
    private ArrayList<Double> result = new ArrayList<>();
    GenericBox<Double> intNumber=new GenericBox<>(0.0);

//    public int calculator(int num1, int num2, char symbol)
      public<S extends Number> double calculator(S num1, S num2, char symbol) {

          // 변환
                 double a=intNumber.GenericBoxDouble(num1);
                 double b=intNumber.GenericBoxDouble(num2);
          double sum=0;


        OperatorType operatorType=OperatorType.Symbol(symbol);
        switch (operatorType.getSymbol()) {
            case '+':
                sum=a+b;
                break;
            case '-':
                sum=a-b;
                break;
            case 'x':
                sum=a*b;
                break;
            case '%':
                sum=a/b;
                break;
            default:
                // 반환하기때문에
                return 0;
        }
        // 연산 결과를 필드에 저장. 반환하기 위해.
        result.add(sum);
        return sum;

    }

    public ArrayList<Double>getSums(){
        return result;

    }

    public void setSums(double num3){
        // 컬렉션 요소에 하나의 값을 추가
        this.result.add(num3);

    }

    public void removeResult(){
        result.remove(0);
    }

    public class GenericBox<T>{
        private T num;

        public GenericBox(T num){
            this.num=num;
        }

        public T getNum(){
            return this.num;
        }

        // 제네릭 메서드 타입 변환을 위하여 만듬. S눈 반드시 Number 이거나 Number을 상속한 타입만 올수 있다.
        public <S extends Number> double GenericBoxDouble(S num1){
            //  Number 클래스에 정의된 메서드로 int로 변환해준다.
            return num1.doubleValue();
        }

    }
}
