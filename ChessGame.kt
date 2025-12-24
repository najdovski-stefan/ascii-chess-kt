fun main(){


    val board = Array(8){
        Array(8){'.'}
    }
    //TOP
    board[0][0] = 'T'
    board[0][7] = 'T'
    board[7][0] = 'T'
    board[7][7] = 'T'

    for (row in board) {
         for (square in row) {
             print("$square ")
         }

         println()
     }

}
