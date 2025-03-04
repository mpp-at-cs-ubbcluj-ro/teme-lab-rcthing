import static org.junit.jupiter.api.Assertions.assertEquals;
import map.model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class ComputerRepairRequestTest {
    @Test
    @DisplayName("First Test")
    public void testExample(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        assertEquals("",crr.getOwnerName());
        assertEquals("",crr.getOwnerAddress());
    }
    @Test
    @DisplayName("Test exemplu")
    public void testExample2(){
        assertEquals(2,2,"Numerele ar trebui sa fie egale");
    }
}
