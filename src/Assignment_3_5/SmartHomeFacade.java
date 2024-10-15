package Assignment_3_5;

class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;

    public SmartHomeFacade() {
        this.light = new Light();
        this.thermostat = new Thermostat();
        this.securitySystem = new SecuritySystem();
    }

    public void leaveHome() {
        light.turnOff();
        thermostat.setTemperature(18);
        securitySystem.arm();
        System.out.println("Left home mode activated.");
    }

    public void arriveHome() {
        light.turnOn();
        thermostat.setTemperature(22);
        securitySystem.disarm();
        System.out.println("Arrived home mode activated.");
    }
}

