
public class cricket {
    public static void main(String[] args) {
        batsman b = new batsman();
        b.bating();
        bowler c = new bowler();
        c.bowling();
    }
}

class cricket_player {
    String a = "VIRAT KOHLI";
    String b = "ROHIT SHARMA";
    String c = "RAVINDRA JADEJA";
    String d = "HARDIK PANDIYA";
    String e = "KL RAHUL";
    String f = "JASPRIT BUMRAH";
    String g = "MOHMMED SIRAJ";
    String h = "KULDEEP YADAV";
    String i = "RISHABH PANT";
    String j = "RINKU SING";
    String k = "JUZVENDRA CHAHLA";
}

class batsman extends cricket_player {
    void bating() {
        System.out.println("-------batsman-------");
        System.out.println("batsman = " + a);
        System.out.println("batsman = " + b);
        System.out.println("batsman = " + e);
        System.out.println("batsman = " + d);

    }
}

class bowler extends cricket_player {
    void bowling() {
        System.out.println("-------bowler-------");
        System.out.println("bowler = " + f);
        System.out.println("bowler = " + g);
        System.out.println("bowler = " + h);
        System.out.println("bowler = " + i);
        System.out.println("bowler = " + j);
    }
}