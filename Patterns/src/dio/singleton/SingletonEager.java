package dio.singleton;

/**
 * Singleton Apressado
 */

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();
    // Garante que ninguém externamente vai instanciar
    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
