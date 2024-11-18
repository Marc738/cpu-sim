package components.units;

public interface Unit {
    boolean compareOperationCode(byte operationCode);
    byte process(byte opt1, byte opt2);
}
