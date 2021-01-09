import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ScriptsDatabase.setScripts(getTestData());
        try {
            ScriptsDatabase.getScriptById(4).run();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<VulnerabilityScript> getTestData()
    {
        List<VulnerabilityScript> scripts = new ArrayList<VulnerabilityScript>();
        List<Integer> d = new ArrayList<Integer>();
        d.add(2);
        VulnerabilityScript script1 = new VulnerabilityScript(1, d);
        VulnerabilityScript script6 = new VulnerabilityScript(6, null);
        List<Integer> d1 = new ArrayList<Integer>();
        d1.add(3);
        d1.add(6);
        VulnerabilityScript script2 = new VulnerabilityScript(2, d1);
        VulnerabilityScript script3 = new VulnerabilityScript(3, null);
        VulnerabilityScript script5 = new VulnerabilityScript(5, null);
        List<Integer> d4 = new ArrayList<Integer>();
        d4.add(1);
        d4.add(5);
        VulnerabilityScript script4 = new VulnerabilityScript(4, d4);
        scripts.add(script1);
        scripts.add(script2);
        scripts.add(script3);
        scripts.add(script4);
        scripts.add(script5);
        scripts.add(script6);

        return scripts;
    }
}
