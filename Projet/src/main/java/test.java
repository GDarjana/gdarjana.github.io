import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
    public static void main(String[] args) throws JsonProcessingException {
        Root racine = new Root();
        racine.setName("Université");

        Annee annee2021 = new Annee();
        annee2021.setName("2021");

        Annee annee2022 = new Annee();
        annee2022.setName("2022");

        
        racine.addAnnee(annee2021);
        racine.addAnnee(annee2022);

        ObjectMapper mapper = new ObjectMapper();

        String jsonString = mapper.writeValueAsString(racine);
        System.out.println(jsonString);









        Semestre semestre = new Semestre();
    }
}
