class Netflix {
    static int movieid;
    static String mTitle;
    static String gen;
    static String releaseDat;
    static double ratings;

    public static void addMovie(int movieId, String movieTitle, String genre, String releaseDate, double rating) {
        movieid = movieId;
        mTitle = movieTitle;
        gen = genre;
        releaseDat= releaseDate;
        ratings = rating;
    }

    public static void getMovieDetails() {
        System.out.println("Movie Id: " + movieid);
        System.out.println("Movie Title: " + mTitle);
        System.out.println("Genre: " + gen);
        System.out.println("Release Date: " + releaseDat);
        System.out.println("Rating: " + ratings);
    }
}
