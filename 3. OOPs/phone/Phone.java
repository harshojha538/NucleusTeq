package phone;

public class Phone {
    public void call(String number) {
        System.out.println("Calling " + number );
    }
    
    public void sms(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }
}

interface Camera {
    public void click();
    public void record();
}

interface MusicPlayer {
    public void play();
    public void stop();
}
