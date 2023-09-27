/**
 * This interface shows the methods needed to create a movie timer app.
 */
public interface IndividualBackendInterface {
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
    public void returnListOfMovies();

    /**
     * Command loop for exiting the app.
     */
    public void exitAppCommandLoop();

    /**
     * Initializes the dataset for this program to use.
     *
     * @param dataFile the list of movies to be stored
     */
    public void loadData(String dataFile);

    /**
     * This method finds the movie with the shortest run time in the dataset and returns it.
     *
     * @return Returns the title of the movie with the shortest run time.
     */
    public String findShortestMovie();

    /**
     * Finds all the movies between two run time lengths given by the user and returns them.
     *
     * @param lowerBound the minimum run time a movie should have that will be returned by the
     * program.
     * @param upperBound the minimum run time a movie should have that will be returned by the
     * program.
     * @return an array of movies with runtimes between lowerBound and upperBound.
     */
    public String[] returnListOfMovies(int lowerBound, int upperBound);

    /**
     * Allows the user to exit the app.
     */
    public void exitApp();

    //This is an example of a possible constructor for the Movie Timer App.
    /**
     * MovieTimerConstuctor(Object backend, Scanner scanner);
     *
     */
 }
