package exercises.technology;

public abstract class AbstractEntity {

    private double idNumber;

    private void IdNumberReg(double idNumber){

        this.idNumber = idNumber;

    }

    private void IdNumberAdd() {
        this.idNumber = this.idNumber +1;
    }

    public abstract Double idNumber();

}
