package Assignment_3_2;

class HomeEntertainmentSystem {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        RemoteControl remote = new BasicRemote(tv);
        remote.turnOn();
        remote.turnOff();

        remote = new AdvancedRemote(tv);
        remote.turnOn();
        ((AdvancedRemote) remote).setChannel(5);
        remote.turnOff();
    }
}

