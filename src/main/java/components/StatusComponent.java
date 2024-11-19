package components;

public class StatusComponent {

    private static boolean parityFlag;
    private static boolean overflowFlag;
    private static boolean divZeroFlag;

    public static void setParityFlag(boolean value) {
        parityFlag = value;
    }

    public static void setOverflowFlag(boolean value) {
        overflowFlag = value;
    }

    public static void setDivZeroFlag(boolean value) {
        divZeroFlag = value;
    }

    public static boolean getParityFlag() {
        return parityFlag;
    }

    public static boolean getOverflowFlag() {
        return overflowFlag;
    }

    public static boolean getDivZeroFlag() {
        return divZeroFlag;
    }

}
