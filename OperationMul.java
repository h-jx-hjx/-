public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        result = getA () * getB ();
        return result;
    }

}