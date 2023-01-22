package builder;

import java.util.Arrays;
  /**
   * @author parten23
   * <br>
  * Matrix formatting.
  */
public final class FormatFactory {

    public void format(String[][] matrix){
        for (String[] strings : matrix) {
            String subMatrix = Arrays.deepToString(strings);
            strip(subMatrix + "\n");
        }
    }

    private void strip(String str){
        for (int x = 0; x < str.length(); x++){
            String element = str.substring(x, x+1);
            if(!element.equals(",") && !element.equals("[") && !element.equals("]")) {
                System.out.print(element);
            }
        }
    }

}
