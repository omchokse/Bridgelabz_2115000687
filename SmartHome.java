class Device {
    String deviceId, status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        System.out.println(deviceId + " " + status + " " + temperatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("T123", "ON", 22);
        t.displayStatus();
    }
}
