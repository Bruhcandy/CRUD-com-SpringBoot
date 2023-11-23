@Service
public class tarefaServicelmpl implements tarefaService {

    private static Map<Integer, tarefa> tarefas = new HashMap<>();
    private int nextId = 1;

    // Populate collection with some simple Items, to get the ball rolling.
    {
        insert(new tarefa("tarefa de mobile", true));
        insert(new tarefa("atividade de matematica", true));
        insert(new tarefa("atividade de português", false));
        insert(new tarefa("atividade de lógica", true));
    }

    @Override
    public tarefa gettarefis(int id) {
        return tarefas.get(id);
    }

    @Override
    public Collection<tarefa> gettarefas() {
        return tarefas.values();
    }

    @Override
    public void insert(tarefa tarefis) {
        tarefis.setId(nextId++);
        tarefas.put(tarefis.getId(), tarefis);
    }

    @Override
    public void update(tarefa tarefis) {
        int id = tarefis.getId();
        if (tarefas.containsKey(id)) {
            tarefas.put(id, tarefis);
        }
    }

    @Override
    public void delete(int id) {
        tarefa tarefis = tarefas.get(id);
        if (tarefis != null) {
            tarefas.remove(id);
        }
    }
}
