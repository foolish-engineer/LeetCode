# using map
def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        zero_rows = dict()
        zero_col = dict()
        for i, row in enumerate(matrix):
            for j, col in enumerate(row):
                if col == 0:
                    zero_rows[i] = True
                    zero_col[j] = True
        for i, row in enumerate(matrix):
            for j, col in enumerate(row):
                if zero_rows.get(i) or zero_col.get(j):
                    matrix[i][j] = 0

# using set
def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        zero_rows = set()
        zero_col = set()
        for i, row in enumerate(matrix):
            for j, col in enumerate(row):
                if col == 0:
                    zero_rows.add(i)
                    zero_col.add(j)
        for i, row in enumerate(matrix):
            for j, col in enumerate(row):
                if i in zero_rows or j in zero_col:
                    matrix[i][j] = 0

# using array
def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        m = len(matrix)
        n = len(matrix[0])
        zero_rows = [0] * m
        zero_col = [0] * n
        for i in range(m):
            for j in range(n):
                if matrix[i][j] == 0:
                    zero_rows[i] = True
                    zero_col[j] = True
        for i in range(m):
            for j in range(n):
                if zero_rows[i] or zero_col[j]:
                    matrix[i][j] = 0