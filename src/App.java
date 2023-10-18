import entities.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("///////////// Telefone ///////////");
        iphone.atender();
        iphone.ligar();

        System.out.println("///////////// Reprodutor de músicas ///////////");
        iphone.reproduzir();
        iphone.pausar();
        iphone.proxima();
        iphone.retornar();

        System.out.println("///////////// Navegador de internet ///////////");
        iphone.abrirAba();
        iphone.fecharAba();
        iphone.navegar();
    }
}
