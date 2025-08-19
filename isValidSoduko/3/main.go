package main

func main(){

}

func isValidSudoku(board [][]byte) bool {
	for i := 0; i < 9; i++ {
		for j := 0; j < 9; j++ {
			if board[i][j] == '.' {
				continue
			}
			if !isValidPlacement(board, i, j, board[i][j]) {
				return false
			}
		}
	}
	return true
}

func isValidPlacement(board [][]byte, row, col int, num byte) bool {
	for i := 0; i < 9; i++ {
		if (row != i) && board[i][col] == num {
			return false
		}
		if (col != i) && board[row][i] == num {
			return false
		}
	}

	startRow := (row / 3) * 3
	startCol := (col / 3) * 3

	for i := 0; i < 3; i++ {
		for j := 0; j < 3; j++ {
			subRow := startRow + i
			subCol := startCol + j
			if (subRow != row || subCol != col) && board[subRow][subCol] == num {
				return false
			}
		}
	}

	return true
}