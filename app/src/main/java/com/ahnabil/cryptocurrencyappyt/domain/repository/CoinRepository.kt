package com.ahnabil.cryptocurrencyappyt.domain.repository

import com.ahnabil.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.ahnabil.cryptocurrencyappyt.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}