package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    String finalString = "";
    Character delimiter;
    public StringAssembler(Character delimeter) {
        delimiter = delimeter;

    }

    public StringAssembler append(String str) {

        finalString += str + delimiter;
         return this;
    }

    public String assemble() {
        return this.finalString.substring(0, finalString.length()-1);
    }
}
