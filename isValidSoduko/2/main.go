package leetcode

func IsValidSudoku2(board [][]byte) bool {
	for i := 0; i < 9; i++ {
		for j := 0; j < 9; j++ {
			if !(board[i][j] == '.') {
				if !isValidPlacement2(board, i, j, board[i][j]) {
					return false
				}
			}
		}
	}
	return true
}

func isValidPlacement2(board [][]byte, row, col int, num byte) bool {
	// Test row and col
	for i := 0; i < 9; i++ {
		if i != row && board[i][col] == num {
			return false
		}
		if i != col && board[row][i] == num {
			return false
		}
	}

	rowFormula := (row / 3) * 3
	colFormula := (col / 3) * 3

	// Test Sub-box
	for i := 0; i < 3; i++ {
		for j := 0; j < 3; j++ {
			r := rowFormula + i
			c := colFormula + j
			if (row != r || col != c) && board[r][c] == num {
				return false
			}
		}
	}
	return true
}
