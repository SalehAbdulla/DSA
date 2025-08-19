package main

func isValidSudoku(board [][]byte) bool {
	// Create maps
	rowMap := make([]map[byte]bool, 9)
	colMap := make([]map[byte]bool, 9)
	boxMap := make([]map[byte]bool, 9)

	// Fill maps with map[byte]bool
	for i := 0; i < 9; i++ {
		rowMap[i] = make(map[byte]bool)
		colMap[i] = make(map[byte]bool)
		boxMap[i] = make(map[byte]bool)
	}

	// Scan the board and fill maps
	for i := 0; i < 9; i++ {
		for j := 0; j < 9; j++ {
			num := board[i][j]
			box := (i/3)*3 + (j / 3)

			if num == '.' {
				continue
			}
			if rowMap[i][num] || colMap[j][num] || boxMap[box][num] {
				return false
			}

			rowMap[i][num] = true
			colMap[j][num] = true
			boxMap[box][num] = true
		}
	}
	return true
}
