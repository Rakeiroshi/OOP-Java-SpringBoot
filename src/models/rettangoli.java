package models;

public class rettangoli {
    int base;
    int altezza;


    public rettangoli(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getrisultato(){
        return this.base*this.altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }
}
