package Service;

import Entity.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    List<Produto> produtoList = new ArrayList<>();

    public void create(String name) {
        produtoList.add(new Produto(name));
    }

    public List<Produto> read() {
        return produtoList;
    }

    public boolean update(int index, String name) {
        if(index < 0 || index > produtoList.size()) {
            System.out.println("Índice inválido.");
            return false;
        }
        produtoList.get(index).setName(name);
        return true;
    }

    public void delete(int index) {
        produtoList.remove(index);
    }
}
