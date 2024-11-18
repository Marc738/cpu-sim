package components.units;

public enum Operation {

    // Arithmetic Unit
    ADD((byte) 1),
    SUBTRACT((byte) 2),
    MULTIPLY((byte) 3),
    DIVIDE((byte) 4),

    // Comparison Unit
    EQUAL((byte) 5),
    GREATER((byte) 6),
    LESS((byte) 7),

    // Logical Unit
    AND((byte) 8),
    OR((byte) 9),
    NOR((byte) 10),
    XOR((byte) 11),

    // Shifter Unit
    LEFT_SHIFT((byte) 12),
    RIGHT_SHIFT((byte) 13),
    ROTATE((byte) 14);

    // Arrays for each unit
    public static final Operation[] ARITHMETIC_OPERATIONS = {ADD, SUBTRACT, MULTIPLY, DIVIDE};
    public static final Operation[] COMPARISON_OPERATIONS = {EQUAL, GREATER, LESS};
    public static final Operation[] LOGICAL_OPERATIONS = {AND, OR, NOR, XOR};
    public static final Operation[] SHIFTER_OPERATIONS = {LEFT_SHIFT, RIGHT_SHIFT, ROTATE};

    private final byte code;

    Operation(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

}
