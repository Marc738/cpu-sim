package components.operations;

import components.logic.OperationResult;

public class AddOperation extends Operation {

    public AddOperation() {
        super((byte) 1);
    }

    @Override
    public OperationResult process(byte opt1, byte opt2) {
        byte result = (byte) (opt1 + opt2);
        int intResult = (int) opt1 + (int) opt2;
        boolean overflowFlag = getOverflowFlag(result, intResult);
        boolean parityFlag = getParityFlag(result);
        return new OperationResult(result, overflowFlag, parityFlag);
    }

}
