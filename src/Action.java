import input.In;
import ui.UI;

public class Action {
    UI ui;
    In in;
    User users;

    public Action(UI ui,In in) {
        this.ui = ui;
        this.in = in;
    }

    void running() {
        ui.start();

    while (true){
        if (users==null){
            ui.menu();
        }

    ui.menu();
    String action= in.read();
    if (action.equals("1")){
        createUser();

    }else if(action.equals("2")){
        return;
    }
    }

    }

   void createUser(){
        users= new User();
    }

    void newCategory(){

    }

}
