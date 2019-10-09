public class Frame {
    private int num;
    private int Score1;
    private int Score2;
    private boolean strike = false;
    private boolean spare = false;


    public Frame(int num){
        this.num = num;
    }
    public char getFirstScore(){
        if(this.strike){
            return 'X';
        }else{
            return ((char)(Score1));
        }
    }

    public char getSecondScore(){
        if(this.spare){
            return '/';
        } else{
            return ((char)(Score2));
        }
    }

    public int getFrameNum(){
        return this.num;
    }

    public void Spare() {
        this.spare = true;
    }
    public void Strike() {
        this.strike = true;
    }
}
