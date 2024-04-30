package HW18;

public class Androids implements Smartphones, LinuxOS{

    @Override
    public void call() {
        System.out.println("Calling was made from android");
    }

    @Override
    public void sms() {
        System.out.println("Sms was sent from android");
    }

    @Override
    public void internet() {
        System.out.println("Android connected to the internet");
    }

    @Override
    public void linuxOperatingSystem() {
        System.out.println("This android has LinuxOS");
    }
}
interface LinuxOS{
    void linuxOperatingSystem();
}