package com.ahnabil.cryptocurrencyappyt.presentation.coin_list

import com.ahnabil.cryptocurrencyappyt.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
