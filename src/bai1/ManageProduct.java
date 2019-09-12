package bai1;

import java.util.ArrayList;

public class ManageProduct {
    ArrayList<Product> manageProduct = new ArrayList<>();

    public void displayProduct() {
        for (int i = 0; i < manageProduct.size(); i++) {
            getInfoProduct(i);
        }
    }

    public void addNewProduct(int id, String name, float price, String description) {
        Product product = new Product(id, name, price, description);
        manageProduct.add(product);
    }

    public void editProduct(int index, Product newProduct) {
        manageProduct.set(index, newProduct);
    }

    public void removeProduct(int index) {
        manageProduct.remove(index);
    }

    public void searchProduct(String name) {
        for (int i = 0; i < manageProduct.size(); i++) {
            if (manageProduct.get(i).getName() == name) {
                getInfoProduct(i);
            }
        }
    }

    private void getInfoProduct(int i) {
        System.out.println("Info Product" + (i + 1) + " :");
        System.out.println("Id : " + manageProduct.get(i).getId());
        System.out.println("Name : " + manageProduct.get(i).getName());
        System.out.println("Price : " + manageProduct.get(i).getPrice());
        System.out.println("Description : " + manageProduct.get(i).getDescription() + "\n");
    }
}
