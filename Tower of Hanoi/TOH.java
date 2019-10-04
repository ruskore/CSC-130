/**
 * Prof.: Abu-Samaha
 * Course: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 10/3/2019
 * Time: 11:00 PM
 */
public class TOH {
    private int totalDisks;
    private int count;

    public TOH(int n) {
        this.totalDisks = n;
        this.count = 0;
    }

    public void solve(){
        moveTower(this.totalDisks, 1, 3, 2);
        System.out.println("Moves: " + this.count);
    }

    private void moveTower(int n, int A, int C, int B) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + A + " to " + C);
        }
        else {

            moveTower(n - 1, A, B, C);
            System.out.println("Move disk " + n + " from " + A + " to " + C);
            moveTower(n - 1,B, C, A);

        }
        this.count++;
    }
}
