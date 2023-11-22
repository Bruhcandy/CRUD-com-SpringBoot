
public class tarefaController {

    @Autowired
    private tarefaService service;

    // Get all items.
    @GetMapping(value="/tarefis", produces={"application/json","application/xml"})
    public Collection<tarefaController> getItarefas() {
        return service.gettarefas();
    }

    // Get a specific item.
    @GetMapping(value="/tarefis/{id}", produces={"application/json","application/xml"})
    public tarefaController getItem(@PathVariable int id) {
        return service.getarefas(id);
    }

    // Insert a new item.
    @PostMapping(value="/item",
            consumes={"application/json","application/xml"},
            produces={"application/json","application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
    public tarefaController addtarefis(@RequestBody tarefaController item) {
        service.insert(tarefis);
        return item;
    }

    // Update an existing item.
    @PutMapping(value="/tarefis/{id}", consumes={"application/json","application/xml"})
    public void modifyItem(@PathVariable int id, @RequestBody tarefaController tarefis) {
        System.out.println("Modifying item to " + tarefis);
        service.update(tarefis);
    }

    // Delete an existing item.
    @DeleteMapping("/tarefis/{id}")
    public void deletetarefis(@PathVariable int id) {
        service.delete(id);
    }
}
