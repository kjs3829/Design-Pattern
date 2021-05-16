package singletonPattern;

/**
 * 고전적인 싱글턴 패턴
 * 게으른 인스턴스 생성이 가능하다.
 * Thread-safe 하지 않다.
 */
public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {}

    // 정적 메소드 또는 클래스 메소드라고 부른다.
    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }
}
