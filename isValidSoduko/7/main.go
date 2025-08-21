package main

func isValidSudoku(board [][]byte) bool {
    rowMap := make([]map[byte]bool, 9)
    colMap := make([]map[byte]bool, 9)
    boxMap := make([]map[byte]bool, 9)

    for i := range rowMap {
        rowMap[i] = make(map[byte]bool)
        colMap[i] = make(map[byte]bool)
        boxMap[i] = make(map[byte]bool)
    }

    getBoxIndex := func(row, col int) (result int) {
        result = (row/3)*3 + (col/3)
        return
    }

    for r := 0; r < 9; r++ {
        for c := 0; c < 9; c++ {
            val := board[r][c]
            if val == '.' {continue}


            if rowMap[r][val] {return false}
            if colMap[c][val] {return false}
            if boxMap[getBoxIndex(r,c)][val] {return false}

            rowMap[r][val] = true
            colMap[r][val] = true
            boxMap[getBoxIndex(r,c)][val] = true
        }
    }

    return true

}