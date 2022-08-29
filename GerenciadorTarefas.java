import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorTarefas {

    public static void main(String[] args) {
		String tarefa;
		char opcao;
        ArrayList<String> listaTarefas = new ArrayList();
		Scanner scan = new Scanner(System.in);

		for(int i = 0; i < 1;){
            System.out.println("Escolha uma opcao:");
			System.out.println("1 = Listar\n2 = Adicionar\n3 = Excluir\n0 = Encerrar");
            opcao = scan.nextLine().charAt(0);
			
            switch (opcao) {
                case '1':
                    for(int j = 0; j < listaTarefas.size(); j++) {
                        System.out.println(listaTarefas.get(j));
                    }
					break;
                case '2':
                    System.out.println("\nAdicione uma tarefa:");
					tarefa = scan.nextLine();
                    listaTarefas.add(tarefa);
					break;
                case '3':
                    System.out.println("\nExcluir tarefa:");
					tarefa = scan.nextLine();
                    listaTarefas.remove(tarefa);
					break;
                case '0':
                    i = 10;
					break;
                default:
                    System.out.println("ERROR!");
					break;
            }
		}
    }
	
}