package components;

import components.logic.Operation;
import components.logic.OperatorResult;
import components.units.*;
import exceptions.NoMatchingOperatorException;

public class AccumulatorComponent {

    private final StatusComponent statusComponent;
    private final Unit[] units;
    private byte target;
    private byte opt1;
    private byte opt2;

    public AccumulatorComponent() {
        statusComponent = new StatusComponent();
        units = new Unit[]{new ArithmeticUnit(), new ComparisonUnit(), new LogicalUnit(), new ShifterUnit()};
        target = 0;
        opt1 = 0;
        opt2 = 0;
    }

    public OperatorResult process(Operation operation) throws NoMatchingOperatorException {
        for(Unit unit : units) {
            if(unit.canProcessOperation(operation)) {
                return unit.process(operation, opt1, opt2);
            }
        }
        throw new NoMatchingOperatorException("Accumulator", operation);
    }

    public void setOpts(byte target, byte opt1, byte opt2) {
        this.target = target;
        this.opt1 = opt1;
        this.opt2 = opt2;
    }

    public byte getTarget() {
        return target;
    }

    public void setTarget(byte target) {
        this.target = target;
    }

    public byte getOpt1() {
        return opt1;
    }

    public void setOpt1(byte opt1) {
        this.opt1 = opt1;
    }

    public byte getOpt2() {
        return opt2;
    }

    public void setOpt2(byte opt2) {
        this.opt2 = opt2;
    }
}
