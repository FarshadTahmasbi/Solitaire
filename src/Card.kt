class Card(val value:Int, val suit:String, var faceUp : Boolean = false){

    override fun toString(): String {
        return value.toString() + " of " + suit
    }
}