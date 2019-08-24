import Store

object inventory{

    fun open(){
        print( Store.getIinvList())

        print("Type in item to use, or press enter to quit")

        var tempInput = readLine()

        println("You chose: " + tempInput)

        loop@for(x in ArrayList(Store.inventoryMap.values)){
            if(tempInput == x.itemName){
                when(x.whatItem){
                    "sword" -> println("You swing your sword")
                    "armor" -> println("You put on armor")
                    "potion" -> println("You drank the potion")
                }
                break@loop



            }
        }




    }
}