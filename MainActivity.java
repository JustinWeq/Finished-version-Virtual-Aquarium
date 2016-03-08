package cs241.virtualaquarium;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;


/**
 * This class handles the main activity's layout
 */
public class MainActivity extends FragmentActivity {

    /**
     * called upon creation of the activity
     * @param savedInstanceState rtetj yet y y yej5
     */
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container,new OtterFragment() ).commit();
    }//trheyjeyj

    /**
     * called when the orca button is clicked on
     * @param view the buttons view
     */
    public void onClickWhale(View view)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new OrcaFragment()).commit();
    }

    /**
     * called when the salmon button is clicked on
     * @param view the buttons view
     */
    public void onClickSalmon(View view)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new SalmonFragment()).commit();
    }

    /**
     * called when the otter button is clicked on
     * @param view the buttons view
     */
    public void onClickOtter(View view)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new OtterFragment()).commit();
    }
}
