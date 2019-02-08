import controller.ClinicController;
import view.UserInteraction;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ClinicController clinic = new ClinicController(new UserInteraction());
            clinic.start();
        } catch (ClassNotFoundException ex) {
            System.out.println("Classes got mixed and couldn't find the right one.");
        } catch (IOException ex){
            System.out.println("If you see this, that means that the ConsoleUI is not working.");
        }
    }
}
