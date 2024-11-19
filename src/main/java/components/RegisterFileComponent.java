package components;

public class RegisterFileComponent {
    private final Register[] registers;

    public RegisterFileComponent(byte size) {
        registers = new Register[size];
        for(byte i = 0; i < size; i++) {
            registers[i] = new Register();
        }
    }

    public Register getRegister(byte index) {
        return registers[index];
    }

}
