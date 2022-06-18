package com.example.demo.datasource.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockDataSource = MockBankDataSource()

    @Test
    fun `shoud provide a collection of banks` () {
        // when
        val banks = mockDataSource.retrieveBanks()
        
        // then
        assertThat(banks.size).isGreaterThanOrEqualTo(3)
    }
    
    @Test
    fun `shoud provide some mock data` () {
        // when
        val banks = mockDataSource.retrieveBanks()
        
        // then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }

    }
}
