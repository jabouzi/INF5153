package org.example.semaine9.state.example1.game.character.states;


import org.example.semaine9.state.example1.game.character.GameCharacter;

public class WalkingCharacterState implements CharacterState {
    private final GameCharacter gameCharacter;

    public WalkingCharacterState(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public String getName() {
        return "Walking";
    }

    @Override
    public void move() {
        System.out.println("Walking...");
    }

    @Override
    public void speak() {
        System.out.println("Speaking while walking...");
    }

    @Override
    public void shoot() {
        System.out.println("Shooting while walking...");
    }

    @Override
    public void toNextState() {
        gameCharacter.setCharacterState(new RunningCharacterState(gameCharacter));
    }
}
