package com.example.sonu.multiscreen;

/**
 * Created by sonu on 3/12/17.
 */

// class created for initialising Arraylist in MainActivity
public class Table {

    private String msno;
    private String mname;
    private String mitem;
    private String mprice;
    private String mlocation;

    public Table(String sno,String name,String item,String price,String location)
    {
        msno = sno;
        mname = name;
        mitem = item;
        mprice = price;
        mlocation = location;
    }

    public String getsno(){ return msno; }
    public String getname(){ return mname; }
    public String getitem(){ return mitem; }
    public String getprice(){ return mprice; }
    public String getlocation(){ return mlocation; }

}
