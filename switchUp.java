import java.util.Scanner;

public class SwitchUp {
    String userInput;

    SwitchUp(String userInput){
        this.userInput = userInput;
    }

    private String convertString(){

        StringBuilder convertedOutput = new StringBuilder();
        char[] userInputChars = userInput.toCharArray();
        char convertedChar;
        boolean isCharUppercase;



        for(char userInputChar : userInputChars  ){
            isCharUppercase = Character.isUpperCase(userInputChar);

            if(isCharUppercase){
                convertedChar = Character.toLowerCase(userInputChar);
            }else{
                convertedChar = Character.toUpperCase(userInputChar);
            }

            convertedOutput.append(convertedChar);

        }

        return convertedOutput.toString();
    }



    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Sentence");


        SwitchUp switchUpObj = new SwitchUp(sc.nextLine());

        System.out.println(switchUpObj.convertString());

    }
}

// Extension method

//    private boolean matchString(String input){
//
//    }
//
//    private String convertDashAndSpace(String input){
//
//        StringBuilder convertedOutput = new StringBuilder();
//        char[] userInputChars = input.toCharArray();
//
//
//        return "";
//    }