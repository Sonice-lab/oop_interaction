package ex_03;

public class ProductService {
    private ProductDao dao = new ProductDao();

    public void registerProduct(String name, int price) {
        Product newProduct = new Product(name, price);
        dao.insertProduct(newProduct);
    }
}
