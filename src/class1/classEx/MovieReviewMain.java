package class1.classEx;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview mv1 = new MovieReview();
        MovieReview mv2 = new MovieReview();

        mv1.title = "인셉션";
        mv1.review = "인생은 무한 루프";
        mv2.title = "어바웃 타임";
        mv2.review = "인생 시간 영화!";

        System.out.println("영화 제목: " + mv1.title + ", 리뷰: " + mv1.review);
        System.out.println("영화 제목: " + mv2.title + ", 리뷰: " + mv2.review);

    }
}
