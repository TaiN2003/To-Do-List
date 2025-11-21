import java.util.List;

public class AddTask {
    public static void addUserTask(List<String> tasks,String taskToAdd) {
        tasks.add(taskToAdd);
        TypingEffect.typing("Your task: " + taskToAdd + "\nhas been added! ", 65);
    }
}
