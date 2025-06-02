package expenses.persistence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import expenses.core.model.Despesa;
import java.io.Serializable;

public class GravarJson implements Serializable {

    ObjectMapper objectMapper = new ObjectMapper();


    public String despesaParaJson(Despesa despesa) throws JsonProcessingException {
        return objectMapper.writeValueAsString(despesa);

    }

    public Despesa jsonParaDespesa(String json) throws JsonProcessingException {
        return objectMapper.readValue(json, Despesa.class);
    }

}
