package homeworkspring.homeworkspring.Service;

import java.util.List;

public interface OrderService {
    List<Integer> addItens(List<Integer> itensIds);
    List<Integer> getItens();
}
