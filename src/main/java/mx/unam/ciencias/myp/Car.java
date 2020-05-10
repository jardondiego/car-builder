package mx.unam.ciencias.myp;

/**
 * Clase carro - Representa un carro: un conjunto de componentes
 */
public class Car {
    private CarComponent carChasis;
    private CarComponent carTires;
    private CarComponent carArmor;
    private CarComponent carWeapons;
    private CarComponent carMotor;

    /** Setter del chasis (parte del patrón) */
    public void setChasis(CarComponent chasis) {
        if (chasis.getComponentType() != ComponentType.CHASIS)
            throw new Error("Invalid chasis component type");

        this.carChasis = chasis;
    }

    /** Setter de las llantas (parte del patrón) */
    public void setTires(CarComponent tires) {
        if (tires.getComponentType() != ComponentType.TIRES)
            throw new Error("Invalid tires component type");

        this.carTires = tires;
    }


    /** Setter de la armadura (parte del patrón) */
    public void setArmor(CarComponent armor) {
        if (armor.getComponentType() != ComponentType.ARMOR)
            throw new Error("Invalid armor component type");

        this.carArmor = armor;
    }


    /** Setter de las armas  (parte del patrón) */
    public void setWeapons(CarComponent weapons) {
        if (weapons.getComponentType() != ComponentType.WEAPONS)
            throw new Error("Invalid weapons component type");

        this.carWeapons = weapons;
    }


    /** Setter del motor  (parte del patrón) */
    public void setMotor(CarComponent motor) {
        if (motor.getComponentType() != ComponentType.MOTOR)
            throw new Error("Invalid motor component type");

        this.carMotor = motor;
    }

    /** Función auxiliar para calcular el precio del carro en su totalidad */
    public double getPrice() {
        double totalPrice = 0;

        totalPrice += carChasis == null ? 0 : carChasis.getPrice();
        totalPrice += carWeapons == null ? 0 : carWeapons.getPrice();
        totalPrice += carArmor == null ? 0 : carArmor.getPrice();
        totalPrice += carTires == null ? 0 : carTires.getPrice();
        totalPrice += carMotor == null ? 0 : carMotor.getPrice();

        return totalPrice;
    }

    public double getAttackPoints() {
        double totalAttackPoints = 0;

        totalAttackPoints += carChasis == null ? 0 : carChasis.getAttackPoints();
        totalAttackPoints += carWeapons == null ? 0 : carWeapons.getAttackPoints();
        totalAttackPoints += carArmor == null ? 0 : carArmor.getAttackPoints();
        totalAttackPoints += carTires == null ? 0 : carTires.getAttackPoints();
        totalAttackPoints += carMotor == null ? 0 : carMotor.getAttackPoints();

        return totalAttackPoints;
    }

    public double getDefensePoints() {
        double totalDefensePoints = 0;

        totalDefensePoints += carChasis == null ? 0 : carChasis.getDefensePoints();
        totalDefensePoints += carWeapons == null ? 0 : carWeapons.getDefensePoints();
        totalDefensePoints += carArmor == null ? 0 : carArmor.getDefensePoints();
        totalDefensePoints += carTires == null ? 0 : carTires.getDefensePoints();
        totalDefensePoints += carMotor == null ? 0 : carMotor.getDefensePoints();

        return totalDefensePoints;
    }

    public double getSpeedPoints() {
        double totalSpeedPoints = 0;

        totalSpeedPoints += carChasis == null ? 0 : carChasis.getSpeedPoints();
        totalSpeedPoints += carWeapons == null ? 0 : carWeapons.getSpeedPoints();
        totalSpeedPoints += carArmor == null ? 0 : carArmor.getSpeedPoints();
        totalSpeedPoints += carTires == null ? 0 : carTires.getSpeedPoints();
        totalSpeedPoints += carMotor == null ? 0 : carMotor.getSpeedPoints();

        return totalSpeedPoints;
    }
}