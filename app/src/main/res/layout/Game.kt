package layout

import kotlin.random.Random

object Game {
    private val rules = mapOf(
        "BAJU-OLAHRAGA" to true,
        "BOLA" to false,
        "JAM" to true,
        "SEPATU" to false,
    )

    private val options = listOf(
        "BAJU-OLAHRAGA" to R.drawable.baju olahraga,
        "BOLA" to R.drawable.bola,
        "JAM" to R.drawable.jam,
        "SEPATU" to R.drawable.sepatu,
    )

    fun pickRandomOption(): String = options[Random.nextInt( from = 0, until = 3)]
    fun pickDrawable(option: String):Int = optionDrawable[option]!!
    fun isDraw(from: String, to:String): Boolean = from == to
    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}