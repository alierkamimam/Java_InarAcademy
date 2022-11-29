package chapter.chapter13.checkpoint;

 public interface cp16 {
    void m1();

}
class B implements cp16{

    @Override
    public void m1() {
        System.out.println("m1");
    }
}
