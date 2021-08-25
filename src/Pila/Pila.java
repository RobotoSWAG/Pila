package Pila;
import Lista.Lista;
import Lista.Nodo;
public class Pila extends Lista {

    @Override
    public void eliminarFin()
    {
        if(!estaVacia())
        {
            Nodo penultimo = inicio;
            while(penultimo.getSiguiente().getSiguiente()!=inicio)
            {
                penultimo=penultimo.getSiguiente();
            }
            penultimo.setSiguiente(inicio);
        }
    }
}
