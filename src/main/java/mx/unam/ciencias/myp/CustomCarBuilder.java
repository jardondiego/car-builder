package mx.unam.ciencias.myp;

/** Builder de carro personalizable que permite seleccionar los componentes de manera individual */
public class CustomCarBuilder extends CarBuilder {
    public void buildChasis(CarComponent chasis) {
        car.setChasis(chasis);
    }

    public void buildWeapons(CarComponent weapons) {
        car.setWeapons(weapons);
    }

    public void buildArmor(CarComponent armor) {
        car.setArmor(armor);
    }

    public void buildTires(CarComponent tires) {
        car.setTires(tires);
    }

    public void buildMotor(CarComponent motor) {
        car.setMotor(motor);
    }
}