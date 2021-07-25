public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        double result = 0;
        if (getB () == 0) {

            System.out.println ("除数不能为0");
        }

        result = getA () / getB ();

        return result;
    }

}