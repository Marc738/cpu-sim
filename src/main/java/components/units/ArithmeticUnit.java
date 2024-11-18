package components.units;

public class ArithmeticUnit extends Unit {

    public ArithmeticUnit() {
        super(Operation.ARITHMETIC_OPERATIONS);
    }

    @Override
    public byte process(byte opt1, byte opt2) {
        return 0;
    }
}
