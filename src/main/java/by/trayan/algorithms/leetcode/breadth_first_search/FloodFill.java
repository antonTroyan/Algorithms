package by.trayan.algorithms.leetcode.breadth_first_search;

/**
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from
 * the pixel image[sr][sc].
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the
 * starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those
 * pixels (also with the same color), and so on. Replace the color of all the aforementioned pixels with color.
 * <p>
 * Return the modified image after performing the flood fill.
 * <p>
 * Example:
 * Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
 * Output: [[2,2,2],[2,2,0],[2,0,1]]
 * Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all
 * pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with
 * the new color.
 * Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
 */

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private static void fill(int[][] image, int sr, int sc, int color, int currentElement) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length)
            return;
        if (currentElement != image[sr][sc])
            return;
        image[sr][sc] = color;
        // Make four recursive calls to the function with (sr-1, sc), (sr+1, sc), (sr, sc-1) and (sr, sc+1)...
        fill(image, sr - 1, sc, color, currentElement);
        fill(image, sr + 1, sc, color, currentElement);
        fill(image, sr, sc - 1, color, currentElement);
        fill(image, sr, sc + 1, color, currentElement);
    }
}
