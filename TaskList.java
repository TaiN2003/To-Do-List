import java.util.ArrayList;
import java.util.List;

public class TaskList {
    
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }
    public void removeTask(int index) {
        if(index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
        else {
            TypingEffect.typing("No task to remove!", index);
        }
    }
    public List<String> getTasks() {
        return tasks;
    }
}
