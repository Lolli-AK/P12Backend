import java.util.Scanner;

/**
 * This interface shows the methods needed to create a movie timer app.
 */
public interface FrontendInterface {

    /**
     * @param backend the reference to the backend.
     * @param scnr scanner to take user input.
     */
    // FrontendInterface(Object backend, Scanner scnr);

    /**
     * Command loop for the main menu.
     */
    public void mainCommandLoop();

    /**
     * Command loop for loading a data file.
     */
    public void loadDataCommandLoop();

    /**
     * Command loop for finding the shortest movie.
     */
    public void findShortestMovieCommandLoop();

    /**
     * Command loop for finding a list of movies between two runtimes.
     */
    public void findListOfMoviesCommandLoop();

    /**
     * Exits the app.
     */
    public void exitApp();

    /**
     * Initializes the dataset for this program to use.
     *
     * @param dataFile the list of movies to be stored
     */
    public void loadData(String dataFile);

    /**
     * This method finds and returns the movies with the shortest run time in the dataset.
     *
     * @return a string with the list of titles of the movies with the shortest run time.
     */
    public String findShortestMovies();

    /**
     * Finds all the movies between two run-time lengths given by the user and returns them.
     *
     * @param lowerBound the minimum run-time a movie should have that will be returned by the
     *        program.
     * @param upperBound the minimum run-time a movie should have that will be returned by the
     *        program.
     * @return a string with the list of titles of the movies with run-times between lowerBound
               and upperBound.
     */
    public String findListOfMovies(int lowerBound, int upperBound);

}
