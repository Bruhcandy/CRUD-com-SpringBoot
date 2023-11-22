public class tarefa {
    private int id;
    private String descricao;
    private boolean feita;


    public tarefa(){
    }
    public tarefa(boolean feita, String descricao,){

        this.descricao = descricao;
        this.feita = feita;
    }
    public void Update(tarefa tarefis) {
        if (tarefas != null) {
            this.descricao  = tarefas.descricao;
            this.feita = tarefas.feita;
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFeita() {
        return feita;
    }

    public void setFeita(boolean feita) {
        this.feita = feita;
    }
    @Override
    public String toString() {
        return "tarefa [id=" + id + ", descrição=" + descricao + ", feita=" + feita + "]";
    }

}