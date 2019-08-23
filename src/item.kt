class item(name : String, itemType : String, strength : Int) {
    var itemName : String  = name

    var itemTypes : Array<String> = arrayOf("sword", "potion", "armor")

    var itemStrength : Int = strength

    var whatItem = itemType


    fun List() : String{

        var tempText : String = ""

        when(whatItem){
            "sword" -> tempText = "Attack: "
            "potion" -> tempText = "Health Gained: "
            "armor" -> tempText = "Defense: "
            else -> tempText = "error"
        }
        var finalText = itemName + "\n" + tempText + itemStrength



        return finalText
    }
}