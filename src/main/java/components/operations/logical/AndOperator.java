package components.operations.logical;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;

public class AndOperator extends Operator {

    public AndOperator() {
        super(Operation.AND);
    }

    @Override
    public OperatorResult process(byte opt1, byte opt2) {
        byte result = (byte) (opt1 & opt2);
        OperatorResult operatorResult = new OperatorResult(result);
        operatorResult.setParityFlag(getParityFlag(result));
        return operatorResult;
    }

}
