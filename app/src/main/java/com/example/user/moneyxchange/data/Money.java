package com.example.user.moneyxchange.data;

import ckm.simple.sql_provider.annotation.SimpleSQLColumn;
import ckm.simple.sql_provider.annotation.SimpleSQLTable;

/**
 * Created by User on 6/11/2016.
 */



@SimpleSQLTable(table = "money", provider = "MoneyProvider")
    public class Money {

       @SimpleSQLColumn("col_Name")
        public String Name;

    @SimpleSQLColumn("col_email_address")
    public int email_address;

    @SimpleSQLColumn("col_phone")
    public int phone;


        @SimpleSQLColumn("col_amt_take")
        public int amt_take;

        @SimpleSQLColumn("col_amt_give")
        public int amt_give;



   /* @SimpleSQLTable(table = "group_table", provider = "MoneyProvider")
    @SimpleSQLColumn("col_str")
    public String group_name;

    @SimpleSQLColumn("col_Varchar(320)")
    public int group_email_address;

    @SimpleSQLColumn("col_long")
    public int group_phone;


    @SimpleSQLColumn("col_long")
    public int group_take;

    @SimpleSQLColumn("col_long")
    public int group_give;

*/

    }

