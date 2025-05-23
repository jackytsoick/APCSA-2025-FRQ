public boolean clearPair(int row, int col) {
    int targetValue = puzzle[row][col];

    if (targetValue < 1 || targetValue > 9) {
        return false;
    }

    for (int i = row; i < puzzle.length; i++) {
        for (int j = 0; j < puzzle[i].length; j++) {
            if (i == row && j == col) {
