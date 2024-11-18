package components;

public class Status {

    private static boolean parityFlag;
    private static boolean overflowFlag;

    public static void setParityFlag(boolean value) {
        parityFlag = value;
    }

    public static void setOverflowFlag(boolean value) {
        overflowFlag = value;
    }

    public static boolean getParityFlag() {
        return parityFlag;
    }

    public static boolean getOverflowFlag() {
        return overflowFlag;
    }

}
