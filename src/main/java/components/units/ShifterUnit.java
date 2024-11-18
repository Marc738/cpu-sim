package components.units;

public class ShifterUnit extends Unit {

    public ShifterUnit() {
        super(Operation.SHIFTER_OPERATIONS);
    }

    @Override
    public byte process(byte opt1, byte opt2) {
        return 0;
    }
}
