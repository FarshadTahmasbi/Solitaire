val clubs = "Clubs"
val diamonds = "Diamonds"
val hearts = "Hearts"
val spades = "Spades"
val redSuits = arrayOf(diamonds, hearts)
val blackSuits = arrayOf(clubs, spades)

data class Card(val value: Int, val suit: String, var faceUp: Boolean = false) {
    override fun toString(): String {
        return value.toString() + " of " + suit
    }

//    override fun equals(other: Any?): Boolean {
//        if (other is Card) {
//            return value == other.value &&
//                    suit == other.suit
//        }
//        return false
//    }
}