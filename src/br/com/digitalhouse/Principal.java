package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        //instanciando
        Filho mateus = new Filho();
        Filho carolina = new Filho();
        Filho fred = new Filho();
        Filho bastardo = new Filho();

        //setando nomes dos pais e maes
        mateus.setMae("Patricia");
        mateus.setPai("Paulo");

        carolina.setMae("Maria Emilia");
        carolina.setPai("Evandro");

        fred.setMae("Patricia");
        fred.setPai("Paulo");

        bastardo.setMae("Vitoria");
        bastardo.setPai("Paulo");

        //chamando os metodos
        System.out.println(temAmesmaMae(mateus, fred)); //true
        System.out.println(temAmesmaMae(mateus, carolina)); //false
        System.out.println(temAmesmaMae(mateus, bastardo)); //false

        System.out.println(temOmesmoPai(mateus, fred)); //true
        System.out.println(temOmesmoPai(mateus, carolina)); //false
        System.out.println(temOmesmoPai(mateus, bastardo)); //true

        System.out.println(saoMeioIrmaos(mateus,fred)); //false
        System.out.println(saoMeioIrmaos(mateus,carolina)); //false
        System.out.println(saoMeioIrmaos(mateus,bastardo)); //true
    }

    //metodos de testes dos pais
    public static String maeDe(Filho filho){
        return filho.getMae();
    }

    public static String paiDe(Filho filho){
        return filho.getPai();
    }

    public static boolean temAmesmaMae(Filho filho1, Filho filho2) {
        return maeDe(filho1) == maeDe(filho2);
    }

    public static boolean temOmesmoPai(Filho filho1, Filho filho2) {
        return paiDe(filho1) == paiDe(filho2);
    }

    public static boolean saoMeioIrmaos(Filho filho1, Filho filho2) {
        return ((temOmesmoPai(filho1,filho2)||temAmesmaMae(filho1,filho2))&&!(temAmesmaMae(filho1,filho2)&&temOmesmoPai(filho1,filho2)));
    }

}
