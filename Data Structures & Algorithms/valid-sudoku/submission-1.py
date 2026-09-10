class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        checkRow = set()
        checkCol = set()

        for i in range(0, 9):
            checkRow.clear()
            for j in range(0, 9):
                if board[i][j]!=".":
                    if board[i][j] not in checkRow:
                        checkRow.add(board[i][j])
                    else:
                        return False

        for j in range(0, 9):
            checkRow.clear()
            for i in range(0, 9):
                if board[i][j]!=".":
                    if board[i][j] not in checkRow:
                        checkRow.add(board[i][j])
                    else:
                        return False

        k = l = 0
        while k<9:
            while l<9:
                checkRow.clear()
                for i in range(k, k+3):
                    for j in range(l, l+3):
                        if board[i][j]!=".":
                            if board[i][j] not in checkRow:
                                checkRow.add(board[i][j])
                            else:
                                return False
                l+=3
            k+=3
        return True
