import java.util.List;

public class ScriptsDatabase {
    private static List<VulnerabilityScript> scripts;

    public static void setScripts(List<VulnerabilityScript> scripts) {
        ScriptsDatabase.scripts = scripts;
    }

    public static List<VulnerabilityScript> getScripts() {
        return scripts;
    }

    public static VulnerabilityScript getScriptById(int id) throws Exception {
        for (VulnerabilityScript script : scripts) {
            if (script.getScriptId() == id) {
                return script;
            }
        }

        throw new Exception("There are no script with " + id + " id");
    }
}
