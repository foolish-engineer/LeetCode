def minDistance(self, word1, word2):
    """
    :type word1: str
    :type word2: str
    :rtype: int
    """
    matrix = [[0 for _ in range(len(word2) + 1)] for _ in range(len(word1) + 1)]
    for i, char1 in enumerate(" " + word1):
        for j, char2 in enumerate(" " + word2):
            if i == 0 and j == 0:
                continue
            elif i == 0 or j == 0:
                matrix[i][j] = max(i, j)
            elif char1 == char2:
                matrix[i][j] = matrix[i - 1][j - 1]
            else:
                matrix[i][j] = 1 + min(matrix[i - 1][j - 1], matrix[i][j - 1], matrix[i - 1][j])
    return matrix[-1][-1]