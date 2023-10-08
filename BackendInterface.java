import java.io.File;
public interface BackendInterface {
    /* Constructor for interface:
     * public BackendInterface (String file, int min, int max){
     * this.file = file;
     * this.min = min;
     * this.max = max;
     * }
     **/



    /**
     * Reads data from a given CSV file
     * @param file is the CSV file
     */
    void readFile(File file);
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
