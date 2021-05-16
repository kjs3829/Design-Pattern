package singletonPattern;

/**
 * 인스턴스를 시작하자마자 생성하는 싱글턴 패턴
 * 게으른 인스턴스 생성이 불가능하다.
 * Thread-safe 하다.
 */
public class StaticSingleton {
    private static StaticSingleton uniqueInstance = new StaticSingleton();

    private StaticSingleton() {}

    // 정적 메소드 또는 클래스 메소드라고 부른다.
    public static StaticSingleton getInstance() {

        return uniqueInstance;
    }
}
