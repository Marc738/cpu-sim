package components.units;

public class Unit {

    protected byte operationCode;
    protected byte[] acceptedOperationCodes;

    public Unit(Operation[] acceptedOperations) {
        initAcceptedOperationCodes(acceptedOperations);
    }

    private void initAcceptedOperationCodes(Operation[] acceptedOperations) {
        acceptedOperationCodes = new byte[acceptedOperations.length];
        for(int i = 0; i < acceptedOperations.length; i++) {
            acceptedOperationCodes[i] = acceptedOperations[i].getCode();
        }
    }

    public boolean canProcessOperationCode(byte operationCode) {
        for(byte code : acceptedOperationCodes) {
            if(code == operationCode) {
                return true;
            }
        }
        return false;
    }

    public void setOperationCode(byte operationCode) {
        this.operationCode = operationCode;
    }

    public byte process(byte opt1, byte opt2) {
        return 0;
    }

}
