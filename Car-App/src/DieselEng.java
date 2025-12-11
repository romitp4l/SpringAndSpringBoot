public class DieselEng implements Engine{
    @Override
    public int start() {
        System.out.println("DieselEng start");
        return 1;
    }
}
