import java.util.ArrayList;
import java.util.List;

public class Root {
    private String name;

    private List<Annee> annee = new ArrayList<Annee>();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Annee> getAnnee() {
        return annee;
    }
    public void setAnnee(List<Annee> annee) {
        this.annee = annee;
    }
    public void addAnnee(Annee annee){this.annee.add(annee);}
}