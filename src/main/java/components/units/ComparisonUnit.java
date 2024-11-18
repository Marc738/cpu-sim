package components.units;

public class ComparisonUnit extends Unit {

    public ComparisonUnit(byte[] acceptedOperationCodes) {
        super(Operation.COMPARISON_OPERATIONS);
    }

    @Override
    public byte process(byte opt1, byte opt2) {
        return 0;
    }
}
