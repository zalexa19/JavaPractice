public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        List<String> list= new List<>();
        list.add("hi ");
        list.add("alex ");
        list.add("this ");
        list.add("is ");
        list.add("great");
        list.print_list();

        list.reverse_list();
        list.print_list();

        System.out.println("printing a list of numbers");
        List<Integer> numbersList = new List<>();

        numbersList.add(1);
        numbersList.add(2);
        numbersList.add(3);

        numbersList.print_list();

        numbersList.reverse_list();
        numbersList.print_list();
    }
}
