import com.example.salesmaster.entities.Client;
import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.repositories.ClientRepository;
import com.example.salesmaster.repositories.ProduitRepository;
import com.example.salesmaster.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class ProduitServiceimpl implements ProduitService {


    private ProduitRepository produitRepository;

    @Autowired
    public ProduitServiceimpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }


    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }


    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);   }


    @Override
    public void deleteAllProduits() {
        produitRepository.deleteAll();
    }

    @Override
    public Produit getProduitById(Long id) {
        return produitRepository.findById(id).get();
    }


    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }
}