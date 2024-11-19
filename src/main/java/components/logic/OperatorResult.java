package components.logic;

public class OperatorResult {

    private byte result;
    private boolean overflowFlag;
    private boolean parityFlag;
    private boolean divZeroFlag;

    public OperatorResult(byte result) {
        this.result = result;
        this.overflowFlag = false;
        this.parityFlag = false;
        this.divZeroFlag = false;
    }

    public byte getResult() {
        return result;
    }

    public boolean isOverflowFlag() {
        return overflowFlag;
    }

    public void setOverflowFlag(boolean overflowFlag) {
        this.overflowFlag = overflowFlag;
    }

    public boolean isParityFlag() {
        return parityFlag;
    }

    public void setParityFlag(boolean parityFlag) {
        this.parityFlag = parityFlag;
    }

    public boolean isDivZeroFlag() {
        return divZeroFlag;
    }

    public void setDivZeroFlag(boolean divZeroFlag) {
        this.divZeroFlag = divZeroFlag;
    }

}
