package Generic.GenericEnum;
enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    public <T extends Number> double apply(T a, T b) {
switch (this){
    case ADD :
        return a.doubleValue()+b.doubleValue();
    case  SUBTRACT:
        return a.doubleValue()-b.doubleValue();
    case MULTIPLY:
        return a.doubleValue()*b.doubleValue();
    case DIVIDE:
        return a.doubleValue()/b.doubleValue();

    default:
        throw new AssertionError("unknown operation"+this);
    }
    }
}
public class Test {
    public static void main(String[] args) {
        double res = Operation.ADD.apply(10, 20);
        System.out.println(res);
    }
}
