package components.operations;

import components.logic.Operation;
import components.logic.OperatorResult;
import exceptions.NoOperationResultException;

public class Operator {

    private final Operation operation;

    public Operator(Operation operation) {
        this.operation = operation;
    }

    public boolean canProcess(Operation operationToProcess) {
        return operationToProcess == operation;
    }

    public OperatorResult process(byte opt1, byte opt2) throws NoOperationResultException {
        throw new NoOperationResultException("Error: process-method unimplemented in Operation with OperationCode: " + operation.getCode());
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
