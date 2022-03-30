import java.util.ArrayList;
import java.util.List;

public class Parcours {
    private String name;
    private List<Semestre> semestre = new ArrayList<Semestre>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Semestre> getSemestre() {
        return semestre;
    }
    public void setSemestre(List<Semestre> semestre) {
        this.semestre = semestre;
    }
}