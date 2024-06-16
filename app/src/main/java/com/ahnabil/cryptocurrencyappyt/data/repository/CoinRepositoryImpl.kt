package com.ahnabil.cryptocurrencyappyt.data.repository

import com.ahnabil.cryptocurrencyappyt.data.remote.CoinPaprikaApi
import com.ahnabil.cryptocurrencyappyt.data.remote.dto.CoinDetailDto
import com.ahnabil.cryptocurrencyappyt.data.remote.dto.CoinDto
import com.ahnabil.cryptocurrencyappyt.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}