package Task_43;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        TV tv = new TV();
        Light light = new Light();

        TurnTVOn tvOnCommand = new TurnTVOn(tv);
        DimLights dimLightsCommand = new DimLights(light);

        remote.setCommand(0, tvOnCommand);
        remote.setCommand(1, dimLightsCommand);

        remote.pressButton(0);
        remote.pressButton(1);

        remote.pressUndo();
        remote.pressUndo();
    }
}