package mx.unam.ciencias.myp;

import java.util.Scanner;

public class Main {
    /*
     * Descripción general del programa
     * 
     * ¡Bienvenido al constructor de autos! Elije el auto que quieras construir
     * 
     * 1. Deportivo 2. Tanque 3. Normal 4. Personalizar
     * 
     * Una vez construido el auto muestra las estadísticas y termina el programa.
     * 
     * En la opción 4. se activa el menú constructor de autos personalizados que
     * permite personalizar llantas, carrocería, motor, blindaje y armas, en ese
     * orden.
     * 
     * Cada auto cuenta con las siguientes propiedades: Puntos de ataque Puntos de
     * defensa Puntos de velocidad Precio
     * 
     * Las características del auto se ven afectadas por los componentes que se
     * escogen
     * 
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Promedio");
        System.out.println("2. Pesado");
        System.out.println("3. Deportivo");
        System.out.println("4. Personalizar");
        System.out.print("Elige una opcion: ");

        int option;

        option = scanner.nextInt();
        CarEngineer engineer = new CarEngineer();

        if (option == 1) {
            AverageCarBuilder averageCarBuilder = new AverageCarBuilder();
            engineer.setCarBuilder(averageCarBuilder);
            engineer.buildCar(null, null, null, null, null);
        } else if (option == 2) {
            HeavyCarBuilder heavyCarBuilder = new HeavyCarBuilder();
            engineer.setCarBuilder(heavyCarBuilder);
            engineer.buildCar(null, null, null, null, null);
        } else if (option == 3) {
            SportsCarBuilder sportsCarBuilder = new SportsCarBuilder();
            engineer.setCarBuilder(sportsCarBuilder);
            engineer.buildCar(null, null, null, null, null);
        } else if (option == 4) {
            CustomCarBuilder customCarBuilder = new CustomCarBuilder();
            engineer.setCarBuilder(customCarBuilder);

            // Customize chasis
            int chasisOption;
            CarComponent chasis = null;

            System.out.println("1. Casual");
            System.out.println("2. Camión");
            System.out.println("3. Deportiva");

            chasisOption = scanner.nextInt();

            if (chasisOption == 1)
                chasis = new CarComponent("Casual", 2500, 0, 0, 250, ComponentType.CHASIS);
            else if (chasisOption == 2)
                chasis = new CarComponent("Camión", 5000, 250, 500, 0, ComponentType.CHASIS);
            else if (chasisOption == 3) {
                chasis = new CarComponent("Deportivo", 10000, 0, 0, 1000, ComponentType.CHASIS);
            } else {
                System.out.println("Opción inválida");
                System.exit(1);
            }

            // Customize tires
            int tiresOption;
            CarComponent tires = null;

            System.out.println("1. Casual");
            System.out.println("2. Off-rad");
            System.out.println("3. Deportiva");
            System.out.println("4. Oruga de tanque");

            tiresOption = scanner.nextInt();

            if (tiresOption == 1)
                tires = new CarComponent("Simple", 2500, 0, 0, 250, ComponentType.TIRES);
            else if (tiresOption == 2)
                tires = new CarComponent("Off-road", 5000, 0, 0, 500, ComponentType.TIRES);
            else if (tiresOption == 3) {
                tires = new CarComponent("Deportivas", 10000, 0, 0, 1000, ComponentType.TIRES);
            } else if (tiresOption == 4) {
                tires = new CarComponent("Oruga de tanque", 10000, 500, 500, 0, ComponentType.TIRES);
            } else {
                System.out.println("Opción inválida");
                System.exit(1);
            }

            // Customize motor
            int motorOption;
            CarComponent motor = null;

            System.out.println("1. Deportivo");
            System.out.println("2. Diesel");
            System.out.println("3. Simple");

            motorOption = scanner.nextInt();

            if (motorOption == 1)
                motor = new CarComponent("Simple", 2500, 0, 0, 500, ComponentType.MOTOR);
            else if (motorOption == 2)
                motor = new CarComponent("Diesel", 5000, 250, 0, 500, ComponentType.MOTOR);
            else if (motorOption == 3) {
                motor = new CarComponent("Deportivo", 10000, 0, 0, 2500, ComponentType.MOTOR);
            } else {
                System.out.println("Opción inválida");
                System.exit(1);
            }

            // Customize weapons
            int weaponOption;
            CarComponent weapons = null;

            System.out.println("1. Arpones");
            System.out.println("2. Lanzallamas");
            System.out.println("3. Lanzas");
            System.out.println("4. Sierra");
            System.out.println("5. Metralleta");

            weaponOption = scanner.nextInt();

            if (weaponOption == 1)
                weapons = new CarComponent("Arpones", 5000, 1000, 0, 0, ComponentType.WEAPONS);
            else if (weaponOption == 2)
                weapons = new CarComponent("Lanzallamas", 5000, 1000, 0, 0, ComponentType.WEAPONS);
            else if (weaponOption == 3) {
                weapons = new CarComponent("Lanzas", 5000, 500, 0, 0, ComponentType.WEAPONS);
            } else if (weaponOption == 4) {
                weapons = new CarComponent("Sierra", 2500, 250, 0, 0, ComponentType.WEAPONS);
            } else if (weaponOption == 5) {
                weapons = new CarComponent("Metralletas", 5000, 500, 0, 0, ComponentType.WEAPONS);
            } else {
                System.out.println("Opción inválida");
                System.exit(1);
            }

            // Customize armor
            int armorOption;
            CarComponent armor = null;

            System.out.println("1. Simple");
            System.out.println("2. Reforzado");
            System.out.println("3. Tanque");

            armorOption = scanner.nextInt();

            if (armorOption == 1)
                armor = new CarComponent("Simple", 2500, 0, 500, 0, ComponentType.ARMOR);
            else if (armorOption == 2)
                armor = new CarComponent("Reforzado", 5000, 0, 1000, 0, ComponentType.ARMOR);
            else if (armorOption == 3) {
                armor = new CarComponent("Tanque", 10000, 500, 2500, 0, ComponentType.ARMOR);
            } else {
                System.out.println("Opción inválida");
                System.exit(1);
            }

            engineer.buildCar(chasis, motor, tires, weapons, armor);
        } else {
            System.out.println("Opción inválida");
            System.exit(1);
        }

        Car car = engineer.getCar();
        System.out.println("Estadísticas ->");
        System.out.println("Puntos de ataque: " + car.getAttackPoints());
        System.out.println("Puntos de defensa: " + car.getDefensePoints());
        System.out.println("Puntos de velocidad: " + car.getSpeedPoints());
        System.out.println("Precio: " + car.getPrice());
    }
}