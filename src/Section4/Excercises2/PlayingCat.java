package Section4.Excercises2;

public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
       boolean playing = true;
       if(summer == false){
           if (temperature<25 || temperature>35){
               System.out.println("false");
               playing = false;
           }
       }
       else if(summer == true){
           if (temperature<25 || temperature>45){
               System.out.println(" false");
               playing = false;
           }
       }



       return playing;
    }

}
