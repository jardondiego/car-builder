package mx.unam.ciencias.myp;

/** Builder de uno de los coches por default (carro promedio) */
public class AverageCarBuilder extends CarBuilder {
    public void buildChasis(CarComponent chasis) {
        car.setChasis(new CarComponent("Casual", 2500, 0, 0, 250, ComponentType.CHASIS));
    }

    public void buildWeapons(CarComponent weapons) {
        car.setWeapons(new CarComponent("Metralletas", 5000, 500, 0, 0, ComponentType.WEAPONS));
    }

    public void buildArmor(CarComponent armor) {
        car.setArmor(new CarComponent("Simple", 2500, 0, 500, 0, ComponentType.ARMOR));
    }

    public void buildTires(CarComponent tires) {
        car.setTires(new CarComponent("Simple", 2500, 0, 0, 250, ComponentType.TIRES));
    }

    public void buildMotor(CarComponent motor) {
        car.setMotor(new CarComponent("Simple", 2500, 0, 0, 500, ComponentType.MOTOR));
    }
}