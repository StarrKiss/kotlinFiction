import Store

import Player

object inventory{

    fun open(sectName : String, commandArray : Array<Command>){

        var name = sectName

        var commandz = commandArray

        print( Store.getIinvList())

        print("Type in item to use, or press enter to quit")

        var tempInput = readLine()

        println("You chose: " + tempInput)

        loop@for(x in ArrayList(Store.inventoryMap.values)){
            if(tempInput == x.itemName){
                when(x.whatItem){
                    "miscItem" ->{
                        println("You used " + x.itemName)
                       // Player.equipSword(Store.inventoryMap.filterValues { it == x}.keys.single())

                        //println("Your sword is now " + Store.getInvItem(Player.equippedSword).itemName)
                    }
                    
                    "potion" -> {
                        println("You drank a potion")
                        Player.Heal(x.itemStrength)
                    }
                }

                break@loop

            }
        }

        Section(name, commandz).call()

    }

    fun listPickedUp(newKey : String){
        println("You picked up " + Store.getInvItem(newKey).itemName)
    }
}