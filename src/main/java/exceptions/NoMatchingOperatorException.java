package exceptions;

import components.logic.Operation;

public class NoMatchingOperatorException extends Exception {

    public NoMatchingOperatorException(String unit, Operation operation) {
        super("No matching operator found in " + unit + " Unit for operation " + operation.name());
    }

}
