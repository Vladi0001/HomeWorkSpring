package homeworkspring.homeworkspring.Service;

import homeworkspring.homeworkspring.Model.Cart;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl implements OrderService{

    private final Cart cart;

    public OrderServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public List<Integer> addItens(List<Integer> itensIds) {
        return cart.addItens(itensIds);
    }

    @Override
    public List<Integer> getItens() {
        return cart.getItens();
    }
}
