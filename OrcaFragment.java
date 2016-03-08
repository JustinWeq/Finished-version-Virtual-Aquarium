package cs241.virtualaquarium;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * a fragment that is intended for displaying info for the orca
 */
public class OrcaFragment extends Fragment{

    /**
     * called to inflate and return the view
     * @param inflater the inflater ti use to inflate
     * @param container the container to use for inflationj
     * @param savedInstanceState th4 saved instance of the last state
     * @return the view for the fragment
     */
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.orca_layout,container,false);
    }
}
