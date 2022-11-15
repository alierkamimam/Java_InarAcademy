package chapter.chapter11.checkpoint;

public class cp23 {
    public static void main(String[] args) {
        new K();
        new H();
    }
}

class K {
    int i = 7;

    public K() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class H extends K {
    public H() {
        System.out.println("i from B is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}

