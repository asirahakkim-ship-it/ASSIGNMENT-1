interface Playable{
    void play();
    void pause();
}
class AudioPlayer implements Playable{
    @Override
     public void play(){
        System.out.println("Play the Audio");
    }
    @Override
     public void pause(){
        System.out.println("Pause the Audio");
    }
}
class VideoPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("Play the video");
    }
    @Override
    public void pause(){
        System.out.println("Pause the video");
    }
}
public class PlayableMedia {
    public static void main(String[] args) {
        Playable audio=new AudioPlayer();
        Playable video=new VideoPlayer();
        audio.pause();
        audio.play();
        video.play();
        video.pause();
    }
}
