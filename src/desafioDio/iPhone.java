package desafioDio;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    // Implementa��o dos m�todos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando m�sica...");
    }

    @Override
    public void pausar() {
        System.out.println("M�sica pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("M�sica selecionada: " + musica);
    }

    // Implementa��o dos m�todos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    // Implementa��o dos m�todos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo p�gina: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("P�gina atualizada.");
    }
}