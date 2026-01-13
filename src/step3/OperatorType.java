package step3;

public enum OperatorType {
//    enum은 상수부분은 무조건 대문자로 쓴다.
    PLUS('+'),
    MINUS('-'),
    MULTIPLY('x'),
    DIVIDE('%');

    private final char symbol;

    OperatorType (char symbol){
        this.symbol=symbol;
    }

    public char getSymbol(){
        return symbol;
    }

    // 기능(메서드) 구현.
    public static OperatorType Symbol (char symbol){
        switch (symbol){
            case'+':
                return PLUS;
            case'-':
                return MINUS;
            case'x':
                return MULTIPLY;
            case'%':
                return DIVIDE;
            default:
                return null;

        }

    }


}
