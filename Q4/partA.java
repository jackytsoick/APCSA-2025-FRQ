public SumOrSameGame(int numRows, int numCols) {
    Random rand = new Random();
    puzzle = new int[numRows][numCols];

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            puzzle[i][j] = rand.nextInt(9) + 1;
        }
    }
}
