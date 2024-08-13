package To_do_list;
import java.util.ArrayList;
import java.util.HashMap;

public class TaskManager {
    // список подзадач, эпика и задачи
    private HashMap<Integer, Task> tasks;
    private HashMap<Integer, Subtask> subtasks;
    private HashMap<Integer, Epic> epics;

    // Получение списка всех задач.
    public ArrayList<Task> getTasks() {
        return new ArrayList<>(tasks.values());
    }

    public ArrayList<Subtask> getSubtasks() {
        // TODO
    }

    public ArrayList<Epic> getEpics() {
        // TODO
    }

    // Получение по идентификатору.
    public Task getTaskById(int id) {
        return tasks.get(id);
    }

    public Subtask getSubtaskById(int id) {
        // TODO
    }

    // Создание
    public void createTask(Task task) {
        task.setId(/*установить уникальный id*/);
        tasks.put(task.getId(), task);
    }

    public void createEpic(Epic epic) {
        epic.setId(/*установить уникальный id*/);
        epics.put(epic.getId(), epic);
    }

    public void createSubtask(...) {
        // TODO
    }
}
