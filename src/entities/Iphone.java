package entities;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void reproduzir() {
        System.out.println("Reproduzir musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar musica");

    }

    @Override
    public void proxima() {
        System.out.println("Proxima musica");
    }

    @Override
    public void retornar() {
        System.out.println("Voltar musica");
    }

    @Override
    public void navegar() {
        System.out.println("Navegador para site");
    }

    @Override
    public void abrirAba() {
        System.out.println("Abrir nova aba");
    }

    @Override
    public void fecharAba() {
        System.out.println("Fechar aba");
    }

    @Override
    public void atender() {
        System.out.println("Atender telefone");
    }

    @Override
    public void ligar() {
        System.out.println("Fazer ligação");
    }
}
