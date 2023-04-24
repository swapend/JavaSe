package ProjectTest;

public abstract class Animal {
    public abstract void get();
    public void get1(){
        System.out.println("hello cat!!");
    }
}

class cat extends Animal{

    @Override
    public void get() {

    }
}
