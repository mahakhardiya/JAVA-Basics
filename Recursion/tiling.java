public class tiling {
    public static int tilingProblem(int n){ // 2 * n (floor size)
        if(n == 0 || n == 1 ){
            return 1;
        }
        //vertical choice
        int fnm1 = tilingProblem(n-1);

        //horitzontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
