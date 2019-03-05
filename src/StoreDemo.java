public class StoreDemo {
    public static void main(String[] args) {
        Product product1=new Product("Coat",200,"5");
        Product product2=new Product("Raincoat",250,"5");
        Product product3=new Product("Anorak",230,"5");
        Product product4=new Product("Anorak",100,"5");
        Product product5=new Product("Blouse",200,"5");
        Product product6=new Product("Skirt",250,"5");
        Product product7=new Product("Dress",230,"5");
        Product product8=new Product("Cardigan",100,"5");
        Product[] products1={product1,product2,product3,product4};
        Product[] products2={product5,product6,product7,product8};
        Category category1 = new Category("Overclothes",products1);
        Category category2 = new Category("WomanClothes",products2);
        Basket basket1=new Basket(new Product[]{product1,product3,product6});
        User user1=new User("Mike","34453",basket1);
    }
}
