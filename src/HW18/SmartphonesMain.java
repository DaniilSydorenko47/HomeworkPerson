package HW18;

public class SmartphonesMain {
    public static void main(String[] args) {
        Androids android = new Androids();
        getAndroidFeatures(android);
        System.out.println();
        IPhones iPhone = new IPhones();
        getIphoneFeatures(iPhone);

    }
    public static void getAndroidFeatures(Androids android){
        android.call();
        android.sms();
        android.internet();
        android.linuxOperatingSystem();
    }
    public static void getIphoneFeatures(IPhones iphone){
        iphone.call();
        iphone.sms();
        iphone.internet();
        iphone.iphoneOperatingSystem();
    }
}
