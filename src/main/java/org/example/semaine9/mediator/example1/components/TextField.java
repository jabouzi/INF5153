package org.example.semaine9.mediator.example1.components;

public class TextField extends AbstractComponent {
    private String value;

    public void setValue(String value) {
        this.value = value;
        mediator.onInputDataChange();
    }

    public void clearValue() {
        setValue(null);
    }

    public String getValue() {
        return value;
    }
}
