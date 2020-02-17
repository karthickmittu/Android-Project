package com.example.foster.data;

import com.example.caller.R;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {





        public static ArrayList<Data> getTab1Data() {
            ArrayList<Data> list = new ArrayList<>();
            Data data;

            data = new Data();
            data.setLogo(R.drawable.student);
            data.setTitle("Data Scientist");
            data.setSubTitle1("Enrollment in progress");
            data.setSubTitle2("SubTitle2");
            list.add(data);


            data = new Data();
            data.setLogo(R.drawable.elearning);
            data.setTitle("Full stack");
            data.setSubTitle1("Enrollment in progress");
            data.setSubTitle2("SubTitle2");
            list.add(data);


            data = new Data();
            data.setLogo(R.drawable.brain);
            data.setTitle("WebApp");
            data.setSubTitle1("Enrollment in progress");
            data.setSubTitle2("SubTitle3");
            list.add(data);


            return list;
        }

}
