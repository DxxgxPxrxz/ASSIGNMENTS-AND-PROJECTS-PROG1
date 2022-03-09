import java.util.Objects;

public class Assignment8 {

    StringBuilder mix = new StringBuilder();
    StringBuilder result = new StringBuilder();
    String[] words;
    String message;
    int numberWords;

    public Assignment8(String message) {

        this.message = message;
        this.message += ' ';
        this.numberWords = numberWords(this.message);
        this.words = appendArray(this.numberWords, this.message);

        for (String word : this.words) {
            if (word.length() > 3) {
                String mixedword;
                do {
                    mixedword = mixMessage(word);
                } while (Objects.equals(mixedword, word));
                this.result.append(mixedword);
            }
            else {
                this.result.append(word);
            }
            this.result.append(' ');
        }
    }

    String mixMessage(String word) {

        int messageLength = word.length() - 1;
        boolean condition = word.charAt(messageLength) == ',' ||
                word.charAt(messageLength) == '.' ||
                word.charAt(messageLength) == '!';

        String clean_word = Refactor(word);


        int mixLength = clean_word.length() - 2;
        char[] charToMix = new char[mixLength];
        int c = 0;

        for (int i = 1; i < clean_word.length() - 1; i++){
            charToMix[c] = clean_word.charAt(i);
            c++;
        }

        for (int i = 0; i < clean_word.length(); i++) {
            char character;
            int count = 0;
            if (i == 0 || i == clean_word.length() - 1) {
                character = clean_word.charAt(i);
            } else {
                int number = (int) (Math.random() * mixLength);
                character = charToMix[number];
                mixLength -= 1;
                char[] aux = new char[mixLength];
                for (int j = 0; j < charToMix.length; j++){
                    if (j != number) {
                        aux[count] = charToMix[j];
                        count++;
                    }
                }
                charToMix = new char[mixLength];
                System.arraycopy(aux, 0, charToMix, 0, charToMix.length);
            }
            this.mix.append(character);
        }
        if (condition) {
            char sign = word.charAt(messageLength);
            this.mix.append(sign);
        }
        String message = String.valueOf(mix);
        mix = new StringBuilder();
        return message;
    }

    String Refactor(String word){
        word = word.replace(",", "");
        word = word.replace(".", "");
        word = word.replace("!", "");
        return word;
    }

    int numberWords(String word) {
        int numberWords = 0;

        for (int i = 0; i < word.length(); i++){
            char character = word.charAt(i);
            if (character == ' '){
                numberWords++;
            }
        }
        return numberWords;
    }

    String[] appendArray(int numberWords, String message) {
        StringBuilder create_word = new StringBuilder();
        String[] array = new String[numberWords];

        int pos_array = 0;

        for (int i = 0; i < message.length(); i++) {
            char character = message.charAt(i);
            if (character != ' ' ) {
                create_word.append(character);
            }else {
                array[pos_array] = String.valueOf(create_word);
                create_word = new StringBuilder();
                pos_array++;
            }
        }
        return array;
    }

    public String toString() {
        String result = String.valueOf(this.result);
        return result.trim();
    }
}