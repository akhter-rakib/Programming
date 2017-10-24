package designPattern.factoryMethodPattern;
//this is the super class of Factory method patter
 /*we have abstract super class with overridden toString() method for testing purpose.*/
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM=" + this.getRAM() + ",HDD=" + this.getHDD() + ",CPU=" + this.getCPU();
    }
}
