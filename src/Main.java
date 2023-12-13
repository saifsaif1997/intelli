public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");

        Entraineur entraineur = new Entraineur("kariim","22/12/2016",8,210000);
        System.out.println(entraineur.estimerFinContrat());

    }
}