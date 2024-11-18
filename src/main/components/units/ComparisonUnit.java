package components.units;

public class ComparisonUnit implements Unit {
    @Override
    public boolean compareOperationCode(byte operationCode) {
        return false;
    }

    @Override
    public byte process(byte opt1, byte opt2) {
        return 0;
    }
}
