package com.omprakash.currencyconverterx;

import com.omprakash.currencyconverterx.Currency;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CurrencyService {

    @GET("v1/latest?apikey=QQ2OAK8kZEdVdvuM9SGFCnr1v56VbzMso5jsba9U")
    Call<Currency> fetchCurrencies();
}
