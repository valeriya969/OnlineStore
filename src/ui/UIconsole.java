package ui;

public class UIconsole implements UI {
    @Override
    public void start() {
        System.out.println("Hello! It's online-store!");
    }

    @Override
    public void menu() {
        String[] actions={"1-Registrate","2-catalogue of products",""};
        System.out.println("Select action!");
        for (String action : actions) {
            System.out.println(action);
        }

        }


    @Override
    public void end() {

    }




}
