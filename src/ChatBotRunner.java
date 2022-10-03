    public class ChatBotRunner {
        public static void main(String[]args){
            ChatBot Joe = new ChatBot("Joe" , 5);
            Joe.greeting("Henry");
            Joe.favoriteNumber(23);
            Joe.weather();
            // turns Joe.convertFeetToMeters into a double
            double meters = Joe.convertFeetToMeters(40);
            System.out.println("There are" + meters + "meters in 40 feet");

            // turns Joe.addNumbers into an integer variable
            int addition = Joe.addNumbers(30 , 23, 45);
            System.out.println("The sum of all the numbers is: " + addition);

            //prints out goodbye message without variable
            System.out.println(Joe.goodbye());

            System.out.println("Your quotient is: " + Joe.divideNumbers(30.5 , 23.67));
            Joe.favoriteFood("orange");
        }
    }
