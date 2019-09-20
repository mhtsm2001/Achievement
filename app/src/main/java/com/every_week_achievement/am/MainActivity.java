package com.every_week_achievement.am;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.IllegalFormatCodePointException;

public class MainActivity extends AppCompatActivity {

    private static final String Tag = "MainActivity";

    private DatePickerDialog.OnDateSetListener mDateSetListener;

    SharedPreferences sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView the_date = findViewById(R.id.date);
        Button bu_mhm1 = findViewById(R.id.bu_mhm1);

        LinearLayout mhm1 = findViewById(R.id.mhm1);
        LinearLayout mhm2 = findViewById(R.id.mhm2);
        LinearLayout mhm3 = findViewById(R.id.mhm3);
        LinearLayout mhm4 = findViewById(R.id.mhm4);
        LinearLayout mhm5 = findViewById(R.id.mhm5);
        LinearLayout mhm6 = findViewById(R.id.mhm6);
        LinearLayout mhm7 = findViewById(R.id.mhm7);
        LinearLayout mhm8 = findViewById(R.id.mhm8);
        LinearLayout mhm9 = findViewById(R.id.mhm9);









        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        final int day = cal.get(Calendar.DAY_OF_MONTH);

       final int monthF = month + 1;

        final String date_tv = day + "/" + monthF + "/" + year;
        the_date.setText(date_tv);


        sh = getSharedPreferences("save",Context.MODE_PRIVATE);
        TextView geld = findViewById(R.id.geld);



        geld.setText(sh.getString("geld", "0"));













        if ( sh.getString(the_date.getText().toString() + "mhm1", "no").equals("yes")) {
            mhm1.setVisibility(View.GONE);
        }else {
            mhm1.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm2", "no").equals("yes")) {
            mhm2.setVisibility(View.GONE);
        }else {
            mhm2.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm3", "no").equals("yes")) {
            mhm3.setVisibility(View.GONE);
        }else {
            mhm3.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm4", "no").equals("yes")) {
            mhm4.setVisibility(View.GONE);
        }else {
            mhm4.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm5", "no").equals("yes")) {
            mhm5.setVisibility(View.GONE);
        }else {
            mhm5.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm6", "no").equals("yes")) {
            mhm6.setVisibility(View.GONE);
        }else {
            mhm6.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm7", "no").equals("yes")) {
            mhm7.setVisibility(View.GONE);
        }else {
            mhm7.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm8", "no").equals("yes")) {
            mhm8.setVisibility(View.GONE);
        }else {
            mhm8.setVisibility(View.VISIBLE);
        }

        if ( sh.getString(the_date.getText().toString() + "mhm9", "no").equals("yes")) {
            mhm9.setVisibility(View.GONE);
        }else {
            mhm9.setVisibility(View.VISIBLE);
        }







