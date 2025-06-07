package ConceptualLearning.Number11;

public class Main {
    public static void main(String[] args) {
        Device[] device = new Device[3];

        device[0] = new SmartPhone("갤럭시 S25", 80);
        device[1] = new Tablet("태블릿 X24", 92);
        device[2] = new Laptop("맥북  K25", 87);

        for(Device d : device) {
            d.turnOn();
            d.turnOff();
        }
    }
}
