import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaProfessor {

    ProfessorService ProfService;

    public BuscaProfessor(ProfessorService profService) {
        this.ProfService = profService;
    }

    public Professor buscaProfessor(int id) {
        String profJson = ProfService.buscaProfessor(id);

        JsonObject jsonObject = JsonParser.parseString(profJson).getAsJsonObject();

        return new Professor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString());
    }

}