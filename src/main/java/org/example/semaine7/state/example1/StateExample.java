package org.example.semaine7.state.example1;


import org.example.semaine7.state.example1.game.character.GameCharacter;

public class StateExample {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();

        gameCharacter.toNextState();
        System.out.println();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();

        gameCharacter.toNextState();
        System.out.println();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();

        gameCharacter.toNextState();
        System.out.println();

        System.out.println("Game character state = " + gameCharacter.getCharacterState().getName());
        gameCharacter.move();
        gameCharacter.speak();
        gameCharacter.shoot();
    }
}
