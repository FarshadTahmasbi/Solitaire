fun main(args: Array<String>) {
    val card = Card(8,"Club", true)
    val card2 = Card(8,"Club", false)
    val card3 = card
    println(card==card2)
    println(card3===card)
}