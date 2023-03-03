package phone;

public class SmartPhone extends Phone implements Camera, MusicPlayer {
    @Override
    public void click() {
        System.out.println("Taking a picture");
    }

    @Override
    public void record() {
        System.out.println("Recording a video");
    }

    @Override
    public void play() {
        System.out.println("Playing music");
    }

    @Override
    public void stop() {
        System.out.println("Stopping music");
    }

    public static void main(String[] args) {
        SmartPhone sphone = new SmartPhone();
        Camera cam = new SmartPhone();
        MusicPlayer mp = new SmartPhone();

        sphone.call("123456");
        sphone.sms("123456", "Hello");

        cam.click();
        cam.record();

        mp.play();
        mp.stop();
    }
}
