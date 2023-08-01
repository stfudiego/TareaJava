public class ProjectTest {
    public static void main(String[] args) {

       Project elevatorPitch = new Project("Z", "el proyecto zeus v1.0");

       String resp1 = elevatorPitch.getNombre();
       String resp2 = elevatorPitch.getDescripcion();

       System.out.println(resp1 +": "+resp2);
    }

}
