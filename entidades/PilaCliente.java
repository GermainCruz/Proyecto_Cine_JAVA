package entidades;

/**
 * Clase que representa una pila de clientes.
 * Incluye métodos para gestionar y buscar clientes dentro de la pila.
 */
public class PilaCliente {
    private NodoCliente tope; // Nodo superior de la pila

    public PilaCliente() {
        this.tope = null;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void push(Cliente cliente) {
        NodoCliente nuevo = new NodoCliente(cliente);
        if (!isEmpty()) {
            nuevo.setSgte(tope);
        }
        tope = nuevo;
    }

    public Cliente pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        Cliente cliente = tope.getCliente();
        tope = tope.getSgte();
        return cliente;
    }

    public Cliente peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }
        return tope.getCliente();
    }

    public void mostrar() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }

        NodoCliente actual = tope;
        while (actual != null) {
            Cliente cliente = actual.getCliente();

            System.out.println("Cliente ID: " + cliente.getIdCliente() +
                    ", Nombre: " + cliente.getNombre() + " " + cliente.getApellido() +
                    ", Edad: " + cliente.getEdad() +
                    ", Correo: " + cliente.getCorreo() +
                    ", Contraseña: " + cliente.getContrasena() +
                    ", Tipo Documento: " + cliente.getTipoDocumento() +
                    ", Número Documento: " + cliente.getNumeroDocumento() +
                    ", Departamento: " + cliente.getDepartamento() +
                    ", Es Socio: " + cliente.isEsSocio());

            actual = actual.getSgte();
        }
    }

    /**
     * Busca un cliente en la pila por su ID.
     * @param idCliente ID del cliente a buscar.
     * @return Cliente si se encuentra, de lo contrario null.
     */
    public Cliente buscarPorId(int idCliente) {
        NodoCliente actual = tope;

        while (actual != null) {
            if (actual.getCliente().getIdCliente() == idCliente) {
                return actual.getCliente();
            }
            actual = actual.getSgte();
        }

        return null;
    }

    /**
     * Busca un cliente en la pila por su número de documento.
     * @param numeroDocumento Número de documento del cliente a buscar.
     * @return Cliente si se encuentra, de lo contrario null.
     */
    public Cliente buscarPorNumeroDocumento(String numeroDocumento) {
        NodoCliente actual = tope;

        while (actual != null) {
            if (actual.getCliente().getNumeroDocumento().equals(numeroDocumento)) {
                return actual.getCliente();
            }
            actual = actual.getSgte();
        }
        return null;
    }

    /**
     * Busca un cliente que sea socio en la pila.
     * @return Cliente socio si se encuentra, de lo contrario null.
     */
    public Cliente buscarClienteSocio() {
        NodoCliente actual = tope;

        while (actual != null) {
            if (actual.getCliente().isEsSocio()) {
                return actual.getCliente();
            }
            actual = actual.getSgte();
        }

        return null;
    }
    
}
