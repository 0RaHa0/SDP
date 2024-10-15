package Assignment_3_2;

class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) { super(device); }
    @Override
    public void turnOn() { device.powerOn(); }
    @Override
    public void turnOff() { device.powerOff(); }
}

