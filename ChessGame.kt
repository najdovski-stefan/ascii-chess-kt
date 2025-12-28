enum class Color {
    WHITE,
    BLACK
}

data class Piece(val name: String, val color: Color)

object Ansi {
    const val RESET = "\u001b[0m"

    //https://www.ditig.com/256-colors-cheat-sheet
    const val WHITE_TXT = "\u001b[37;1m" // W
    const val BLACK_TXT = "\u001b[30m"   // B
    const val RED_TXT = "\u001b[31m"     // R


    const val BG_LIGHT = "\u001b[47m"    // W BG
    const val BG_DARK = "\u001b[100m"    // D BG
}

fun main() {

    val board = Array(8) {
        arrayOfNulls<Piece>(8)
    }

    board[0][0] = Piece("T", Color.BLACK)
    board[7][7] = Piece("T", Color.WHITE)

    while (true) {
        println("   0  1  2  3  4  5  6  7")

        for (i in 0..7) {
            print("$i ")

            for (j in 0..7) {
                val piece = board[i][j]

                //crno/belo
                val bg = if ((i + j) % 2 == 0) Ansi.BG_LIGHT else Ansi.BG_DARK

                val textToPrint: String

                if (piece == null) {
                    textToPrint = "${bg}   ${Ansi.RESET}"
                } else {
                    val fg = if (piece.color == Color.WHITE) Ansi.WHITE_TXT else Ansi.BLACK_TXT
                    textToPrint = "${bg}${fg} ${piece.name} ${Ansi.RESET}"
                }

                print(textToPrint)
            }
            println()
        }

        println("Vnesi Koordinati (0,0 1,0)")

        try {
            val from_where = readln()
            if (from_where == "exit") break

            val spaceSplit = from_where.split(" ")
            val p1 = spaceSplit[0].split(",")
            val p2 = spaceSplit[1].split(",")

            val r1 = p1[0].toInt();
            val c1 = p1[1].toInt()
            val r2 = p2[0].toInt();
            val c2 = p2[1].toInt()


            if (board[r1][c1] != null) {
                board[r2][c2] = board[r1][c1]
                board[r1][c1] = null
            } else {
                // If empty, just spawn a test piece as per your logic
                board[r1][c1] = Piece("T", Color.WHITE)
            }

        } catch (e: Exception) {
            println("Invalid Input, try format: 0,0 1,1")
        }
    }
}
