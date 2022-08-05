package Week1.GridUnique;

public class grid {
    public int uniquePaths(int m, int n) {
        int N = n + m - 2;
        int r = m - 1; 
        double res = 1;
        
        for (int i = 1; i <= r; i++)
            res = res * (N - r + i) / i;
        return (int)res;
}
public static void main(String[] args) {
    grid objGrid = new grid();
    int totalCount = objGrid.uniquePaths(2, 3);
    System.out.println(totalCount);
}
}
