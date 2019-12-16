public class programgrade{
    public static void main(String[] args) {
        
        int nilai = Integer.parseInt(args[0]);
        int a = 0;

        if(nilai > 85&& nilai <=100) {
            System.out.println("A");
        }
        else if(nilai > 75&& nilai <=84) {
            System.out.println("B");
        }
        else if(nilai > 65&& nilai <=74) {
            System.out.println("C");
        }
        else if(nilai > 55&& nilai <=64) {
            System.out.println("D");
        }
        else if(nilai > 45&& nilai <=54) {
            System.out.println("E");
        }
        else if(nilai >= 0&& nilai <=44) {
            System.out.println("F");
        }
        else{
            System.out.println("SELAMAT ANDA TIDAK LULUS!");
        }
    }
}