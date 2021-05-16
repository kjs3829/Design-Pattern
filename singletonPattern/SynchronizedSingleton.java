package singletonPattern;

/**
 * synchronized를 이용한 싱글턴 패턴
 * 게으른 인스턴스 생성이 가능하다.
 * Thread-safe 하다.
 * 불필요한 오버헤드가 증가되어 속도에 문제가 생길 수 있다.
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton uniqueInstance;

    private SynchronizedSingleton() {}

    // synchronized 키워드는 한 스레드가 메소드를 사용 중이면 다른 스레드는 사용이 완료될 때까지 기다리게 한다.
    public static synchronized SynchronizedSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SynchronizedSingleton();
        }
        return uniqueInstance;
    }
}
