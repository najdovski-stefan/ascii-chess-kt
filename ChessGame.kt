
enum class Color{
	WHITE,
	BLACK
}

enum class PieceType{
	PAWN,
	KNIGHT,
	BISHOP,
	KING,
	QUEEN,
	ROOK,
}


//toString, equals, hashcode java manual, kotlin auto
data class Piece(val type:PieceType, val color: Color)


//piece might be nullable
data class Board(

var grid:Array<Array<Piece?>> = Array(8){arrayOfNulls(8)}


){

	init {

	val rowLayout = listOf(PieceType.ROOK,PieceType.KNIGHT,PieceType.BISHOP,PieceType.QUEEN,PieceType.KING,PieceType.BISHOP,PieceType.KNIGHT,PieceType.ROOK)

    for(i in 0..7){
        grid[0][i] = Piece(rowLayout[i],Color.BLACK)
        grid[1][i] = Piece(PieceType.PAWN,Color.BLACK)
        grid[6][i] = Piece(PieceType.PAWN, Color.WHITE)
        grid[7][i] = Piece(rowLayout[i],Color.WHITE)

    }

	}

	fun printBoard(){
	    //8*8 = 64 fields
	    for(row in 0..7){
			for(col in 0..7){
			if(	grid[row][col] == null){
			    print(". ")
			}else{
			    print("${grid[row][col]}")
			}
			}
			println("")
		}


	}

	private fun getSymbol(piece: Piece): String {


	}
}
