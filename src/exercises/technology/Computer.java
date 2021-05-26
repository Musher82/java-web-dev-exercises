package exercises.technology;

public class Computer extends AbstractEntity{

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int ram, int storage, boolean hasKeyboard) {
        super();
        this.storage = storage;
        this.ram = ram;
        this.hasKeyboard = hasKeyboard;
    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }

    @Override
    public Double idNumber() {
        return null;
    }
}
