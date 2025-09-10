@FunctionalInterface
interface LightAction {
    void execute();
}

public class SmartHome {
    public static void main(String[] args) {
        LightAction motionSensor = () -> System.out.println("Lights ON due to motion!");
        LightAction timeOfDay = () -> System.out.println("Dim lights for evening mode!");
        LightAction voiceCommand = () -> System.out.println("Voice command: Turn ON bright lights!");

        motionSensor.execute();
        timeOfDay.execute();
        voiceCommand.execute();
    }
}
