package tn.esprit.myapplication

class Dice(val diceNumber: Int){


    fun rollDice() : Int{
        return (1..diceNumber).random()
    }
}