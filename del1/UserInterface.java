package del1;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    Scanner in = new Scanner(System.in);

    String returnsUserInput() {
        return in.nextLine();
    }

    void printIntroduction(Room currentRoom) {
        System.out.println("Welcome to 'game missing name'.\n" +
                "You need to get/do 'missing winning scenario'.\n" +
                "Type a direction North, South, West or East.\n" +
                "Type 'Look around' to get a description of the room.\n" +
                "Type 'Help' to get the controls of the game.\n" +
                "Type 'Exit' to end the game.\n" +
                "Current room is: " + currentRoom.getName());
    }
    void printCommand() {
        System.out.println("Game controls:\n" +
                "Move direction type 'North', 'South', 'West' or 'East'\n" +
                "Get information type 'Look' or 'Help'\n" +
                "To end game type 'Exit'");
    }
    void typeDirectionOrLookAround(){
        System.out.print("\nType direction or look around: ");
    }
    void lookAround(Room currentRoom){
        System.out.println("You are standing in \033[1;97m" + currentRoom.getName() + "\033[0m");
        System.out.println(currentRoom.getRoomDescription() + ".");

        //Viser items i room
        int amountOfItemsInRoom = currentRoom.getItemsInRoom().size(); //Antal items
        if (amountOfItemsInRoom > 0){
            System.out.print("There are these items in the room:");

            for (int i=0; i < amountOfItemsInRoom; i++){
                String itemNameLong = currentRoom.getItemsInRoom().get(i).getItemNameLong(); //Finder alle lange navne for items
                System.out.print(" " + itemNameLong);
            }
            System.out.print(".\n");
        } else
            System.out.println("No items");
    }

    void pickItemUp(){
        System.out.print("Which item do you want to pick up? ");

    }
    void emptyRoom(){
        System.out.println("No items in the room");
    }


    void printInventory(Player player){

        if (player.getItemsPlayerCarry().size()>0){
            System.out.print("The user is carrying");

            for (int i = 0; i < player.getItemsPlayerCarry().size() ; i++) {
                System.out.print(" "+ player.getItemsPlayerCarry().get(i).getItemNameShort());
            }
            System.out.print(".\n");
        } else
            System.out.println("Your inventory is empty.\n");
    }


    void direction (String direction, Room currentRoom){
        System.out.println("The user went\033[1;97m " + direction + ".\033[0m");
        System.out.println("You have entered: " + currentRoom.getName() + ".");
    }
    void wrongDirection (){
        System.out.println("Not possible to move that direction, try again.");
    }
    void winnerOutput(){
        System.out.println("The player has won!\n");
    }
    void playAgain(){
        System.out.print("Do you wish to play again, type 'no' or 'yes': ");
    }


}
