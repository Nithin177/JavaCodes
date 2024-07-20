public class ReverseRightHalfPyramid {
    public static void main(String[] args) {
//        for (int i = 4; i > 0; i--) {
//            for (int j = 1; j <= i; j++) {
        
                for (int i = 0; i < 4; i++) {
                    for (int j = 1; (j+i) <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
