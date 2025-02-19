package org.example.semaine7.state.example1.game.character.states;


import org.example.semaine7.state.example1.game.character.GameCharacter;

public class StandingCharacterState implements CharacterState {
    private final GameCharacter gameCharacter;

    public StandingCharacterState(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    @Override
    public String getName() {
        return "Standing";
    }

    @Override
    public void move() {
        System.out.println("Standing...");
    }

    @Override
    public void speak() {
        System.out.println("Speaking while standing...");
    }

    @Override
    public void shoot() {
        System.out.println("Shooting while standing...");
    }

    @Override
    public void toNextState() {
        gameCharacter.setCharacterState(new WalkingCharacterState(gameCharacter));
    }
}
