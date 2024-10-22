package main.java.org.LeetCodeChallenges;

    public class TripletFinder {

        // Method to find and count valid triplets
        public static void findTriplets(int[] d, int t) {
            int n = d.length;
            int count = 0;

            // Iterate over all possible triplets (a, b, c) where a < b < c
            for (int a = 0; a < n - 2; a++) {
                for (int b = a + 1; b < n - 1; b++) {
                    for (int c = b + 1; c < n; c++) {
                        // Check the conditions
                        if (d[a] < d[b] && d[b] < d[c]) {
                            int sum = d[a] + d[b] + d[c];
                            if (sum <= t) {
                                // Print the valid triplet
                                System.out.println("(" + d[a] + ", " + d[b] + ", " + d[c] + ") -> Sum: " + sum);
                                count++;
                            }
                        }
                    }
                }
            }

            // Print the total count of valid triplets
            System.out.println("Number of valid triplets: " + count);
        }

        public static void findQuadrouplet(int[] d, int t) {
            int n = d.length;
            int count = 0;

            // Iterate over all possible triplets (a, b, c) where a < b < c
            for (int a = 0; a < n - 3; a++) {
                for (int b = a + 1; b < n - 2; b++) {
                    for (int c = b + 1; c < n-1; c++) {
                        for(int f = c + 1; f < n; f++)
                        // Check the conditions
                        if (d[a] < d[b] && d[b] < d[c] && d[c] < d[f]) {
                            int sum = d[a] + d[b] + d[c] + d[f];
                            if (sum <= t) {
                                // Print the valid triplet
                                System.out.println("(" + d[a] + ", " + d[b] + ", " + d[c] + ", " + d[f] + ") -> Sum: " + sum);
                                count++;
                            }
                        }
                    }
                }
            }

            // Print the total count of valid triplets
            System.out.println("Number of valid triplets: " + count);
        }

        // Main method
        public static void main(String[] args) {
            // Example array and threshold
            int[] d = {1, 2, 3, 4, 5, 7, 8, 9};
            int t = 15;

            // Call the method to find triplets
           // findTriplets(d, t);

            findQuadrouplet(d,t);
        }
    }
