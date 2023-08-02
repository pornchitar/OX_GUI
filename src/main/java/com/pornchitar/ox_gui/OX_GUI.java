/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pornchitar.ox_gui;

/**
 *
 * @author ASUS
 */
public class OX_GUI {

    public static void main(String[] args) {
        Game game = new Game();
        game.showWelcome();
        game.newBoard();
        while(true) {
            game.showTable();
            game.showTurn();
            game.inputRowCol();
            if(game.isFinish()) {
                game.showTable();
                game.showResult();
                game.showStat();
                game.newBoard();
            }
        }               

    }
    
}
