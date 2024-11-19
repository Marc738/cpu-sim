package components.operations.comparison;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;

public class EqualsOperator extends Operator {

    public EqualsOperator() {
        super(Operation.EQUALS);
    }

    @Override
    public OperatorResult process(byte opt1, byte opt2) {
        byte result = 0;
        if(opt1 == opt2) {
            result = 1;
        } else {
            result = 0;
        }
        OperatorResult operatorResult = new OperatorResult(result);
        operatorResult.setParityFlag(getParityFlag(result));
        return operatorResult;
    }

}
