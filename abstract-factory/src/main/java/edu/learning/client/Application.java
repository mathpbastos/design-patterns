package edu.learning.client;

import edu.learning.buttons.Button;
import edu.learning.checkboxes.Checkbox;
import edu.learning.factories.GUIFactory;

public class Application {
    
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        
        this.paint();
    }
    
    public void paint(){
        button.paint();
        checkbox.paint();
    }
    
}
