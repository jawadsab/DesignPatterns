import youtube.Channel;
import youtube.Subscriber;

public class YouTube {
    public static void main(String[] args) {
        Channel javascriptMastery = new Channel("JavaScriptMastery");

        Subscriber sub1 = new Subscriber();
        Subscriber sub2 = new Subscriber();
        Subscriber sub3 = new Subscriber();

        sub1.subscribeChannel(javascriptMastery);
        sub2.subscribeChannel(javascriptMastery);

        javascriptMastery.uploadVideo("Basic JS");
        sub1.unsubscribeChannel(javascriptMastery);

        javascriptMastery.uploadVideo("React Basics");
    }
}
