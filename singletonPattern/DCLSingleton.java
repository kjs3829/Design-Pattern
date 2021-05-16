package singletonPattern;

/**
 * DCL(Double-Checking Locking)을 이용한 싱글턴 패턴
 * 자바 1.4 이후 버전부터 사용이 가능하다.
 * 게으른 인스턴스 생성이 가능하다.
 * Thread-safe 하다.
 * 불필요한 오버헤드가 없어 속도에 문제를 주지 않는다.
 * 언어, 하드웨어에 따라 작동하지 않을 수도 있어 현재는 권장하지 않는다.
 */
public class DCLSingleton {
    private volatile static DCLSingleton uniqueInstance;

    private DCLSingleton() {}

    public static DCLSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DCLSingleton.class) {
                uniqueInstance = new DCLSingleton();
            }
        }
        return uniqueInstance;
    }
}
