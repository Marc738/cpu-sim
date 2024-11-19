package components.operations.shifter;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;

public class RightShiftOperator extends Operator {

    public RightShiftOperator() {
        super(Operation.RIGHT_SHIFT);
    }

    @Override
    public OperatorResult process(byte opt1, byte opt2) {
        byte result = (byte) (opt1 >> opt2);
        OperatorResult operatorResult = new OperatorResult(result);
        operatorResult.setParityFlag(getParityFlag(result));
        return operatorResult;
    }

}
