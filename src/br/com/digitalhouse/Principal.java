package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {
        //instanciando
        Filho mateus = new Filho("Patricia", "Paulo", "Mateus");
        Filho carolina = new Filho("Maria Emilia", "Evandro", "Carolina");
        Filho fred = new Filho("Patricia", "Paulo", "Frederico");
        Filho bastardo = new Filho("Vitoria", "Paulo", "Bastardo");

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
        return temOmesmoPai(filho1,filho2)&&!temAmesmaMae(filho1,filho2)||
                !temAmesmaMae(filho1,filho2)&&temOmesmoPai(filho1,filho2);
    }

}
