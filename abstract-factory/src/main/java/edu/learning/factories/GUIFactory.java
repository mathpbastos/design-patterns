package edu.learning.factories;

import edu.learning.buttons.Button;
import edu.learning.checkboxes.Checkbox;

public interface GUIFactory {
    
    public Button createButton();
    
    public Checkbox createCheckbox();
    
}
