package ConceptualLearning.Number11;

public abstract class AbstractDevice implements Device{
    private String name;
    private int batteryLevel;

    public AbstractDevice(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


}
