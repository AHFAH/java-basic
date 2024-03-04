package class1.classEx;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] mv = new MovieReview[2];

        MovieReview mv1 = new MovieReview();
        mv1.title = "인셉션";
        mv1.review = "인생은 무한 루프";

        MovieReview mv2 = new MovieReview();
        mv2.title = "어바웃 타임";
        mv2.review = "인생 시간 영화!";

        mv[0] = mv1;
        mv[1] = mv2;

        for(MovieReview m : mv)
            System.out.println("영화 제목: " + m.title + ", 리뷰: " + m.review);
    }
}
