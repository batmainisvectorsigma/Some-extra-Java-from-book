enum Cereals {
    CAPTAIN_CRUNCH(50),
    FROOT_LOOPS(60),
    PEESES_PUFFS(100),
    COCOA_PUFFS(75);
    //NNNN(10,"chnage"); you have to add more paraater in Cerels too and add more assignent statment

    final int levelOfDelicious;
    // if final is not made here

    Cereals(int levelOfDelicious) {
        this.levelOfDelicious = levelOfDelicious;
    }
}

public class EnumTutFruitsExample{
    public static void main(String args[]) {
        //i could easily change the value in this place or any other plcae
        System.out.println(Cereals.FROOT_LOOPS.levelOfDelicious);
    }
}
