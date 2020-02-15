package com.alevel.java.nix.module1;

public class Horse {
    private int[] horseStartingPosition;
    private int[] moveCoordinate;

    public Horse(int x, int y) {
        int[] horseStartingPosition = {x, y};
    }

    public boolean moveOpportynity(int[] moveCoordinate) {
        if (moveCoordinate[0] == horseStartingPosition[0] - 1
                && moveCoordinate[1] == horseStartingPosition[1] + 2)
            return true;
        if (moveCoordinate[0] == horseStartingPosition[0] + 1
                && moveCoordinate[1] == horseStartingPosition[1] + 2)
            return true;
        if (moveCoordinate[0] == horseStartingPosition[0] - 2
                && moveCoordinate[1] == horseStartingPosition[1] + 1)
            return true;
        if (moveCoordinate[0] == horseStartingPosition[0] + 2
                && moveCoordinate[1] == horseStartingPosition[1] + 1)
            return true;
        if (moveCoordinate[0] == horseStartingPosition[0] - 2
                && moveCoordinate[1] == horseStartingPosition[1] - 1)
            return true;
        if (moveCoordinate[0] == horseStartingPosition[0] + 2
                && moveCoordinate[1] == horseStartingPosition[1] - 1)
            return true;
        if (moveCoordinate[0] == horseStartingPosition[0] - 1
                && moveCoordinate[1] == horseStartingPosition[1] - 2)
            return true;
        if (moveCoordinate[0] == horseStartingPosition[0] + 1
                && moveCoordinate[1] == horseStartingPosition[1] - 2)
            return true;
        return false;
    }
}
