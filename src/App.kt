fun main(args: Array<String>) {
    val card = Card(8,"Club")
    println(card)
    val deck = Deck()
    deck.cards.forEach {
        println(it)
    }
}