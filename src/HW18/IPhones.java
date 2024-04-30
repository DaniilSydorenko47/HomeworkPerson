package HW18;

public class IPhones implements Smartphones,IOS {

    @Override
    public void call() {
        System.out.println("Calling was made from iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Sms was sent from iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Iphone connected to the internet");
    }

    @Override
    public void iphoneOperatingSystem() {
        System.out.println("This iPhone has iOS");
    }
}
interface IOS{
    void iphoneOperatingSystem();
}