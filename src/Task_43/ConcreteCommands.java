package Task_43;

class TurnTVOn implements Command {
    TV tv;

    public TurnTVOn(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}

class DimLights implements Command {
    Light light;

    public DimLights(Light light) {
        this.light = light;
    }

    public void execute() {
        light.dim();
    }

    public void undo() {
        light.bright();
    }
}
