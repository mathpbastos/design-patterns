package edu.learning.componente;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponenteComposite extends Componente{
    
    protected List<Componente> componentes = new ArrayList();
    
    public final void add(Componente componente){
        this.componentes.add(componente);
    }
    
}
