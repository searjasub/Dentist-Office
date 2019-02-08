import controller.ClinicController;
import view.UserInteraction;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

            ClinicController clinic = new ClinicController(new UserInteraction());
            clinic.start();

    }
}
