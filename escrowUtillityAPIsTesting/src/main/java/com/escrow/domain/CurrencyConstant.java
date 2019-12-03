package com.escrow.domain;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CurrencyConstant {

    public static final BigInteger DEFAULT_SYSTEM_UNIT = new BigInteger("100000000");

    public static final int DEFAULT_SYSTEM_UNIT_SCALE = 8;

    public static final BigInteger DEFAULT_FSA_UNIT = new BigInteger("10000000000000000000000000");

    public static final int DEFAULT_FSA_UNIT_SCALE = 25;

    public static final BigInteger DEFAULT_SYSTEM_TO_FSA_UNIT = new BigInteger("100000000000000000");

    public static final String DEFAULT_SYSTEM_DECIMAL_FORMAT = "#.########";

    public static final String DEFAULT_FSA_DECIMAL_FORMAT = "#.#########################";

    public static final String DEFAULT_SYSTEM_FIAT_FORMAT = "#.##";

    public static final String FULL_DECIMAL_FORMAT = "0.00000000";

    public static final String EVENT_TRANSFER_TOKEN_HASH = "0xddf252ad1be2c89b69c2b068fc378daa952ba7f163c4a11628f55a4df523b3ef";

    public static final String BASE_CRYPTO_CURRENCY_CODE = "USDT";

    public enum CRYPTO_CURRENCY {
        COSS("COSS", "COSS"), COS("COS", "COS"),
        ETH("ETH", "Ethereum"), BTC("BTC", "Bitcoin"), USDT("USDT", "Tether"),
        XEM("XEM", "XEM"), TRX("TRX", "TRON"), XLM("XLM", "Stellar"),
        EOS("EOS", "EOS"), XRP("XRP", "Ripple"),LTC("LTC", "Litecoin"),NEO("NEO", "NEO");

        private final String currencyCode;

        private final String name;

        CRYPTO_CURRENCY(String currencyCode, String name) {
            this.currencyCode = currencyCode;
            this.name = name;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public String getName() {
            return name;
        }
    }

    public enum ERC20_TOKEN {
        GTO("GTO", "Gifto", 4, "0xc5bbae50781be1669306b9e001eff57a2957b09d", "0.########", new BigDecimal("100000")),
        DGX("DGX", "Digix Gold Token", 4, "0x4f3afec4e5a3f2a6a1a411def7d7dfe50ee057bf", "0.#########",
                new BigDecimal("1000000000"));

        private final String currencyCode;

        private final String name;

        private final int mapPosition;

        private final String tokenAddress;

        private final String decimalFormat;

        private final BigDecimal unit;

        ERC20_TOKEN(String currencyCode, String name, int mapPosition, String tokenAddress, String decimalFormat,
                    BigDecimal unit) {
            this.currencyCode = currencyCode;
            this.name = name;
            this.mapPosition = mapPosition;
            this.tokenAddress = tokenAddress;
            this.decimalFormat = decimalFormat;
            this.unit = unit;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public String getName() {
            return name;
        }

        public int getMapPosition() {
            return mapPosition;
        }

        public String getTokenAddress() {
            return tokenAddress;
        }

        public String getDecimalFormat() {
            return decimalFormat;
        }

        public BigDecimal getUnit() {
            return unit;
        }
    }

    public enum FIAT_CURRENCY {

        USD("USD", "USD", "#.##", new BigInteger("100"), 1000000000l, 10000000000l);

        private final String currencyCode;

        private final String name;

        private String decimalFormat;

        private BigInteger unit;

        private long minimumOrderAmount;

        private long maximumOrderAmount;

        FIAT_CURRENCY(String currencyCode, String name, String decimalFormat, BigInteger unit, long minimumOrderAmount,
                      long maximumOrderAmount) {
            this.currencyCode = currencyCode;
            this.name = name;
            this.decimalFormat = decimalFormat;
            this.unit = unit;
            this.maximumOrderAmount = minimumOrderAmount;
            this.maximumOrderAmount = maximumOrderAmount;
        }

        public String getCurrencyCode() {
            return currencyCode;
        }

        public String getName() {
            return name;
        }

        public String getDecimalFormat() {
            return decimalFormat;
        }

        public BigInteger getUnit() {
            return unit;
        }

        public long getMinimumOrderAmount() {
            return minimumOrderAmount;
        }

        public long getMaximumOrderAmount() {
            return maximumOrderAmount;
        }
    }

    public enum FIAT_THIRD_PARTY {

        ETANA("ETANA", new String[]{"USD"}), APCOPAY("APCOPAY", new String[]{"EUR", "GBP"});

        private final String name;
        private final Set<String> coins;

        FIAT_THIRD_PARTY(String name, String[] coins) {
            this.name = name;
            this.coins = new HashSet<String>(Arrays.asList(coins));
        }

        public String getName() {
            return name;
        }

        public boolean check(String currencyCode) {
            return this.coins.contains(currencyCode);
        }

        public String[] getCoins() {
            return Arrays.copyOf(this.coins.toArray(), this.coins.size(), String[].class);
        }

    }
}
