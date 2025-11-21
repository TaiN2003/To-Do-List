import java.util.ArrayList;
import java.util.List;

public class TaskList {
    
    private List<String> tasks = new ArrayList<>();

    public void taskManager(List<String> tasks) {
        this.tasks = tasks;
    }
    public List<String> returnList() {
        return tasks;
    }
}
