package Percobaan3;

/**
 *
 * @author Admin
 */

public class TestAccount {

    public static void main(String[] args) {

        Account acc[] = new Account[5];

        for (int i = 0; i < acc.length; i++) {
            acc[i] = new Account();
        }

        acc[0].setNewData(100, 110);
        acc[1].setNewData(110, 120);
        acc[2].setNewData(10, 105);
        acc[3].setNewData(100, 110);
        acc[4].setNewData(107, 118);

        for (int i = 0; i < acc.length; i++) {
            System.out.print("Nilai Atribut pada object " + (i + 1) + " : ");
            acc[i].showData();
        }

    }

}
