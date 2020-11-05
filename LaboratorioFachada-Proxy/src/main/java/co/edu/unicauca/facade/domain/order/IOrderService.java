package co.edu.unicauca.facade.domain.order;

import co.edu.unicauca.facade.access.IOrderRepository;

/**
 *Sujeto (Subject)
 * Interfaz que debe ser implementada tanto por los proxies como por los sujetos
 * que realizan la operación.
 * 
 * @author Cristian Pinto-Julio Mellizo
 */
public interface IOrderService {
    /**
     * Metodo para guardar el pedido en la base de datos.
     * @param repo 
     */
    public void save(IOrderRepository repo);
}
