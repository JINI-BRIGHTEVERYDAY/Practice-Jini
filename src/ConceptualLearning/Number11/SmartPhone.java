package ConceptualLearning.Number11;

public class SmartPhone extends AbstractDevice implements Device{

    public SmartPhone(String name, int batteryLevel) {
        super(name, batteryLevel);
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰" + getName() + "이 켜졌습니다. 배터리 수준은 " + getBatteryLevel() + "입니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰" + getName() + "이 꺼졌습니다. 배터리 수준은 " + getBatteryLevel() + "입니다.");
    }

}
