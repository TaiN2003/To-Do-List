import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ToDoApp {
    
    private boolean isRunning = true;
    private List<String> tasks = new ArrayList<>();

    public void run() {
        Scanner scan = new Scanner(System.in);
        
        while (isRunning) {
            TypingEffect.typing("Welcome to your To-Do List!\nWhat would you like to do?", 65);
            TypingEffect.typing("\n- View\n- Add\n- Remove\n- Exit\n", 65);
            String userAction = scan.nextLine();

            switch (userAction.toLowerCase()) {
                case "view":
                    
                case "add":
                    TypingEffect.typing("What task would you like to add? ", 65);
                    String taskToAdd = scan.nextLine();

                    AddTask.addUserTask(tasks, taskToAdd);
                case "remove":

                case "exit":
                    TypingEffect.typing("Goodbye!", 65);
                    isRunning = false;
                    break;
                    
                default:
                    TypingEffect.typing("Action not recognized. Please try again.\n", 65);
                    
            }
        }
        scan.close();
    }
}
