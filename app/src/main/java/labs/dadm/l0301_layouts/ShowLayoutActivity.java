/*
 * Copyright (c) 2019. David de Andrés and Juan Carlos Ruiz, DISCA - UPV, Development of apps for mobile devices.
 */

package labs.dadm.l0301_layouts;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ShowLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Determine the kind of layout to be displayed by this activity
        int layout = getIntent().getIntExtra(Util.LAYOUT, Util.VERTICAL);

        // Display the selected layout adn change the activity's title accordingly
        switch (layout) {
            case Util.VERTICAL:
                setContentView(R.layout.activity_show_vertical);
                setTitle(R.string.vertical);
                break;
            case Util.HORIZONTAL:
                setContentView(R.layout.activity_show_horizontal);
                setTitle(R.string.horizontal);
                break;
            case Util.NESTED:
                setContentView(R.layout.activity_show_nested);
                setTitle(R.string.nested);
                break;
            case Util.RELATIVE:
                setContentView(R.layout.activity_show_relative);
                setTitle(R.string.relative);
                break;
            case Util.CONSTRAINT:
                setContentView(R.layout.activity_show_constraint);
                setTitle(R.string.constraint);
                break;
            case Util.FRAME:
                setContentView(R.layout.activity_show_frame);
                setTitle(R.string.frame);
                break;
            case Util.TABLE:
                setContentView(R.layout.activity_show_table);
                setTitle(R.string.table);
                break;
            case Util.GRID:
                setContentView(R.layout.activity_show_grid);
                setTitle(R.string.grid);
                break;
        }

    }
}
