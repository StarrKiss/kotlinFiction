import java.util.Arrays
import Command
import Player
import Store
import inventory

class Section(tempText: String, commandArray : Array<Command>, itemAdded : String = "null") {
    var text : String = tempText
    var commands = commandArray
    var itemkey = itemAdded

    fun call(){
        println(text)

        if(itemkey != "null"){
            Store.addInvList(itemkey)

            inventory.listPickedUp(itemkey)
        }



        println("Your health is " + Player.getPlayerHealth())

        if(Player.getPlayerHealth() <= 0){
            println("You Died. Sorry.")
        }
        else{
            println("These are your options: ")
            for(x in commands){
                print(x.finalText + ", ")
            }
            print("Inventory ")

            var tempInput = readLine()

            println("You chose " + tempInput)
            if(tempInput != "Inventory"){
                loop@ for(x in commands){
                    if(tempInput == x.finalText){
                        x.callNextSec()
                        break@loop
                    }

                }
            }
            else if(tempInput == "Inventory"){
                inventory.open(text, commands)
            }
            else{
                println("Invalid enter.")
            }

        }

    }

}