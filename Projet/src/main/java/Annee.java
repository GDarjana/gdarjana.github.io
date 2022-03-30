import java.util.ArrayList;
import java.util.List;

public class Annee {
    private String name;
    private List<Parcours> parcours = new ArrayList<Parcours>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Parcours> getParcours() {
        return parcours;
    }
    public void setParcours(List<Parcours> parcours) {
        this.parcours = parcours;
    }
}




