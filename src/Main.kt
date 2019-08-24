
import Player


import Store

import  animation

fun main(){
    println("Welcome! What is your name? ")
    var tempInput = readLine()
    if(tempInput != null){
        Player.setPlayerName(tempInput)
    }
    else{
        println("You entered nothing!")
    }

    println("You chose the name " + Player.getPlayerName())

    //animation(2, arrayOf(":)", ":(", ":|")).playAnim()



    Store.getItem("text1").call()
}