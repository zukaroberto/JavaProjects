
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Continuar {
    private String res = "Repetir ?";
    public Continuar() {
    }
    public Continuar(String res) {
        this.res = res;
    }
    public boolean perguntar() {
        Scanner sc = new Scanner(System.in);
        System.out.println(res);
        String resposta = sc.nextLine();
        String[] res = new String[]{"sim", "ok", "yes", "y", "s", "sure"};
        List<String> sim = Arrays.asList(res);
        if (sim.contains(resposta.toLowerCase()))
            return true;
        else
            return false;
    }
}
