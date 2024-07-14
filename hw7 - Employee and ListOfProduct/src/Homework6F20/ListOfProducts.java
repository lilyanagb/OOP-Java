package Homework6F20;

import java.util.*;

public class ListOfProducts <E extends Product>{
    private ArrayList<E> products;

    public ArrayList<E> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<E> products) {
            this.products = products;
    }

    public String[] toArray(){
        String[] str=new String[10];

        for(int i=0;i<10;i++){
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
        double sum=products.stream().mapToDouble(Product::getPrice).sum();
        return sum/10;
    }

    @Override
    public String toString() {
        return products.toString();
    }
}
