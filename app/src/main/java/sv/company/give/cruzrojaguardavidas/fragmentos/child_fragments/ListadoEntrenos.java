package sv.company.give.cruzrojaguardavidas.fragmentos.child_fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sv.company.give.cruzrojaguardavidas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoEntrenos extends Fragment {


    public ListadoEntrenos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.child_fragment_listado_entrenos, container, false);
    }

}
