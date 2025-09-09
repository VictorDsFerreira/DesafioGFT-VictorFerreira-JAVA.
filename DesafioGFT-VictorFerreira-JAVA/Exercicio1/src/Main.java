public class Main {
    public static void main(String[] args) {

        Tarefa tarefa1 = new Tarefa("Limpar a sala", false);
        Tarefa tarefa2 = new Tarefa("Arrumar o quarto", true);
        Tarefa tarefa3 = new Tarefa("Limpar o quintal", false);

        tarefa1.exibirTarefa();
        tarefa2.exibirTarefa();
        tarefa3.exibirTarefa();
    }
}