package id.co.pegadaian.billing.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;

//@Component
public class Helper {

    public static ObjectMapper objectMapper = new ObjectMapper()
        .enable(SerializationFeature.INDENT_OUTPUT)
        .registerModule(new JavaTimeModule());

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");

//    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//    DateFormat formatterToDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//    SimpleDateFormat FormatDDMONYYYY = new SimpleDateFormat("dd MMM yyyy");

    public static String json(Object o ) {
        try {
            return objectMapper.writeValueAsString(o);
        } catch (Exception e) {
            return "";
        }
    }

    public static String getNow() {
        return sdf.format(new Date());
    }

    public static String expiredDate(LocalDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    public static HashMap<String, Object> jsonToHashMap(final String json) {

        HashMap<String, Object> map = new HashMap<String, Object>();

        try {
            //Convert Map to JSON
            map = objectMapper.readValue(json, new TypeReference<HashMap<String, Object>>() {
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return map;
    }

//    public static int stringToInt(String s, int value) {
//        try {
//            return Integer.parseInt(s);
//        } catch (Exception e) {
//            return value;
//        }
//    }

}
