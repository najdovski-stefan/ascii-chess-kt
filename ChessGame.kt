enum class Color {
    WHITE,
    BLACK
};

data class Piece(val name:String,val color:Color)

fun main(){

val board = Array(8){
    arrayOfNulls<Piece>(8)
};

while(true){
    for(i in 0..7){
        for(j in 0..7){
            val piece = board[i][j]

            if(piece == null){
                print(". ")
            }else{

               print(piece.name+" ")
            }
        }
        println()
    }
    print("Enter coordinate")
    println(" Input : 0,0 1,0")
    //take from 0,0 to 1,0
    val from_where = readln()
    val spaceSplit = from_where.split(" ")
    val firstPair = spaceSplit[0]
    val secPair = spaceSplit[1]
    println(firstPair)
    println(secPair)
    val firstSplit = firstPair.split(",")
    val secSplit = secPair.split(",")

    val rowFirstPair = firstSplit[0].toInt()
    val colFirstPair = firstSplit[1].toInt()
    val rowSecondPair = secSplit[0].toInt()
    val colSecondPair = secSplit[1].toInt()
    println("First row:$rowFirstPair")
    println("First col:$colFirstPair")
    println("Sec row:$rowSecondPair")
    println("Sec col:$colSecondPair")

    val pieceTest =  board[rowFirstPair][colFirstPair]

    if(pieceTest == null){
         board[rowFirstPair][colFirstPair] = Piece("T",Color.WHITE)
    }else{

    }



}
}
