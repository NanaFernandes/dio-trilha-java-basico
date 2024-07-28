package estudos.desafio.singleton;

/** 
 * Singleton "Apressado".
 * @author Nana
 * Desenvolvido durante o Bootcamp backend Java da Dio
*/

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}