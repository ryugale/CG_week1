

class compareheight {

    public class footballteamheight {

        public static void main(String[] args) {
            int[] heights = new int[11];

            for (int i = 0; i < heights.length; i++) {
                heights[i] = (int) (Math.random() * 101 + 150);
            }
            System.out.println("Heights of players ");
            for (int height : heights) {
                System.out.print(heights + " cm");
            }
            System.out.println();

            System.out.println("\nSum of heights: " + findSum(heights) + " cm");
            System.out.println("Mean height: " + findMean(heights) + " cm");
            System.out.println("Shortest height: " + findShortest(heights) + " cm");
            System.out.println("Tallest height: " + findTallest(heights) + " cm");
        }

        public static int findSum(int[] heights) {
            int sum = 0;
            for (int height : heights) {
                sum += height;
            }
            return sum;
        }

        public static double findMean(int[] heights) {
            return (double) findSum(heights) / heights.length;
        }

        public static int findShortest(int[] heights) {
            int min = heights[0];
            for (int height : heights) {
                if (height < min) {
                    min = height;
                }
            }
            return min;
        }

        public static int findTallest(int[] heights) {
            int max = heights[0];
            for (int height : heights) {
                if (height > max) {
                    max = height;
                }
            }
            return max;
        }

    }
}