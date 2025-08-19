package main

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
	// check for rows and cols
	for i := 0; i < 9; i++ {
		if i != row && board[i][col] == num {
			return false
		}
		if i != col && board[row][i] == num {
			return false
		}
	}

	startRowFormula := (row / 3) * 3
	startColFormula := (col / 3) * 3

	for i := 0; i < 3; i++ {
		for j := 0; j < 3; j++ {
			subRowCalc := startRowFormula + i
			subColCalc := startColFormula + j
			if (subRowCalc != row || subColCalc != col) && board[subRowCalc][subColCalc] == num {
				return false
			}
		}
	}
	return true

}

func main(){}