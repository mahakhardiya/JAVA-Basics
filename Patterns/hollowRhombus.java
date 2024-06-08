public class hollowRhombus {
    public static void hollowRhom(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=totCols; k++){
                if(i == 1 || i == totRows || k == 1 || k == totCols ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    } 
    public static void main(String[] args) {
        hollowRhom(5, 5);
    }
}
