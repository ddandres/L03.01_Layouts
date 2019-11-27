/*
 * Copyright (c) 2019. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package labs.dadm.l0301_layouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
        This method is activated whenever any of the buttons is clicked.
        It launches a new activity that displays the type of layout selected.
     */
    public void testLayout(View view) {
        Intent intent = new Intent(MainActivity.this, ShowLayoutActivity.class);
        String extra;
        switch (view.getId()) {

            // Vertical layout
            case R.id.bVertical:
                intent.putExtra(Util.LAYOUT, Util.VERTICAL);
                break;

            // Horizontal layout
            case R.id.bHorizontal:
                intent.putExtra(Util.LAYOUT, Util.HORIZONTAL);
                break;

            // Nested vertical and horizontal layouts
            case R.id.bNested:
                intent.putExtra(Util.LAYOUT, Util.NESTED);
                break;

            // Relative layout (Constraint layout is preferred)
            case R.id.bRelative:
                intent.putExtra(Util.LAYOUT, Util.RELATIVE);
                break;

            // Constraint layout
            case R.id.bConstraint:
                intent.putExtra(Util.LAYOUT, Util.CONSTRAINT);
                break;

            // Frame layout
            case R.id.bFrame:
                intent.putExtra(Util.LAYOUT, Util.FRAME);
                break;

            // Table layout
            case R.id.bTable:
                intent.putExtra(Util.LAYOUT, Util.TABLE);
                break;

            // Gridlayout
            case R.id.bGrid:
                intent.putExtra(Util.LAYOUT, Util.GRID);
                break;
        }
        startActivity(intent);
    }
}
