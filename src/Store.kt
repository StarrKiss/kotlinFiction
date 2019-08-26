import Section

import Command

import item


object Store{



        val storeMap = mutableMapOf (
                "text1" to Section("This is the hub", arrayOf(Command("West", "text2"), Command("East", "text3"))),
                "text3" to Section("You find a sword in a clearing. Pillars of stone surround it.", arrayOf(Command("Go Back", "text1"), Command("Head to well", "text2")), "powerSword"),
                "text2" to Section("You come across a well", arrayOf(Command("Investigate", "text5", 100), Command("Go Back", "text1") ),"potion2" ),
                "text5" to Section("You Drown", arrayOf())

        )

        var inventoryMap = mutableMapOf(
                "rustSword" to item("Golden Key", "miscItem"),
                "basicArmor" to item ("Wooden Stick", "miscItem" ),
                "healthPotion" to item("Health Potion", "potion", 50)

        )

        val possibleInventory = mutableMapOf(

                "potion2" to item("Powerful Health Potion", "potion", 90),
                "powerSword" to item("Stone", "miscItem")


        )





        fun getItem(item : String) : Section{
            return storeMap.get(item)?:error("Value does not exist")
        }

        fun getIinvList(): String{

                var tempText = "Inventory Contents: " + "\n"

                for( x in inventoryMap.values){
                        tempText += x.List() + "\n"
                }

                return tempText
        }
        fun addInvList(keyOfItem: String){
               inventoryMap.put(keyOfItem, possibleInventory.get(keyOfItem)?:error("Value doesn't exist")
               )
        }

        fun getInvItem(key: String): item{
                return inventoryMap.get(key)?:error("Value does not exist")

        }


}