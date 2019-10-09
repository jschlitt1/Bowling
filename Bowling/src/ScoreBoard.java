import java.util.ArrayList;

public class ScoreBoard {
    ArrayList<Frame> FrameList = new ArrayList<Frame>();


    public void DisplayBoard(){
        for(Frame frame : FrameList){
            System.out.println("Frame Number: " + frame.getFrameNum());
            System.out.println("First Score" + frame.getFirstScore());
            System.out.println("Second Score" + frame.getSecondScore());
        }
    }
}
