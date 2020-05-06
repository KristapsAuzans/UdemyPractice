package Section5.Exercises2;

public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(6);
        printSquareStar(9);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        else{
        int row = 0;
        int column = 0;
        for (int i = 0; i < number; i++) {
            row++;
            column = 0;
            for (int j = 0; j < number; j++) {
                column++;
                if (row ==1 || column==1||row==number||column==number){
                    System.out.print("*");
                }
                else if(row==column || number-column==row-1){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();


        }}

    }
}
