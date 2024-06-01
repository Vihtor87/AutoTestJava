package org.max.homeWorks.HW2;

public class Program {
    public static void main(String[] args) {
        FiveChanel fiveChanel = new FiveChanel();
        RbkChanel rbkChanel = new RbkChanel();

        new Follower("Ivan", fiveChanel);
        new Follower("Liza", fiveChanel);
        new Follower("Den", rbkChanel);

        fiveChanel.setNews("Вот такие новости!");
        rbkChanel.setNews("Вот такие пироги!");

    }
}
