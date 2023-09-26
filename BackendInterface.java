public interface BackendInterface {
    /* Constructor for interface:
     * public BackendInterface (String filePath){
     * this.filePath = filePath;
     * this.min = min;
     * this.max = max;
     * }
     **/



    /**
     * Reads data from a given CSV file
     * @param filePath The path to the CSV file
     */
    void readFile(String filePath);
    /**
     * Gives a list of the movies with the minimum duration
     * @param min The minimum duration
     */
    Object[] getMinimumDurationMovies(int min);
    /**
     * Get a list of movies between min and max duration
     * @param min The minimum duration
     * @param max The maxium duration
     */
    Object[] getMoviesInRange(int min, int max);




}
