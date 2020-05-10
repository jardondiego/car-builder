package mx.unam.ciencias.myp;

/** Builder de uno de los coches por default (carro pesado) */
public class HeavyCarBuilder extends CarBuilder {
    public void buildChasis(CarComponent chasis) {
        car.setChasis(new CarComponent("Camión", 5000, 250, 500, 0, ComponentType.CHASIS));
    }

    public void buildWeapons(CarComponent weapons) {
        car.setWeapons(new CarComponent("Arpones", 5000, 1000, 0, 0, ComponentType.WEAPONS));
    }

    public void buildArmor(CarComponent armor) {
        car.setArmor(new CarComponent("Tanque", 10000, 500, 2500, 0, ComponentType.ARMOR));
    }

    public void buildTires(CarComponent tires) {
        car.setTires(new CarComponent("Oruga de tanque", 10000, 500, 500, 0, ComponentType.TIRES));
    }

    public void buildMotor(CarComponent motor) {
        car.setMotor(new CarComponent("Diesel", 5000, 250, 0, 500, ComponentType.MOTOR));
    }
}