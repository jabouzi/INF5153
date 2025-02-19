package org.example.semaine7.state.example1.game.character;


import org.example.semaine7.state.example1.game.character.states.CharacterState;
import org.example.semaine7.state.example1.game.character.states.StandingCharacterState;

public class GameCharacter {

    private CharacterState characterState = new StandingCharacterState(this);

    public void setCharacterState(CharacterState characterState) {
        this.characterState = characterState;
    }

    public CharacterState getCharacterState() {
        return characterState;
    }

    public void move() {
        characterState.move();
    }

    public void speak() {
        characterState.speak();
    }

    public void shoot() {
        characterState.shoot();
    }

    public void toNextState() {
        characterState.toNextState();
    }
}
