import java.util.List;

public class ViewTask {
    public static void printTaskList(List<String> tasks) {
        
        for (String task : tasks) {
            TypingEffect.typing(task, 25);
            System.out.println();
        }
    }
}
