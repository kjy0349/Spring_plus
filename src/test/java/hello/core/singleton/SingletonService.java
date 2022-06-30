package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() { // private 생성자. 외부에서 생성 할 수 없음.
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
