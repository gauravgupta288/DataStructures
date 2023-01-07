package Month05_Dec.Day105_241222;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class test {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        ObjectNode node2 = mapper.createObjectNode();

        node.put("name", "xyz");
        node.put("role", 2);

        node2.put("name", "xyz");
        node2.put("role", 2);

        JsonNode tree1 = mapper.readTree(node.toString());
        JsonNode tree2 = mapper.readTree(node2.toString());

        if(tree1.equals(tree2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
    static {
        System.out.println("static");
    }

}
