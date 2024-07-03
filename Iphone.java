public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    
    public void pausar() {
        System.out.println("Música pausada.");
    }

   
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

   
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

   
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

   
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

   
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando Aparelho Telefônico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}