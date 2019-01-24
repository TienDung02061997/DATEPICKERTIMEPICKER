package com.example.nguyentiendung.datepickertimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
     DatePicker datePicker;
     TimePicker timePicker;
     Calendar calendarNow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker =(DatePicker)findViewById(R.id.datePicker);
        timePicker=(TimePicker)findViewById(R.id.timePicker);
        getDatePicker();
        getTimePicker();
    }

    public void getDatePicker() {
        //khoi tao lich voi ngay hien tai cua thiet bi
        calendarNow =Calendar.getInstance();
        int year=calendarNow.get(calendarNow.YEAR);
        final int Month=calendarNow.get(calendarNow.MONTH);
        int day=calendarNow.get(calendarNow.DAY_OF_MONTH);
        //dua ngay thang nam lay dc vao datePicker
        datePicker.init(year, Month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(MainActivity.this,dayOfMonth+"-"+monthOfYear+"-"+year,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void getTimePicker() {
       timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
           @Override
           public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                 Toast.makeText(MainActivity.this,hourOfDay+":"+minute,Toast.LENGTH_SHORT).show();
           }
       });
    }
}
