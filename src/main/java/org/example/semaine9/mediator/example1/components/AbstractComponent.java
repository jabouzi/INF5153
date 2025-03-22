package org.example.semaine9.mediator.example1.components;


import org.example.semaine9.mediator.example1.dialog.Mediator;

abstract class AbstractComponent implements Component {
    protected Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
