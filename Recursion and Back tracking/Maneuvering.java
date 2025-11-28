import java.util.*;

public class Maneuvering {
    static int m, n;
    static char[] ans;

    static void printer(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(ans[i]);
        }
        System.out.println();
    }

    static boolean Check(int x, int y) {
        return x < m && y < n;
    }

    static void rec(int r, int c, int level) {
        if (r == m - 1 && c == n - 1) {
            printer(level);
            return;
        }

        char[] choices = {'D', 'R'};
        for (int i = 0; i < choices.length; i++) {
            if (choices[i] == 'D' && Check(r + 1, c)) {
                ans[level] = 'D';
                rec(r + 1, c, level + 1);
            } 
            else if (choices[i] == 'R' && Check(r, c + 1)) {
                ans[level] = 'R';
                rec(r, c + 1, level + 1);
            }
        }
    }

    static void solve() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m and n: ");
        m = sc.nextInt();
        n = sc.nextInt();
        ans = new char[m + n];

        rec(0, 0, 0);
    }

    public static void main(String args[]) {
        solve();
    }
}