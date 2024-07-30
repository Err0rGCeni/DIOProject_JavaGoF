package dio.singleton;

/**
 * Singleton Preguiçoso: A primeiro momento, não disponibiliza a instância
 * ao usuário
 */

public class SingletonLazy {
    private static SingletonLazy instancia;
    // Garante que ninguém externamente vai instanciar
    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
