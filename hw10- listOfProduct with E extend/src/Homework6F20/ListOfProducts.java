package Homework6F20;

import java.util.*;

public class ListOfProducts <E extends Product>{
    private ArrayList<E> products =new ArrayList<>();

    public ArrayList<E> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<E> products) {
        this.products = products;
    }

    public void addProduct(E product){
        products.add(product);
    }

    public String[] toArray(){
        String[] str=new String[products.size()];

        for(int i=0;i<products.size();i++){
            str[i]= products.get(i).toString();
        }
        return str;
    }

    public void setup(){
        Random random=new Random();

        ArrayList<Product> list=new ArrayList<>(10);
        for(int i=0;i<10;i++){
            list.add(new Product("orange", 0.1+ random.nextInt(100), Product.Category.A));
        }
    }

    public double averagePrice(){
        OptionalDouble sum=products.stream().mapToDouble(Product::getPrice).average();
        return sum.getAsDouble();
    }

    @Override
    public String toString() {
        String result="[";
        for (int i = 0; i < products.size(); i++) {
            result+=products.get(i).getInvDescription()+",";
        }
        return result+"]";
    }
}
