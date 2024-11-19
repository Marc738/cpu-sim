package components.units;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.Operator;
import exceptions.NoMatchingOperatorException;

public class Unit {

    protected final String name;

    protected Operator[] operators;

    public Unit(String name, Operator...operators) {
        this.name = name;
        this.operators = operators;
    }

    public boolean canProcessOperation(Operation operation) {
        for(Operator operator : operators) {
            if(operator.canProcess(operation)) {
                return true;
            }
        }
        return false;
    }

    public OperatorResult process(Operation operation, byte opt1, byte opt2) throws NoMatchingOperatorException {
        throw new NoMatchingOperatorException(name, operation);
    }

}
