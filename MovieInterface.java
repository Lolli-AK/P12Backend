public interface MovieInterface extends Comparable <Movie>{
     /*   Constructor for interface:
      *   public Movie (String title, String genre, int year, String country, int duration) {
      *   this.title = title;
      *   this.genre = genre;
      *   this.year = year;
      *   this.country = country;
      *   this.duration = duration;
      **/

     /**
      * compare two movies based on their duration
      * @param object - the object it is comparing to
      * @return the difference between the movies' duration
      * @override
      * public int compareTo(Object object);
      */

     /**
      * Returns the title of the movie
      */
     String getTitle();
     /**
      * Returns the genre of the movie
      */
     String getGenre();
     /**
      * Returns the year of the movie
      */
     int getYear();
     /**
      * Returns the country of the movie
      */
     String getCountry();
     /**
      * returns an integer value of the duration of the movie (in minutes?)
      */
     int getDuration();

}


