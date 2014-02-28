public abstract class Player{
    
    protected char guess = 96; //ASCII character 96 is the one right before 'a'
    
    public void promptGuess(){
        System.out.print("Please enter in a letter to guess: ");
    }
    
    public abstract char makeGuess(String in_word, String already_guessed);
    
    public char getGuess(){
        return guess;
    }
    
    pubilc boolean validInput(char input){
    if( (input >= 'A' && input <= 'Z')|| (input >= 'a' && input <= 'z') ){
            return true;
        }
    else{
        return false;
        }
    }
    
}
