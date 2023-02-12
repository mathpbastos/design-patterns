package edu.learning.factories;

import edu.learning.buttons.Button;
import edu.learning.buttons.MacOSButton;
import edu.learning.checkboxes.Checkbox;
import edu.learning.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
