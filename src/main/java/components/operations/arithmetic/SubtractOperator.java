package components.operations.arithmetic;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;

public class SubtractOperator extends Operator {

    public SubtractOperator() {
        super(Operation.SUBTRACT);
    }

    @Override
    public OperatorResult process(byte opt1, byte opt2) {
        // result
        byte result = (byte) (opt1 - opt2);
        OperatorResult operatorResult = new OperatorResult(result);

        // flags
        int intResult = (int) opt1 - (int) opt2;
        operatorResult.setOverflowFlag(getOverflowFlag(result, intResult));
        operatorResult.setParityFlag(getParityFlag(result));

        // return
        return operatorResult;
    }

}