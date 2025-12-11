public class PetrolEng implements Engine{
    @Override
    public int start() {
        System.out.println("Petrol engine start");
        return 1;
    }

}
