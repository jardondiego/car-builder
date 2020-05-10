package mx.unam.ciencias.myp;

/** Clase auxiliar componente de carro que represente una parte del coche */
public class CarComponent {
    private double price;
    private double attackPoints;
    private double defensePoints;
    private double speedPoints;
    private String name;
    private ComponentType componentType;

    public CarComponent(String name, double price, double attackPoints, double defensePoints, double speedPoints, ComponentType componentType) {
        this.name = name;
        this.price = price;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.speedPoints = speedPoints;
        this.componentType = componentType;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public double getSpeedPoints() {
        return speedPoints;
    }

    public double getAttackPoints() {
        return attackPoints;
    }

    public double getDefensePoints() {
        return defensePoints;
    }

    public ComponentType getComponentType() {
        return componentType;
    }
}