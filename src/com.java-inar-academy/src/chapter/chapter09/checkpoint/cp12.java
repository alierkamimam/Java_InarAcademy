package chapter.chapter09.checkpoint;

class cp12 {
    public static void main(String[] args) {
        A a =new A("erkam");
        a.print();

    }
}
    class A{
        String s;
        A(String newS){
            s=newS;
        }
        public void print(){
            System.out.println(s);
        }
    }

