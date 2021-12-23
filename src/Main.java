public class Main {
    public static void main(String[] args) {

        for (Event event: getMovies()) {
            validEvent(event);
            //System.out.println(event.getTitle());
        }

        for (Event event: getTheatres()) {
            validEvent(event);
        }

        System.out.println("Все события корректны");

    }

    public static Movie[] getMovies() {
        return new Movie[] {
                new Movie("Начало",2012, 16),
                new Movie("Финал", 2004, 23),
                new Movie("50 серых цветов", 2012, 32),
                //new Movie(),
                //new Movie(2012, 21)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[] {
                new Theatre("Анна Каренина", 2012, 16),
                new Theatre("Еще одн спектакль", 2014, 21),
                new Theatre("И еще один", 2021, 23),
        };
    }

    public static void validEvent(Event event) throws RuntimeException {
        try {
            if (event.getTitle().equals("") || event.getTitle().equals("null") || event.getReleaseYear() == 0
                    || event.getAge() == 0) {
                throw new RuntimeException();
            }
        } catch (NullPointerException err) {
            throw new RuntimeException();
        }
    }
}
