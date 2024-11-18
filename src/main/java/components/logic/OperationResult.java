package components.logic;

import components.operations.Operation;

public class OperationResult {

    private byte result;
    private boolean overflowFlag;
    private boolean parityFlag;

    public OperationResult(byte result, boolean overflowFlag, boolean parityFlag) {
        this.result = result;
        this.overflowFlag = overflowFlag;
        this.parityFlag = parityFlag;
    }

//    public static OperationResult noResultInstance() {
//        return new OperationResult((byte) 0, false, false);
//    }

    public byte getResult() {
        return result;
    }

    public boolean isOverflowFlag() {
        return overflowFlag;
    }

    public boolean isParityFlag() {
        return parityFlag;
    }
}
