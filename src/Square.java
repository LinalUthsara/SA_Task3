public class Square implements Shape{
    @Override
    public void draw() {

        int length = 5;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
