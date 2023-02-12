package edu.learning.factories;

import edu.learning.buttons.Button;
import edu.learning.buttons.LinuxButton;
import edu.learning.checkboxes.Checkbox;
import edu.learning.checkboxes.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
    
}
