import entities.Produits;

import com.test.tp5.dao.ProduitDaoImpl;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ProduitDaoImpl produitDao = new ProduitDaoImpl();

        List<Produits> produitsList = produitDao.produitsParMC("Iphone");
        produitsList.forEach(System.out::println);
    }
}
