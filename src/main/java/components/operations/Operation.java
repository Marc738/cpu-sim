package components.operations;

import components.logic.OperationResult;
import exceptions.NoOperationResultException;

public class Operation {

    private final byte code;

    public Operation(byte code) {
        this.code = code;
    }

    public boolean equalsCode(byte compareCode) {
        return compareCode == code;
    }

    public OperationResult process(byte opt1, byte opt2) throws NoOperationResultException {
        throw new NoOperationResultException("process-method unimplemented in Operation with OperationCode: " + code);
    }

    protected boolean getOverflowFlag(int result, int intResult) {
        return result == intResult;
    }

    protected boolean getParityFlag(int result) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            if ((result & (1 << i)) != 0) {
                count++;
            }
        }

        return count % 2 == 0;
    }

}
