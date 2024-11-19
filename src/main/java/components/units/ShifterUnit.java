package components.units;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.operations.shifter.LeftShiftOperator;
import components.operations.shifter.RightShiftOperator;
import exceptions.NoMatchingOperatorException;

public class ShifterUnit extends Unit {

    public ShifterUnit() {
        super("Shifter", new LeftShiftOperator(), new RightShiftOperator());
    }

    public OperatorResult process(Operation operation, byte opt1, byte opt2) throws NoMatchingOperatorException {
        // todo: implement
        throw new NoMatchingOperatorException(name, operation);
    }

}
