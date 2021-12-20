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

        // All buttons share the same OnClickListener
        final View.OnClickListener listener = v -> testLayout(v.getId());

        findViewById(R.id.bVertical).setOnClickListener(listener);
        findViewById(R.id.bHorizontal).setOnClickListener(listener);
        findViewById(R.id.bNested).setOnClickListener(listener);
        findViewById(R.id.bRelative).setOnClickListener(listener);
        findViewById(R.id.bConstraint).setOnClickListener(listener);
        findViewById(R.id.bFrame).setOnClickListener(listener);
        findViewById(R.id.bTable).setOnClickListener(listener);
        findViewById(R.id.bGrid).setOnClickListener(listener);
    }

    // This method is activated whenever any of the buttons is clicked.
    // It launches a new activity that displays the type of layout selected.
    public void testLayout(int buttonClicked) {
        Intent intent = new Intent(MainActivity.this, ShowLayoutActivity.class);
        if (buttonClicked == R.id.bVertical) {
            // Vertical layout
            intent.putExtra(Util.LAYOUT, Util.VERTICAL);
        } else if (buttonClicked == R.id.bHorizontal) {
            // Horizontal layout
            intent.putExtra(Util.LAYOUT, Util.HORIZONTAL);
        } else if (buttonClicked == R.id.bNested) {
            // Nested vertical and horizontal layouts
            intent.putExtra(Util.LAYOUT, Util.NESTED);
        } else if (buttonClicked == R.id.bRelative) {
            // Relative layout (Constraint layout is preferred)
            intent.putExtra(Util.LAYOUT, Util.RELATIVE);
        } else if (buttonClicked == R.id.bConstraint) {
            // Constraint layout
            intent.putExtra(Util.LAYOUT, Util.CONSTRAINT);
        } else if (buttonClicked == R.id.bFrame) {
            // Frame layout
            intent.putExtra(Util.LAYOUT, Util.FRAME);
        } else if (buttonClicked == R.id.bTable) {
            // Table layout
            intent.putExtra(Util.LAYOUT, Util.TABLE);
        } else if (buttonClicked == R.id.bGrid) {
            // Gridlayout
            intent.putExtra(Util.LAYOUT, Util.GRID);
        }
        startActivity(intent);
    }
}
