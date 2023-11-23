@RestController
@RequestMapping("/api/tarefas")
public class tarefaController {

    @Autowired
    private tarefaService service;

    // Get all tarefas.
    @GetMapping(produces = {"application/json", "application/xml"})
    public Collection<tarefa> getItarefas() {
        return service.gettarefas();
    }

    // Get a specific tarefa.
    @GetMapping(value = "/{id}", produces = {"application/json", "application/xml"})
    public tarefa getItem(@PathVariable int id) {
        return service.gettarefis(id);
    }

    // Insert a new tarefa.
    @PostMapping(consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    public tarefa addtarefis(@RequestBody tarefa tarefis) {
        service.insert(tarefis);
        return tarefis;
    }

    // Update an existing tarefa.
    @PutMapping(value = "/{id}", consumes = {"application/json", "application/xml"})
    public void modifyItem(@PathVariable int id, @RequestBody tarefa tarefis) {
        System.out.println("Modifying item to " + tarefis);
        tarefis.setId(id);
        service.update(tarefis);
    }

    // Delete an existing tarefa.
    @DeleteMapping("/{id}")
    public void deletetarefis(@PathVariable int id) {
        service.delete(id);
    }
}