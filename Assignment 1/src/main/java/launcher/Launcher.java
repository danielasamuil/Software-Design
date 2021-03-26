package launcher;

import database.Bootstraper;

import java.sql.SQLException;

public class Launcher {

    public static boolean BOOTSTRAP = true;

    public static void main(String[] args) {
        bootstrap();

        ComponentFactory componentFactory = ComponentFactory.instance(false);
        componentFactory.getLoginView().setVisible();
    }

    private static void bootstrap() {
        if (BOOTSTRAP) {
            try {
                new Bootstraper().execute();
            } catch (SQLException throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
