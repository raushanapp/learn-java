public class LearnJava {
    public static void main(String[] args) throws Exception {
        int x = 10;
        int y = 5;
        int result = x + y;
        System.out.println(result);
        float percentages = percentage();
        System.out.println(percentages);
    }
    
    public static float  percentage() {
         int maxScore = 500;
        int userScore = 423;
        float percentage = (float) userScore / maxScore * 100.0f;
        return percentage;
    }
}

