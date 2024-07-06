package basic.class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {

        MovieReview[] reviews = new MovieReview[2];

        MovieReview movie1 = new MovieReview();
        movie1.title = "인셉션";
        movie1.review = "인생은 무한 루프";
        reviews[0] = movie1;

        MovieReview movie2 = new MovieReview();
        movie2.title = "어바웃 타임";
        movie2.review = "인생 시간 영화!";
        reviews[1] = movie2;

        for (MovieReview movie : reviews) {
            System.out.println("영화 제목 : " + movie.title + ", 리뷰 : " + movie.review);
        }
    }
}
