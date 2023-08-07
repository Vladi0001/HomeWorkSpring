package homeworkspring.homeworkspring.Model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Cart {

    private final List<Integer> itens;

    public Cart() {
        this.itens = new ArrayList<>();
    }

    public List<Integer> getItens() {
        return itens;
    }

    public List<Integer> addItens (List <Integer> intensIds) {
        itens.addAll(intensIds);
        return itens;
    }
}
