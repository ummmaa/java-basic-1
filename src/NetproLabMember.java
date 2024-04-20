import java.util.Random;

public class NetproLabMember {
    public static final int year = 15;
    public static final int column = 3;

    public static void main(String[] args) {
        int[][] members = new int[year][column];
        Random random = new Random();
        double totalRatio = 1;
        for (int i = 0; i < year; i++) {
            // 学生の総数
            members[i][0] = 110 + (random.nextInt(20) - 10);
            // 女性の割合(%)
            members[i][1] = 20 + i;
            // 岩井研の人数
            members[i][2] = 10 + (random.nextInt(6) - 3);

            // 男性数
            int men = members[i][0] - (int) (members[i][0] * ((float) members[i][1] / 100));
            // 総数から岩井研の人数を取り出す組み合わせ
            long cpsRatio = combination(members[i][0], members[i][2]);
            System.out.println("岩井研の人数の組み合わせは" + cpsRatio);
            // 男性の中から岩井研のメンバーを取り出す組み合わせ
            long menRatio = combination(men, members[i][2]);
            System.out.println("男性から岩井研メンバーを取り出す組み合わせは" + menRatio);
            // 岩井研の人数に男性しか入らない割合
            totalRatio *= (double) menRatio / cpsRatio;
        }
        System.out.println(totalRatio);
    }

    // Combination

    public static long combination(final int n, int r) {
        long nCr = 1;
        for (int i = 1; i <= r; i++) {
            nCr = nCr * (n - i + 1) / i;
        }

        return nCr;
    }
}
