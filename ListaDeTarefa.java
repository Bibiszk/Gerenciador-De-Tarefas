import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeTarefa {
    private List<Tarefa> tarefas;

    public ListaDeTarefa() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
        System.out.println("✅ Tarefa adicionada!");
    }

    public void removerTarefa(String descricao) {
        boolean removido = tarefas.removeIf(t -> t.getDescricao().equalsIgnoreCase(descricao));
        if (removido) {
            System.out.println("❌ Tarefa removida!");
        } else {
            System.out.println("⚠️ Tarefa não encontrada.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("📭 Nenhuma tarefa na lista.");
        } else {
            System.out.println("📋 Lista de Tarefas:");
            for (Tarefa tarefa : tarefas) {
                System.out.println("- " + tarefa.getDescricao());
            }
        }
    }

    public void contarTarefas() {
        System.out.println("🔢 Total de tarefas: " + tarefas.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeTarefa lista = new ListaDeTarefa();
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Listar tarefas");
            System.out.println("4. Contar tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descAdicionar = scanner.nextLine();
                    lista.adicionarTarefa(descAdicionar);
                    break;
                case 2:
                    System.out.print("Digite a descrição da tarefa a remover: ");
                    String descRemover = scanner.nextLine();
                    lista.removerTarefa(descRemover);
                    break;
                case 3:
                    lista.listarTarefas();
                    break;
                case 4:
                    lista.contarTarefas();
                    break;
                case 0:
                    System.out.println("👋 Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
