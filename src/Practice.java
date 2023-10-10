import java.util.Scanner;

public class Practice {

    private static final String[] LOCATION =
            {"[a]", "[b]", "[c]"};

    private static final int [][] LENGTH =
            {       {0,3,4},
                    {3,0,4},
                    {4,4,0}
            };

    public static void main (String[] args) {
        System.out.println("       [a]\\            ");
        System.out.println("        |  \\           ");
        System.out.println("        |   \\          ");
        System.out.println("        |    \\         ");
        System.out.println("       [b]____[c]       ");
        System.out.println("                        ");


        int start = getStart("Enter starting spot: ");
        int finish = getStart("Enter finish spot: ");

        System.out.println(" The distance from " + LOCATION[start] + " to " +
                LOCATION[finish] + " is "+ LENGTH[start][finish] + " blocks.");


    }

    private static int getStart(String prompt){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(prompt);
            String input = sc.nextLine().trim();

            for( int i = 0 ; i < LOCATION.length; i ++ )
                if(input.equalsIgnoreCase(LOCATION[i]))
                    return i;

            System.out.println("City name was not recognized");
        }
    }



}
