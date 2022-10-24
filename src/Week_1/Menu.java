package Week_1;

public class Menu {

    public static void choiceProject(int projectNum) {
        if (projectNum == 1) {
            Project_1.entryPoint();
        } else {
            Project_2.entryPoint();
        }
    }
}
