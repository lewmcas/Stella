import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private int age;
    private int state = 0;
    private double tsudTariff = 0.37496;
    private double teTariff = 0.24233;
    private Flag flag = Flag.REALISTIC;
    private final ArrayList<Device> devices = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getTsudTariff() {
        return tsudTariff;
    }

    public void setTsudTariff(double tsudTariff) {
        this.tsudTariff = tsudTariff;
    }

    public double getTeTariff() {
        return teTariff;
    }

    public void setTeTariff(double teTariff) {
        this.teTariff = teTariff;
    }

    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void removeDevice(String DeviceName){

    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", state=" + state +
                '}';
    }
}