package Lista;

public class Lista
{ protected Nodo inicio;
    public Lista()
    {
        inicio = null;
    }

    public boolean estaVacia()
    {
        return inicio == null;
    }

    public int tamano()
    {
        int contador = 0;

        if(!estaVacia())
        {
            Nodo ultimo = inicio;
            while(ultimo.getSiguiente() != inicio)
            {
                ultimo = ultimo.getSiguiente();
                contador++;
            }
            contador++;
        }
        return contador;
    }

    public void insertarFin(int dato)
    {
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

    public void mostrarCircularAdelante(int vueltasAdelante)
    {
        if(!estaVacia())
        {
            int contador = 0;

            Nodo temp = inicio;
            while(temp != null && contador < (tamano() * vueltasAdelante))
            {
                System.out.print(temp.getDato() + "  ");
                temp = temp.getSiguiente();
                contador++;
            }
            System.out.println();

        }
    }

    public void mostrarReverso(int vueltasReverso)
    {
        for(int i=tamano();i>=1;i--)
        {
            System.out.print(i + "  ");
        }
    }
}
