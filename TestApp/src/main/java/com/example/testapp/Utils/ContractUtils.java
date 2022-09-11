package com.example.testapp.Utils;

import com.example.testapp.Model.Contract;
import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ContractUtils {
    private final static Gson gson = new Gson();
    private final static SimpleDateFormat set =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static Contract[] JsonToContract(String dto) {
        return gson.fromJson(dto, Contract[].class);
    }

    public static Contract DateFormat(Contract c,Date date){
        c.setDateFormatCreate(set.format(c.getDateCreate()));
        c.setDateFormatUpdate(set.format(c.getDateUpdate()));
        long duration = date.getTime() - c.getDateUpdate().getTime();
        int res = Integer.parseInt(String.valueOf(TimeUnit.MILLISECONDS.toDays(duration)));
        if(res >= 60){
            c.setActive(false);
        } else {
            c.setActive(true);
        }
        return c;
    }
}
