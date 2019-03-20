import basket.Basket;
import category.Category;
import input.In;
import product.Product;
import ui.UI;
import user.User;

public class ActionStore {
    private UI ui;
    private In in;
    private User users;
    private Category[] categories;
    private Product[] products;
    private String action="";
    private Basket basket;



    public ActionStore(UI ui, In in) {
        this.ui = ui;
        this.in = in;
    }

    void running() {
        ui.start();
        while (true){
            if (!action.equals("2")) {
                String[] actions = {"1-Registration", "2-catalogue of products","3-return"};
                System.out.println("Select action!");
                for (String s : actions) {
                    System.out.println(s);
                }
                action = in.read();
            }
            if (action.equals("1")) {
                ui.menu(action);
                createUser();
                System.out.println("Input 2 to see catalogue");
                action=in.read();
            } else if (action.equals("2")) {
                ui.menu(action);
                String a = in.read();
                if (a.equals("1")) {
                    dressWoman();
                    System.out.println("Input name of category");
                    String b=in.read();
                    seeCategory(b);
                    if (users==null) {
                        System.out.println("At first, input 1 to register, please");
                        action=in.read();
                    } else {
                        System.out.println("Input name of product to put in the basket");
                        String c=in.read();
                        putInBasket(c);
                    }

                } else if (a.equals("2")) {
                    dressMan();
                    System.out.println("Input name of category");
                    String b=in.read();
                    seeCategory(b);
                    if (users==null) {
                        System.out.println("At first, input 1 to register, please");
                        action=in.read();
                    } else {
                        System.out.println("Input name of product to put in the basket");
                        String c=in.read();
                        putInBasket(c);
                        System.out.println(users.getBasket());
                    }
                }else if(a.equals("3")) {
                    return;
                }
            } else if(action.equals("3")){
                ui.menu(action);
            }
        }
    }


    void createUser() {
        String login = in.read();
        String password = in.read();
        users = new User(login, password, new Basket());
        System.out.println("Hello, " + users.getLogin());
    }

    void newProduct() {
        Product product1 = new Product("skirt", 20, "5");
        Product product2 = new Product("skirt1", 50, "5");
        Product product3 = new Product("blouse1", 10, "5");
        Product product4 = new Product("blouse2", 30, "5");
        Product product5 = new Product("coat", 100, "5");
        Product product6 = new Product("jacket", 90, "5");
        Product product7 = new Product("trousers1", 60, "5");
        Product product8 = new Product("trousers2", 50, "5");
        Product product9 = new Product("tie", 50, "5");
        Product product10 = new Product("tie1", 50, "5");
        Product[] skirt = {product1, product2};
        Product[] blouse = {product3, product4};
        Product[] outerwear = {product5, product6};
        Product[] trousers = {product7, product8};
        Product[] tie = {product9, product10};
        Category category1 = new Category("Skirt", "w", skirt);
        Category category2 = new Category("Blouse", "w", blouse);
        Category category3 = new Category("Outerwear", "m", outerwear);
        Category category4 = new Category("Trousers", "m", trousers);
        Category category5 = new Category("Tie", "m", tie);
        categories = new Category[]{category1, category2, category3, category4, category5};
    }

    void dressMan() {
        for (Category category : categories) {
            if (category.getSex().equals("m")) {
                System.out.println(category.getName());
            }
        }
    }

    void dressWoman() {
        for (Category category : categories) {
            if (category.getSex().equals("w")) {
                System.out.println(category.getName());
            }
        }
    }

    void seeCategory(String a){
        for (Category category : categories) {
            if (category.getName().equals(a)){
                for(Product product:category.getProducts()){
                    System.out.println(product);
                }
            }
        }
    }

    void putInBasket(String a) {
        for (Category category:categories){
            for (Product product:category.getProducts()){
                if (product.getName().equals(a)){
//                    basket.setProducts(product);
                    for (int i = 0; i < users.getBasket().getProducts().length; i++) {
                        if ( users.getBasket().getProducts()[i]==null) {
                            users.getBasket().getProducts()[i] = product;
                            break;
                        }
                    }
                }
            }
        }
    }
}




