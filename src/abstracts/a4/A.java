package abstracts.a4;

public abstract class A {
    abstract void firstMethod();
    void secondMethod(){
        System.out.println("SECOND");
        firstMethod();
    }
}
