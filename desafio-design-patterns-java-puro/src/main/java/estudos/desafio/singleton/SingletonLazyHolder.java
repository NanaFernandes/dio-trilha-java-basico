package estudos.desafio.singleton;

/** 
 * Singleton "Lazy Holder".
 * @author Nana
 * Desenvolvido durante o Bootcamp backend Java da Dio
*/

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}