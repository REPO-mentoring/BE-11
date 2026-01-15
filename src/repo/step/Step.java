package repo.step;

import repo.domain.Order;

public interface Step {
    public void run(Order order);

    public String name();
}