        the_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar cal1 = Calendar.getInstance();
                int year = cal1.get(Calendar.YEAR);
                int month = cal1.get(Calendar.MONTH);
                int day = cal1.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_DeviceDefault_Light_Dialog, mDateSetListener, year, month, day);

                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
                dialog.show();

            }
        });

    mDateSetListener = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            Log.d(Tag, "onDateSet: date: " + year + "/" + month + "/" + dayOfMonth);

            int monthFF = month + 1;

            String date_tv = dayOfMonth + "/" + monthFF + "/" + year;
            the_date.setText(date_tv);



            LinearLayout mhm1 = findViewById(R.id.mhm1);
            LinearLayout mhm2 = findViewById(R.id.mhm2);
            LinearLayout mhm3 = findViewById(R.id.mhm3);
            LinearLayout mhm4 = findViewById(R.id.mhm4);
            LinearLayout mhm5 = findViewById(R.id.mhm5);
            LinearLayout mhm6 = findViewById(R.id.mhm6);
            LinearLayout mhm7 = findViewById(R.id.mhm7);
            LinearLayout mhm8 = findViewById(R.id.mhm8);
            LinearLayout mhm9 = findViewById(R.id.mhm9);

            if ( sh.getString(the_date.getText().toString() + "mhm1", "no").equals("yes")) {
                mhm1.setVisibility(View.GONE);
            }else {
                mhm1.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm2", "no").equals("yes")) {
                mhm2.setVisibility(View.GONE);
            }else {
                mhm2.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm3", "no").equals("yes")) {
                mhm3.setVisibility(View.GONE);
            }else {
                mhm3.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm4", "no").equals("yes")) {
                mhm4.setVisibility(View.GONE);
            }else {
                mhm4.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm5", "no").equals("yes")) {
                mhm5.setVisibility(View.GONE);
            }else {
                mhm5.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm6", "no").equals("yes")) {
                mhm6.setVisibility(View.GONE);
            }else {
                mhm6.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm7", "no").equals("yes")) {
                mhm7.setVisibility(View.GONE);
            }else {
                mhm7.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm8", "no").equals("yes")) {
                mhm8.setVisibility(View.GONE);
            }else {
                mhm8.setVisibility(View.VISIBLE);
            }

            if ( sh.getString(the_date.getText().toString() + "mhm9", "no").equals("yes")) {
                mhm9.setVisibility(View.GONE);
            }else {
                mhm9.setVisibility(View.VISIBLE);
            }







        }
    };



        bu_mhm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm1ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm1", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm1.setVisibility(View.GONE);

            }

            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm1 = findViewById(R.id.mhm1);
            TextView mhm1ge = findViewById(R.id.mhm1ge);
        });








        Button bu_mhm2 = findViewById(R.id.bu_mhm2);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm2ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm2", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm2.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm2 = findViewById(R.id.mhm2);
            TextView mhm2ge = findViewById(R.id.mhm2ge);
        });






        Button bu_mhm3 = findViewById(R.id.bu_mhm3);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm3ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm3", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm3.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm3 = findViewById(R.id.mhm3);
            TextView mhm3ge = findViewById(R.id.mhm3_ge);
        });























        Button bu_mhm4 = findViewById(R.id.bu_mhm4);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm4ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm4", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm4.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm4 = findViewById(R.id.mhm4);
            TextView mhm4ge = findViewById(R.id.mhm4ge);
        });


















        Button bu_mhm5 = findViewById(R.id.bu_mhm5);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm5ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm5", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm5.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm5 = findViewById(R.id.mhm5);
            TextView mhm5ge = findViewById(R.id.mhm5ge);
        });



















        Button bu_mhm6 = findViewById(R.id.bu_mhm6);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm6ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm6", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm6.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm6 = findViewById(R.id.mhm6);
            TextView mhm6ge = findViewById(R.id.mhm6ge);
        });















        Button bu_mhm7 = findViewById(R.id.bu_mhm7);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm7ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm7", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm7.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm7 = findViewById(R.id.mhm7);
            TextView mhm7ge = findViewById(R.id.mhm7ge);
        });


















        Button bu_mhm8 = findViewById(R.id.bu_mhm8);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm8ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm8", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm8.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm8 = findViewById(R.id.mhm8);
            TextView mhm8ge = findViewById(R.id.mhm8ge);
        });
















        Button bu_mhm9 = findViewById(R.id.bu_mhm9);

        sh = getSharedPreferences("save",Context.MODE_PRIVATE);





        bu_mhm9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int geld_te = Integer.parseInt(geld.getText().toString());
                int geld_va = Integer.parseInt(mhm9ge.getText().toString());
                int re = geld_te + geld_va;

                geld.setText(String.valueOf(re));


                SharedPreferences.Editor myedit=sh.edit();
                myedit.putString(the_date.getText().toString() + "mhm9", "yes".toString());
                myedit.putString("geld", geld.getText().toString());

                myedit.commit();

                mhm9.setVisibility(View.GONE);

            }
            TextView geld = findViewById(R.id.geld);
            LinearLayout mhm9 = findViewById(R.id.mhm9);
            TextView mhm9ge = findViewById(R.id.mhm9ge);
        });

























    }

}
