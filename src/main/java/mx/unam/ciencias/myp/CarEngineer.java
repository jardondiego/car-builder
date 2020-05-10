package mx.unam.ciencias.myp;

/** Director o orquestrador - parte del patrón (se omite por redundancia) */
public class CarEngineer {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }
    
    public void buildCar(CarComponent chasis, CarComponent motor, CarComponent tires, CarComponent weapons, CarComponent armor) {
        carBuilder.createNewCar();
        carBuilder.buildArmor(armor);
        carBuilder.buildChasis(chasis);
        carBuilder.buildTires(tires);
        carBuilder.buildMotor(motor);
        carBuilder.buildWeapons(weapons);
    }
}   