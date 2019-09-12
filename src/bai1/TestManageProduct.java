package bai1;

public class TestManageProduct {
    public static void main(String[] args) {
        ManageProduct manageProduct = new ManageProduct();

        manageProduct.addNewProduct(1,"IphoneX",1100,"very nice");
        manageProduct.addNewProduct(2,"Xiaomi Mimix 2S",800,"Good price");

        Product newProduct = new Product(2,"Xiaomi Mimix 2S", 700,"Good price");
        manageProduct.editProduct(1,newProduct);

        manageProduct.removeProduct(1);

//        manageProduct.displayProduct();
        manageProduct.searchProduct("IphoneX");
//        manageProduct.searchProduct("Xiaomi Mimix 2S");

    }
}
