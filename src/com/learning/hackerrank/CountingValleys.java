package com.learning.hackerrank;

/**
 * An avid hiker keeps meticulous records of their hikes. During the last hike that took exactly  steps, for every step it was noted if it was an uphill, , or a downhill,  step. Hikes always start and end at sea level, and each step up or down represents a  unit change in altitude. We define the following terms:
 * <p>
 * A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and ending with a step down to sea level.
 * A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 * Given the sequence of up and down steps during a hike, find and print the number of valleys walked through.
 * <p>
 * Example
 * <p>
 * steps = 8 path = [DDUUUUDD]
 * <p>
 * The hiker first enters a valley  units deep. Then they climb out and up onto a mountain  units high. Finally, the hiker returns to sea level and ends the hike.
 * <p>
 * Function Description
 * <p>
 * Complete the countingValleys function in the editor below.
 * <p>
 * countingValleys has the following parameter(s):
 * <p>
 * int steps: the number of steps on the hike
 * string path: a string describing the path
 * Returns
 * <p>
 * int: the number of valleys traversed
 * Input Format
 * <p>
 * The first line contains an integer steps, the number of steps in the hike.
 * The second line contains a single string path, of steps characters that describe the path.
 * <p>
 * Sample Input
 * 8
 * UDDDUDUU
 * <p>
 * Sample Output
 * 1
 * Explanation
 * <p>
 * If we represent _ as sea level, a step up as /, and a step down as \, the hike can be drawn as:
 * <p>
 * _/\      _
 * \    /
 * \/\/
 * The hiker enters and leaves one valley.
 */
public class CountingValleys {

    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");
    }

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */
    public static int countingValleys(int steps, String path) {

        int valley = 0;
        int seaLevel = 0;

        for (int i = 0; i < steps; i++) {

            if (path.charAt(i) == 'D') {
                seaLevel--;
            } else if (path.charAt(i) == 'U') {
                seaLevel++;
            }

            if (i != 0 && path.charAt(i) == 'U' && seaLevel == 0) {
                valley++;
            }
        }

        return valley;
    }
}
