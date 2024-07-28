package estudos.desafio.singleton;

/** 
 * Singleton "Preguiçoso".
 * @author Nana
 * Desenvolvido durante o Bootcamp backend Java da Dio
*/

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        //Singleton privado, para garantir que não seja instânciado
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}