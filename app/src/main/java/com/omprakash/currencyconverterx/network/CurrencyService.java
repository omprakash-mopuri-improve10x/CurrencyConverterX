package com.omprakash.currencyconverterx.network;

import com.omprakash.currencyconverterx.model.Currency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CurrencyService {

    @GET("v1/latest?apikey=QQ2OAK8kZEdVdvuM9SGFCnr1v56VbzMso5jsba9U")
    Call<Currency> fetchCurrencies();
}
