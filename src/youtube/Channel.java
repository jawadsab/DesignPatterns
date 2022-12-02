package youtube;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    String name;
    String videoTitle;
    List<Observer> observers;
    public Channel(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers) {
            observer.notifySubs();
        }
    }

    public void videoUploaded() {
        notifyObservers();
    }

    public void uploadVideo(String title) {
        this.videoTitle = title;
        videoUploaded();
    }
}
