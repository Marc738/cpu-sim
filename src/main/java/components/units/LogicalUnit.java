package components.units;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.logical.AndOperator;
import components.operations.logical.NorOperator;
import components.operations.logical.OrOperator;
import components.operations.logical.XorOperator;
import exceptions.NoMatchingOperatorException;

public class LogicalUnit extends Unit {

    public LogicalUnit() {
        super("Logical", new AndOperator(), new OrOperator(), new NorOperator(), new XorOperator());
    }

    public OperatorResult process(Operation operation, byte opt1, byte opt2) throws NoMatchingOperatorException {
        // todo: implement
        throw new NoMatchingOperatorException(name, operation);
    }

}
