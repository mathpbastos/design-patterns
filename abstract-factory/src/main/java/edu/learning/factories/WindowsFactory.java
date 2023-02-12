package edu.learning.factories;

import edu.learning.buttons.Button;
import edu.learning.buttons.WindowsButton;
import edu.learning.checkboxes.Checkbox;
import edu.learning.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
    
}
