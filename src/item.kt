class item(name : String, itemType : String, strength : Int = 0) {
    var itemName : String  = name

    var itemTypes : Array<String> = arrayOf("miscItem", "potion")

    var itemStrength : Int = strength

    var whatItem = itemType

    fun List() : String{

        var tempText : String = ""

        var finalText : String = ""

        when(whatItem){
            "miscItem" -> tempText = ""
            "potion" -> tempText = "Health Gained: "
            else -> tempText = "error"
        }
        if(itemStrength != 0){
            finalText = itemName + "\n" + tempText + itemStrength
        }
        else{
            finalText = itemName + "\n" + tempText
        }

		//this is a test
        return finalText
    }


}