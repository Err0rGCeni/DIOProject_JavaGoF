import dio.singleton.SingletonEager;
import dio.singleton.SingletonLazy;
import dio.singleton.SingletonLazyHolder;
import dio.strategy.Comportamento;
import dio.strategy.ComportamentoNormal;
import dio.strategy.Robo;
import dio.strategy.ComportamentoDefensivo;
import dio.strategy.ComportamentoAgressivo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Singleton Time!");
        testeSingleton();
        System.out.println("Strategy Time!");
        testeStrategy();
    }

    public static void testeSingleton() {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy == lazy2);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }

    public static void testeStrategy() throws Exception {
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
    }
}
