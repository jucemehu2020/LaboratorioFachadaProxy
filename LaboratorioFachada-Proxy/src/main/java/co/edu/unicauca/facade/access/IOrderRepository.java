package co.edu.unicauca.facade.access;

import co.edu.unicauca.facade.domain.order.Order;

/**
 *
 * @author Cristian Pinto-Julio Mellizo
 */
public interface IOrderRepository {
   
    
    public void createOrder(Order order);
}
