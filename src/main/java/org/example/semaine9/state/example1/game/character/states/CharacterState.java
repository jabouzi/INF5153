package org.example.semaine9.state.example1.game.character.states;

public interface CharacterState {
    String getName();

    void move();

    void speak();

    void shoot();

    void toNextState();
}
