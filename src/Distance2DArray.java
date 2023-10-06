import java.util.Scanner;

public class Distance2DArray {

   //this is the class variable
    //there would only be one copy of each class variable per class
    // regardless of how many objects are created from it
    // city_names is array of strings


    private static final String [] CITY_NAMES =
            {"Atlanta", "Boston", "Chicago", "Houston",
                    "Los Angeles", "New York", "San Francisco",
                    "Washington"};

    //distance is 8x8 2d array
    private static final int [] [] DISTANCES =
            {       {0,1110,710,790,2190,850,2480,620},
                    {1110,0,1000,1830,3020,210,3130,450},
                    {710,1000,0,1090,2050,810,2170,710},
                    {790, 1830, 1090, 0,1540, 1610, 1910, 1370},
                    {2190, 3020, 2050, 1540, 0, 2790, 390, 2650},
                    {850, 210, 810, 1610, 2790, 0, 2930, 240},
                    {2480, 3130, 2170, 1910, 390, 2930, 0, 2840},
                    {620, 450, 710, 1370, 2650, 240, 2840, 0}};

    public static void main(String [] args){
        //display initial message, including a list of legal cities
        System.out.println(
                """
                        This program finds the distance between two cities.
                        Supported cities: Atlanta, Boston, Chicago, Houston,
                        Los Angeles, New York, San Francisco, Washington.
                        """);

        //call getcitycode to obtain code for starting city
        //and destination city
        int start = getCityCode("Enter starting city: ");
        int destination = getCityCode("Enter destination city: ");

        System.out.println(
                "\nThe distance from "+ CITY_NAMES[start]+ " to " +
                        CITY_NAMES[destination] + " is " +
                        DISTANCES[start][destination] + " miles.");

        //prompt user to enter city name

        private static int getCityCode(String prompt) {
            Scanner scan = new Scanner(System.in);
            while(true){
                System.out.println(prompt);
                String cityName = scan.nextLine().trim();

                //search for city code
                for(int i = 0; i < CITY_NAMES.length; i ++ )
                    if(cityName.equalsIgnoreCase(CITY_NAMES[i]))
                        return i;

                System.out.println("City name was not recognized");
            }
        }

    }


}
