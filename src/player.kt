object Player{
    var name : String = ""

    var health : Int = 100

    var equippedSword : String = "rustSword"

    fun getPlayerName() : String{

        return name
    }

    fun setPlayerName(newName : String){
        name = newName
    }

    fun getPlayerHealth() : Int{
        return health
    }

    fun equipSword(key : String){
        equippedSword = key

        println("Sword equipped - " + Store.getInvItem(key).itemName)
    }



    fun Heal(healthIncrement : Int){
        health += healthIncrement
        println("You healed up!")
    }

    fun injure(healthIncrement: Int){
        health = health - healthIncrement
        println("Health decreased")
    }

    // Health: (000000000...)
}