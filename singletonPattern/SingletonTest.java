package singletonPattern;

public class SingletonTest {

    public void start() {
        ClassicSingleton classicSingleton1 = ClassicSingleton.getInstance();
        ClassicSingleton classicSingleton2 = ClassicSingleton.getInstance();
        System.out.println("classicNonThreadSafeSingleton1 = " + classicSingleton1);
        System.out.println("classicNonThreadSafeSingleton2 = " + classicSingleton2);

        StaticSingleton staticSingleton1 = StaticSingleton.getInstance();
        StaticSingleton staticSingleton2 = StaticSingleton.getInstance();
        System.out.println("classicThreadSafeSingleton1 = " + staticSingleton1);
        System.out.println("classicThreadSafeSingleton2 = " + staticSingleton2);

        SynchronizedSingleton synchronizedSingleton1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton2 = SynchronizedSingleton.getInstance();
        System.out.println("synchronizedSingleton1 = " + synchronizedSingleton1);
        System.out.println("synchronizedSingleton2 = " + synchronizedSingleton2);

        DCLSingleton dclSingleton1 = DCLSingleton.getInstance();
        DCLSingleton dclSingleton2 = DCLSingleton.getInstance();
        System.out.println("dclSingleton1 = " + dclSingleton1);
        System.out.println("dclSingleton2 = " + dclSingleton2);
    }
}
