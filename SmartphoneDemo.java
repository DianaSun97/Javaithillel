interface Smartphones {
    void call();
    void sms();
    void internet();
}

interface LinuxOS {
    void linuxFeature();
}

interface iOS {
    void iOSFeature();
}

class Androids implements Smartphones, LinuxOS {
    public void call() {
        System.out.println("Android call");
    }

    public void sms() {
        System.out.println("Android SMS");
    }

    public void internet() {
        System.out.println("Android internet access");
    }

    public void linuxFeature() {
        System.out.println("Linux-specific feature on Android");
    }
}

class iPhones implements Smartphones, iOS {
    public void call() {
        System.out.println("iPhone call");
    }

    public void sms() {
        System.out.println("iPhone SMS");
    }

    public void internet() {
        System.out.println("iPhone internet access");
    }

    public void iOSFeature() {
        System.out.println("iOS-specific feature on iPhone");
    }
}

public class SmartphoneDemo {
    public static void main(String[] args) {
        Smartphones android = new Androids();
        Smartphones iphone = new iPhones();

        android.call();
        android.sms();
        android.internet();

        iphone.call();
        iphone.sms();
        iphone.internet();
    }
}
