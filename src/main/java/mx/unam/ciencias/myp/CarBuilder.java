package mx.unam.ciencias.myp;

/** Parte del patrón builder, el builder - se omite */
public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void createNewCar() {
        this.car = new Car();
    }

    public abstract void buildChasis(CarComponent chasis);
    public abstract void buildArmor(CarComponent armor);
    public abstract void buildWeapons(CarComponent weapons);
    public abstract void buildTires(CarComponent tires);
    public abstract void buildMotor(CarComponent motor);
}