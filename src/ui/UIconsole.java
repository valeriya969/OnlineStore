package ui;

public class UIconsole implements UI {
    @Override
    public void start() {
        System.out.println("Hello! It's online-store!");
    }

    @Override
    public void menu(String a) {
        if (a.equals("1")){
            System.out.println("Input login");
            System.out.println("Input password");
        } else if (a.equals("2")) {
            System.out.println("1-Ladiescloth 2-Mencloth 3-back");

        }else if (a.equals("3")){
            System.out.println("We will be glad to see you again!");
            return;
        }

        }





    @Override
    public void end() {

    }




}
