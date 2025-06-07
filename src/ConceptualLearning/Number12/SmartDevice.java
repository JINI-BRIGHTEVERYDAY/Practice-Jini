package ConceptualLearning.Number12;

public abstract class SmartDevice implements Controllable{
    private String deviceName;
    private boolean powerOn;

    public SmartDevice(String deviceName) {
        // 생성자 매개변수에 powerOn은 항상 false이므로 파라미터를 받을 필요가 없다.
        this.deviceName = deviceName;
        this.powerOn = false;

    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
        // this.powerOn = false 로 쓰면 틀린다
    }

    @Override
    public void turnOn() {
        powerOn = true;
        System.out.println(deviceName + "이 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        powerOn = false;
        System.out.println(deviceName + "이 꺼졌습니다.");
    }

    @Override
    public abstract void reset();

    // 추상메서드는 출력을 안해도 되지만, 나머지 메서드는 출력을 다 해주어야 한다

}
