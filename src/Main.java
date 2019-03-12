import input.InConsole;
import ui.UIconsole;

public class Main {
    public static void main(String[] args) {
        Action action= new Action(new UIconsole(),new InConsole());
        action.running();
    }
}
