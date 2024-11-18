package components;

public class RegisterFile {
    Register[] registers;

    public RegisterFile(int size) {
        initRegisters(size);
    }

    private void initRegisters(int size) {
        registers = new Register[size];
        for(int i = 0; i < size; i++) {
            registers[i] = new Register();
        }
    }

}
