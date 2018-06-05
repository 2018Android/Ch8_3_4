package com.example.admin.ch8_3_4;



import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerDialogFragment extends DialogFragment {
    Calendar dt = Calendar.getInstance();
    static DatePickerDialogFragment newInstance(){
        DatePickerDialogFragment dlg = new DatePickerDialogFragment();
        return dlg;
    }

    DatePickerDialog.OnDateSetListener dpdListener = new DatePickerDialog.OnDateSetListener(){
      public void onDateSet(DatePicker view, int year, int month, int dayOfMonth){
          ((MainActivity)getActivity()).getDate(year, month, dayOfMonth);
      }
    };

    public Dialog onCreateDialog(Bundle savedInstanceSate){
        DatePickerDialog dDialog = new DatePickerDialog(
                getActivity()
                , dpdListener
                , dt.get(Calendar.YEAR)
                , dt.get(Calendar.MONTH)
                , dt.get(Calendar.DAY_OF_MONTH)
        );
        return dDialog;
    }


    public DatePickerDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_date_picker_dialog, container, false);
    }

}
