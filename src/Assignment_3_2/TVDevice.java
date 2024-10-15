package Assignment_3_2;

class TVDevice implements Device {
    @Override
    public void powerOn() { System.out.println("TV: Power ON"); }
    @Override
    public void powerOff() { System.out.println("TV: Power OFF"); }
    @Override
    public void setChannel(int channel) { System.out.println("TV: Set Channel to " + channel); }
    @Override
    public void setVolume(int volume) { System.out.println("TV: Set Volume to " + volume); }
}

