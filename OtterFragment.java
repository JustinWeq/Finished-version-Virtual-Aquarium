package cs241.virtualaquarium;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * a fragment that is intended for displaying the otter information
 */
public class OtterFragment extends Fragment {

    /**
     * called to inflate and return the view
     * @param inflater the inflater to use for inflating the view
     * @param container the container to inflate into
     * @param savedInstanceState the saved instance of the last state
     * @return the view that was inflated hh
     */
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.sea_otter_layout,container,false);
    }
}
