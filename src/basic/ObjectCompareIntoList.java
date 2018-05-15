package basic;

import java.util.ArrayList;
import java.util.List;

public class ObjectCompareIntoList {
    public static void main(String[] args) {
        List<ProductModel> productModels = new ArrayList<ProductModel>();
        List<ProductModel> UpdateProduct = new ArrayList<ProductModel>();
        ProductModel productModel1 = new ProductModel(1, 2, 10.2);
        ProductModel productModel2 = new ProductModel(2, 2, 10.2);
        ProductModel productModel3 = new ProductModel(1, 2, 10.2);
        ProductModel productModel4 = new ProductModel(1, 2, 10.2);
        ProductModel productModel5 = new ProductModel(3, 2, 10.2);
        ProductModel productModel6 = new ProductModel(4, 2, 10.2);
        productModels.add(productModel1);
        productModels.add(productModel2);
        productModels.add(productModel3);
        productModels.add(productModel4);
        productModels.add(productModel5);
        productModels.add(productModel6);
        Integer id, qty;
        Double totalAmount;
        Integer[] itemCheck = new Integer[productModels.size()];
        for (int i = 0; i < productModels.size(); i++) {
            itemCheck[i] = 0;
        }
        for (int i = 0; i < productModels.size(); i++) {
            id = productModels.get(i).getId();
            qty = productModels.get(i).getQty();
            totalAmount = productModels.get(i).getTotalAmount();
            for (int j = i + 1; j < productModels.size(); j++) {
                if (productModels.get(i).getId().equals(productModels.get(j).getId())) {
                    qty += productModels.get(j).getQty();
                    totalAmount += productModels.get(j).getTotalAmount();
                    itemCheck[j] = 1;
                }
            }
            if (itemCheck[i] != 1) {
                ProductModel productModel = new ProductModel(id, qty, totalAmount);
                UpdateProduct.add(productModel);
            }

        }
        System.out.println(UpdateProduct);

    }
}
