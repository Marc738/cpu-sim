package components;

public class Register {
    private byte data;
    private boolean present;
    private String description;

    public Register() {
        data = 0;
        present = false;
    }

    public byte getData() {
        return data;
    }

    public void setData(byte data) {
        this.data = data;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
