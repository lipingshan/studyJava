package java_basic.stu_design_mode.restu.行为型模式.模板模式;
//模板模式
public class TemplatePattern {
    public static void main(String[] args) {
        System.out.println("###### chess game ######");
        ChessGame chessGame = new ChessGame();
        chessGame.play();
        System.out.println("\n###### football game ######");
        FootBallGame ballGame = new FootBallGame();
        ballGame.play();
    }
}
