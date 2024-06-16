package com.ahnabil.cryptocurrencyappyt.presentation.coin_detail

import com.ahnabil.cryptocurrencyappyt.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
