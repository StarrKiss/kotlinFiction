import Section

import Store

import Player

import commandArgs

class Command(commandText : String, destination : String, healthTaken : Int = 0, arguments : commandArgs? =  null) {
    var finalText : String = commandText
    var obj : String = destination
    var healthIncrement = healthTaken
    val args = arguments

    fun callNextSec(){
        if(args!= null){
            if(Store.getKeyItem(args.itemId)){

                if(healthIncrement != 0){
                    Player.injure(healthIncrement)
                }

                Store.getItem(obj).call()
            }
            else{
                println(args.unableText)
            }

        }
        else{
            if(healthIncrement != 0){
                Player.injure(healthIncrement)
            }

            Store.getItem(obj).call()
        }


    }

}