package homeworkspring.homeworkspring.Controller;

import homeworkspring.homeworkspring.Service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public List<Integer> addItens(@RequestParam List <Integer> itensIds) {
        return orderService.addItens(itensIds);
    }

    @GetMapping("/get")
    public List<Integer> getItens() {
        return orderService.getItens();
    }

}
