package ajaymehta.a2darray1;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Avi Hacker on 6/26/2017.
 */


/*

every row contain columns....columns are not indenpendent of rows...they exist inside rows..thats how u have to think
values  = new int[4][4];    first box of [4] have the whole priortiy

        values[1][1] = 2;  // means row 1 hold 2 at 1 position of its coulumn

    row       coulum      data

    0  -->  0 =                           // u can only see columns data in 2d array...u have to imagine row numbers...
            1 =
            2 =
            3 =


    1  -->   0 = 0
             1 = 2
             2 = 0
             3 = 0


 n go on...this is how it stores data....2d array...rows numbers are invisible ..u can only see column in 2d array..not posiiton but what data they hold

*/



public class MyArray {


    int[][] values;
    StringBuffer buffer;

    public void addingValues() {

        values  = new int[4][4];     // it means we have 4 rows . every row contain 4 elements  row 0 --> 0 1 2 3 (these are positions)

        values[0][0] = 1;      // oth row containg 1 at oth position of its column list   0 --> 1 0 0 0  ..to see how array stores data see above..!!
        values[1][1] = 2;
        values[3][2] = 5;

        buffer = new StringBuffer();

    }

    public void print(Context context) {

        for(int i=0 ; i< values.length; i++) {   // values.lenght will go through row lenght only -- 4


            int sub[] = values[i];   // 0 --> 0 1 2 3 [position] giving to sub array // every row contain sub array [single array] (called columns) .we put values[i] ...means we putting 0 1 2 3 [position] of a row value[row] into sub array..so that we can linerary loop through all the position that row contains..

            for(int x = 0; x < sub.length ; x++) {  // upto column length

                buffer.append(sub[x] +"");
                /*if(x ==3) {                       // this is the way of line break u can do this ..inside when column length finish or
                    buffer.append("\n");
                }*/
            }
            buffer.append("\n");      // just do a line break as it comes out of sub loop

        }
        MainActivity.array.setText(buffer);
    }
}
