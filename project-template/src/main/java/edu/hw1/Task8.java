package edu.hw1;

public class Task8 {
    private int[][] desk;

    public Task8(int[][] desk) {
        this.desk = desk;
    }

    public static final int DESK_SIZE = 8;

    public boolean knightBoardCapture(int[][] desk) {
        this.desk = desk;
        int ch = 0;
        for (int i = 0; i < DESK_SIZE; i++) {
            for (int j = 0; j < DESK_SIZE; j++) {
                if (desk[i][j] == (1)) {

                    if (i - 2 > -1 && j - 1 > -1) {
                        if (desk[i - 2][j - 1] == 1) {
                            ch = 1;
                        }
                    }

                    if (i - 2 > -1 && j + 1 < DESK_SIZE) {
                        if (desk[i - 2][j + 1] == 1) {
                            ch = 1;
                        }
                    }

                    if (j - 2 > -1 && i - 1 > -1) {
                        if (desk[i - 1][j - 2] == 1) {
                            ch = 1;
                        }
                    }

                    if (j - 2 > -1 && i + 1 < DESK_SIZE) {
                        if (desk[i + 1][j - 2] == 1) {
                            ch = 1;
                        }
                    }
                    if (i + 2 < DESK_SIZE && j - 1 > -1) {
                        if (desk[i + 2][j - 1] == 1) {
                            ch = 1;
                        }
                    }
                    if (i + 2 < DESK_SIZE && j + 1 < DESK_SIZE) {
                        if (desk[i + 2][j + 1] == 1) {
                            ch = 1;
                        }
                    }
                    if (i + 1 < DESK_SIZE && j + 2 < DESK_SIZE) {
                        if (desk[i + 1][j + 2] == 1) {
                            ch = 1;
                        }
                    }
                    if (i - 1 > -1 && j + 2 < DESK_SIZE) {
                        if (desk[i - 1][j + 2] == 1) {
                            ch = 1;
                        }
                    }

                }

            }
        }
        if (ch == 1) {
            return (false);
        } else {
            return (true);
        }
    }
}
