public class Movie extends Event{

    public Movie (String title, int releaseYear, int age){
        super(title, releaseYear, age);
    }

    public Movie () {
    }

    public Movie (int releaseYear, int age) {
        super.releaseYear = releaseYear;
        super.age = age;

    }

}
