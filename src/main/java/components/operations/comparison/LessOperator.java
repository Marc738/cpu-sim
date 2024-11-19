package components.operations.comparison;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;

public class LessOperator extends Operator {

    public LessOperator() {
        super(Operation.LESS);
    }

    @Override
    public OperatorResult process(byte opt1, byte opt2) {
        byte result;
        if(opt1 < opt2) {
            result = 1;
        } else {
            result = 0;
        }
        OperatorResult operatorResult = new OperatorResult(result);
        operatorResult.setParityFlag(getParityFlag(result));
        return operatorResult;
    }

}