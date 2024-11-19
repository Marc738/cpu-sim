package components.units;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;
import components.operations.comparison.EqualsOperator;
import components.operations.comparison.GreaterOperator;
import components.operations.comparison.LessOperator;
import exceptions.NoMatchingOperatorException;

public class ComparisonUnit extends Unit {

    public ComparisonUnit() {
        super("Comparison", new GreaterOperator(), new EqualsOperator(), new LessOperator());
    }

    public OperatorResult process(Operation operation, byte opt1, byte opt2) throws NoMatchingOperatorException {
        // todo: implement
        throw new NoMatchingOperatorException(name, operation);
    }
}
