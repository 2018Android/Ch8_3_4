package com.example.admin.ch8_3_4;



import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TimePicker;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class TimePickerDialogFragment extends DialogFragment {

    Calendar dt = Calendar.getInstance();
    static TimePickerDialogFragment newInstance(){
        TimePickerDialogFragment dlg = new TimePickerDialogFragment();
        return dlg;
    }

    TimePickerDialog.OnTimeSetListener tpdListener = new TimePickerDialog.OnTimeSetListener(){
        public void onTimeSet(TimePicker view, int hourOfDay, int minute){
            ((MainActivity)getActivity()).getTime(hourOfDay, minute);
        }
    };

    public Dialog onCreateDialog(Bundle savedInstanceState){
        TimePickerDialog tDialog = new TimePickerDialog(
                getActivity()
                , tpdListener
                , dt.get(Calendar.HOUR)
                , dt.get(Calendar.MINUTE)
                ,true
        );
        return tDialog;
    }


    public TimePickerDialogFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_picker_dialog, container, false);
    }

}
