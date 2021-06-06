import java.util.Random;

public class P1_resolv {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        int pedro = r.nextInt(6) + 17;
        int manuel = r.nextInt(6) + 17;
        int maria = r.nextInt(6) + 17;
        String[] res = new String[] { "Todos tem a mesma idade", "Manuel é mais velho. Maria e Pedro a mesma idade.",
                "Manuel e Maria tem a mesma idade. O Pedro é o mais novo",
                "Pedro é mais velho. Maria e Manuel a mesma idade.", "Pedro e Maria a mesma idade. Manuel o mais novo.",
                "Pedro e Manuel tem a mesma idade. Maria a mais nova.",
                "Maria a mais velha. Pedro e Manuel a mesma idade.",
                "Manuel mais velho.Maria do meio. Pedro mais novo.",
                "Manuel mais velho. Pedro do meio. Maria mais nova.",
                "Maria mais velha. Pedro do meio. Manuel mais novo.",
                "Maria mais velha. Manuel do meio. Pedro mais novo.",
                "Pedro mais velho. Maria do meio. Manuel mais novo",
                "Pedro mais velho. Manuel do meio. Maria mais nova.", "NOP" };
        System.out.println("pedro é " + pedro);
        System.out.println("manuel é " + manuel);
        System.out.println("maria é " + maria);
        System.out.println(res[compara(pedro, manuel, maria)]);
    }

    private static int compara(int pedro, int manuel, int maria) {

        if (pedro == manuel && pedro == maria)
            return 0;
        if (manuel > pedro && pedro == maria)
            return 1;
        if (manuel == maria && pedro < manuel)
            return 2;
        if (pedro > maria && maria == manuel)
            return 3;
        if (pedro == maria && manuel < maria)
            return 4;
        if (pedro == manuel && maria < manuel)
            return 5;
        if (maria > manuel && pedro == manuel)
            return 6;
        if (maria < manuel && maria > pedro)
            return 7;
        if (pedro < manuel && maria < pedro)
            return 8;
        if (pedro < maria && pedro > manuel)
            return 9;
        if (manuel < maria && manuel > pedro)
            return 10;
        if (maria < pedro && maria > manuel)
            return 11;
        if (manuel < pedro && manuel > maria)
            return 12;

        return 13;

    }

}