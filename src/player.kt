object Player{
    var name : String = ""

    var health : Int = 100

    fun getPlayerName() : String{

        return name
    }

    fun setPlayerName(newName : String){
        name = newName
    }

    fun getPlayerHealth() : Int{
        return health
    }

    fun Heal(healthIncrement : Int){
        health += healthIncrement
        println("You healed up!")
    }

    fun injure(healthIncrement: Int){
        health = health - healthIncrement
        println("Health decreased")
    }
}