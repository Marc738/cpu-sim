package components.units;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;
import components.operations.arithmetic.AddOperator;
import components.operations.arithmetic.DivideOperator;
import components.operations.arithmetic.MultiplyOperator;
import components.operations.arithmetic.SubtractOperator;
import exceptions.NoMatchingOperatorException;

public class ArithmeticUnit extends Unit {

    public ArithmeticUnit() {
        super("Arithmetic", new AddOperator(), new SubtractOperator(), new MultiplyOperator(), new DivideOperator());
    }

    @Override
    public OperatorResult process(Operation operation, byte opt1, byte opt2) throws NoMatchingOperatorException {
        for(Operator operator : operators) {
            if(operator.canProcess(operation)) {
                return operator.process(opt1, opt2);
            }
        }
        throw new NoMatchingOperatorException(name, operation);
    }
}
