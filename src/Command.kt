import Section

import Store

import Player

class Command(commandText : String, destination : String, healthTaken : Int = 0) {
    var finalText : String = commandText
    var obj : String = destination
    var healthIncrement = healthTaken

    fun callNextSec(){

        if(healthIncrement != 0){
            Player.injure(healthIncrement)
        }

        Store.getItem(obj).call()

    }

}