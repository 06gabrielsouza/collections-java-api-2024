package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
                }
            }
            tarefaList.removeAll(tarefasParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}