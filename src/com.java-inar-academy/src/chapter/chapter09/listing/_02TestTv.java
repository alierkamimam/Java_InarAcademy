package chapter.chapter09.listing;

public class _02TestTv {
    public static void main(String[] args) {
       _02TV tv1=new _02TV();
       tv1.turnOn();
       tv1.setChannel(30);
       tv1.setVolume(3);

       _02TV tv2=new _02TV();
       tv2.turnOn();
       tv2.channelUp();
       tv2.channelUp();
       tv2.volumeUp();


        System.out.println("tv1' channel is " +tv1.channel+
                " and volume level is "+tv1.volume);
        System.out.println("-----------------");
        System.out.println("Tv2's channel is "+tv2.channel+
                " and volume level is "+tv2.volume);


    }
}
