public class operationFactory {
    public static Operation createopreration(String operation) {
        Operation ope = null;
        switch (operation) {
            case "+":
                ope = new OperationAdd ();
                break;
            case "-":
                ope = new OperationSub ();
                break;
            case "*":
                ope = new OperationMul ();
                break;
            case "/":
                ope = new OperationDiv ();
                break;
        }
        return ope;
    }
}