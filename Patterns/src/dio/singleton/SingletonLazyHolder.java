package dio.singleton;

public class SingletonLazyHolder {
    // Encapsula a instância
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    // Garante que ninguém externamente vai instanciar
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
