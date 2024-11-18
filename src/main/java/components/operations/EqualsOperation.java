package components.operations;

public class EqualsOperation extends Operation {

    public EqualsOperation() {
        super((byte) 1);
    }

    @Override
    public OperationResult process(byte opt1, byte opt2) {
        byte result = 0;
        if(opt1 < opt2) { // Operator 1 ist kleiner als Operator 2
            result = 0; // b0000000
        } else if(opt1 == opt2) { // Operatoren sind gleich groß
            result = 1; // b0000001
        } else { // Operator 1 ist größer als Operator 2
            result = 2; // b0000002
        }
        int intResult = (int) opt1 + (int) opt2;
        boolean overflowFlag = false;
        boolean parityFlag = getParityFlag(result);
        return new OperationResult(result, overflowFlag, parityFlag);
    }

}
