package youtube;

public class Subscriber implements Observer{

    private static int subscriberID = 0;
    private int subsID;
    private Channel channel;
    public Subscriber() {
        subscriberID ++;
        this.subsID = subscriberID;
    }
    @Override
    public void notifySubs() {
        String title = channel.videoTitle;
        String channelName = channel.name;
        System.out.println("SubsID "+subsID+"-->"+title +" Video Uploaded!! from "+ channelName);
    }

    public void subscribeChannel(Channel ch) {
        this.channel = ch;
        ch.registerObserver(this);
    }
    public void unsubscribeChannel(Channel ch) {
        ch.removeObserver(this);
    }
}
