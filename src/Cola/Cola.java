package Cola;
import Lista.Lista;
import Lista.Nodo;
public class Cola extends Lista {

    @Override
    public void insertarFin(int dato) {
        if(estaVacia())
        {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(nuevo);
            inicio=nuevo;
        }
        else
        {
            Nodo nuevo = new Nodo();
            nuevo.setDato(dato);
            nuevo.setSiguiente(inicio);

            Nodo ultimo = inicio;

            while(ultimo.getSiguiente() != inicio)
            {
                ultimo = ultimo.getSiguiente();
            }
            ultimo.setSiguiente(nuevo);
        }

    }
}
