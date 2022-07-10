package Week1.buyAndSellStock;
public class buy {
    public int maxProfit(int[] prices) {
        int min_so_far = prices[0];
        int max_so_far = 0;
        
        for(int el:prices){
            if(el<min_so_far){
                min_so_far = el;
            }
            
            max_so_far = Math.max(max_so_far, el - min_so_far);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        buy b = new buy();
        System.out.println(b.maxProfit(prices));
    }
}
