enum class Color{WHITE,BLACK}//https://kotlinlang.org/docs/enum-classes.html
data class Piece(val name:String,val color:Color);//https://kotlinlang.org/docs/data-classes.html

fun main(){


    val board = Array(8) {
        arrayOfNulls<Piece>(8)//https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/array-of-nulls.html
    }

    val belTop = Piece("T",Color.WHITE)
    val crnTop = Piece("T",Color.BLACK)

    board[0][0] = belTop
    board[7][0] = crnTop

    for (row in board) {
        for (square in row) {
            if (square == null) {
                print(". ")
            } else {
                //https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/uppercase.html
                // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/lowercase.html
                val letter = if (square.color == Color.WHITE) square.name.uppercase() else square.name.lowercase()
                print("$letter ")
            }
        }
        println()
    }

    println("Vnesi Koordinati 1,1 :")


    val input = readln()// https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.io/readln.html


    val parts:List<String> = input.split(",") // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/split.html

    println("Ti napisa $input")
    println("Redica: " + parts[0])
    println("Kolona: " + parts[1])

    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.text/to-int.html
    val rowIdx = parts[0].toInt()
    val colIdx = parts[1].toInt()

    // Piunce
    board[rowIdx][colIdx] = Piece("P", Color.WHITE)

    for (row in board) {
        for (square in row) {
            if (square == null) {
                print(". ")
            } else {
                //https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/uppercase.html
                // https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.text/lowercase.html
                val letter = if (square.color == Color.WHITE) square.name.uppercase() else square.name.lowercase()
                print("$letter ")
            }
        }
        println()
    }


}
