public class Calculadora implements java.io.Serializable{

    private double operandOne;
    private double operandTwo;
    private String operation;
    private double result;

    public Calculadora(){
        this.operandOne=10.5;
        this.operandTwo=5.2;
        this.operation="+";
    }

    public Calculadora(double operandOne, double operandTwo, String operation){
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
        this.operation = operation;
    }

    public void performOperation() {
        if (operation.equals("+")) {
            this.result = this.operandOne + this.operandTwo;
        } else if (operation.equals("-")){
            this.result = this.operandOne - this.operandTwo;
        } else{
            System.out.println("Operador invalido");
        }
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    
}