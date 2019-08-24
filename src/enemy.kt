class enemy(enemyName : String, enemyHealth : Int, damage: Int){
    var name = enemyName

    var health = enemyHealth

    var Damage = damage

    fun attackPlayer(){
        Player.injure(Damage)
    }




}