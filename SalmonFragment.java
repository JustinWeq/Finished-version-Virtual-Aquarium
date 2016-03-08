package cs241.virtualaquarium;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * a fragment that is used to display the salmon info
 */
public class SalmonFragment extends Fragment{

    /**
     * called to inflate the view
     * @param inflater the inflater to use cfor inflating
     * @param container the container to inflate into
     * @param savedInstanceState the saved instance of the last state
     * @return the view to use for inflation
     */
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.salmon_layout,container,false);
    }
}
