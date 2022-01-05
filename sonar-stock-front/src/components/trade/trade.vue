<style lang="stylus" rel="stylesheet/stylus">
@import "~common/stylus/trade"
</style>
<style>
.el-aside {
  background-color: rgb(12, 12, 20);
  color: #333;
  margin-left: 2px;
  margin-top: 63px;
}
.el-main {
  background-color: rgb(12, 12, 20);
  color: #333;
  margin-top: 63px;
  height: 90vh;
}
body > .el-container {
  margin-top: 600px;
}
.dragger {
  border: 1px solid rgb(34, 33, 33);
}
.vue-grid-item.vue-grid-placeholder {
  background: rgb(101, 139, 182) !important;
  opacity: 0.2;
  transition-duration: 100ms;
  z-index: 2;
  -webkit-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  -o-user-select: none;
  user-select: none;
}
.vue-grid-item > .vue-resizable-handle {
  position: absolute !important;
  width: 20px !important;
  height: 20px !important;
  bottom: 0 !important;
  right: 0 !important;
  background: url("../../assets/trade/resize-handle.svg") !important;
  background-position: 100% 100% !important;
  padding: 0 3px 3px 0 !important;
  background-repeat: no-repeat !important;
  background-origin: content-box !important;
  -webkit-box-sizing: border-box !important;
  box-sizing: border-box !important;
  cursor: se-resize !important;
}
title {
  width: 100%;
  height: 32px;
  line-height: 32px;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  background: rgba(243, 239, 255, 0.12);
  color: rgb(243, 239, 255);
  border-bottom: 1px solid rgb(12, 12, 20);
}
.sonar-stock-grid-draggable-handle {
  cursor: grab;
  padding: 0px 16px;
  box-sizing: border-box;
}
.grid-border-bottom {
  border-bottom: 1px solid rgb(12, 12, 20);
}
.grid-border-top {
  border-top: 1px solid rgb(12, 12, 20);
}
.grid-row {
  width: 100%;
  height: 32px;
  line-height: 32px;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  background: rgba(243, 239, 255, 0.1);
  padding: 0px 16px;
}
.grid-row-content {
  width: 100%;
  height: 28px;
  line-height: 28px;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  background: rgba(243, 239, 255, 0.1);
  padding: 0px 16px;
}
.grid-content {
  text-align: center;
  color: rgba(243, 239, 255, 0.45);
}
.progressbar-wrapper {
  position: relative;
  z-index: 1;
  line-height: 20px;
}
.progressbar {
  position: absolute;
  top: 0;
  bottom: 0;
  right: 0;
  z-index: -1;
}
.sell-bg {
  background-color: rgba(31, 192, 117, 0.5);
}
.buy-bg {
  background-color: rgba(199, 32, 32, 0.5);
}
.grid-head-stock-name {
  width: 120px;
  height: 30px;
  line-height: 30px;
  text-align: center;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  background: rgba(243, 239, 255, 0.02);
  color: rgb(243, 239, 255);
  border-bottom: 1px solid rgb(12, 12, 20);
  font-size: 26px;
}
.grid-head-stock-code {
  font-size: 10px;
  width: 120px;
  height: 30px;
  line-height: 20px;
  text-align: center;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  background: rgba(243, 239, 255, 0.02);
  color: rgb(243, 239, 255);
  border-bottom: 1px solid rgb(12, 12, 20);
}
.grid-head-stock-data {
  width: 100%;
  height: 30px;
  font-size: 15px;
  font-weight: 800;
  line-height: 30px;
  text-align: center;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  background: rgba(243, 239, 255, 0.02);
  color: rgb(243, 239, 255);
  border-bottom: 1px solid rgb(12, 12, 20);
  padding: 0px 5px;
}
.grid-head-stock-title {
  width: 100%;
  height: 30px;
  font-size: 16px;
  line-height: 30px;
  text-align: center;
  display: inline-flex;
  -webkit-box-align: center;
  align-items: center;
  background: rgba(243, 239, 255, 0.02);
  color: rgba(243, 239, 255, 0.45);
  border-bottom: 1px solid rgb(12, 12, 20);
  padding: 0px 5px;
}
.grid-stock-title-color {
  color: rgba(243, 239, 255, 0.45);
}
.grid-head-info {
  height: 100%;
  width: 800px;
}
.sonar-place-order {
  width: 330px;
}
.sonar-place-order .el-radio-button__inner {
  width: 140px;
  background: rgba(243, 239, 255, 0.1);
  border: none;
}
.sonar-place-order .sonar-place-security {
  background: rgba(243, 239, 255, 0.1);
  border: none;
  border-radius: 4px 4px 4px 4px;
  margin-top: 5px;
  width: 280px;
  height: 30px;
  font-size: 12px;
  font-weight: 600;
  line-height: 30px;
  color: rgb(243, 239, 255);
}

.sonar-place-order .el-input__inner,
.el-input-number__decrease,
.el-input-number__increase {
  background: rgba(243, 239, 255, 0.1);
  border: none;
  color: rgb(243, 239, 255);
  font-weight: 700;
}
.el-radio-button:first-child .el-radio-button__inner {
  border-left: none;
  border-radius: 4px 0 0 4px;
}
.sonar-stock-button {
  background: rgba(243, 239, 255, 0.1);
  border: 1px solid rgba(243, 239, 255, 0.12);
  color: rgb(243, 239, 255);
}
.sonar-stock-button:hover {
  background: rgba(243, 239, 255, 0.2);
  border: 1px solid rgba(243, 239, 255, 0.2);
}
</style>
<template>
  <div class="trading-view exchange" v-wechat-title="$t('m.navheader.trade')">
    <NavHeader activeTab="2" class="trading-header" ref="navHeader"></NavHeader>
    <el-container>
      <el-main>
        <grid-layout
          :layout.sync="layout"
          :col-num="12"
          :row-height="26"
          :is-draggable="draggable"
          :is-resizable="resizable"
          :responsive="responsive"
        >
          <grid-item
            :x="layout[3].x"
            :y="layout[3].y"
            :w="layout[3].w"
            :h="layout[3].h"
            :i="layout[3].i"
            class="dragger"
          >
            <div style="color: rgb(243, 239, 255)">
              K-Line
              {{ tradesData }}
            </div>
          </grid-item>
          <grid-item
            :x="layout[0].x"
            :y="layout[0].y"
            :w="layout[0].w"
            :h="layout[0].h"
            :i="layout[0].i"
            class="dragger"
          >
            <el-row class="grid-head-info">
              <el-col :span="5">
                <el-row class="grid-head-stock-name">
                  {{ depthsData.name }}
                </el-row>
                <el-row class="grid-head-stock-code">
                  {{ depthsData.security.toUpperCase() }}
                </el-row>
              </el-col>
              <el-col :span="4">
                <el-row
                  class="grid-head-stock-data"
                  :style="{
                    color:
                      depthsData.current >= depthsData.close ? 'red' : 'green',
                  }"
                >
                  {{ depthsData.current }}
                </el-row>
                <el-row
                  class="grid-head-stock-data"
                  :style="{
                    color:
                      depthsData.current >= depthsData.close ? 'red' : 'green',
                  }"
                >
                  <p>
                    {{ (depthsData.current - depthsData.close).toFixed(2) }}
                    {{
                      (
                        ((depthsData.current - depthsData.close) * 100) /
                        depthsData.close
                      ).toFixed(2) + "%"
                    }}
                  </p>
                </el-row>
              </el-col>
              <el-col :span="2">
                <el-row class="grid-head-stock-title">
                  <p>High</p>
                </el-row>
                <el-row
                  class="grid-head-stock-data"
                  :style="{
                    color:
                      depthsData.high >= depthsData.close ? 'red' : 'green',
                  }"
                >
                  <p>{{ depthsData.high }}</p>
                </el-row>
              </el-col>
              <el-col :span="2">
                <el-row class="grid-head-stock-title">
                  <p>Low</p>
                </el-row>
                <el-row
                  class="grid-head-stock-data"
                  :style="{
                    color: depthsData.low >= depthsData.close ? 'red' : 'green',
                  }"
                >
                  <p>{{ depthsData.low }}</p>
                </el-row>
              </el-col>
              <el-col :span="2">
                <el-row class="grid-head-stock-title">
                  <p>Open</p>
                </el-row>
                <el-row
                  class="grid-head-stock-data"
                  :style="{
                    color:
                      depthsData.open >= depthsData.close ? 'red' : 'green',
                  }"
                >
                  <p>{{ depthsData.open }}</p>
                </el-row>
              </el-col>
              <el-col :span="2">
                <el-row class="grid-head-stock-title">
                  <p>Money</p>
                </el-row>
                <el-row class="grid-head-stock-data">
                  <p>{{ prettierMoney(depthsData.money) }}</p>
                </el-row>
              </el-col>
              <el-col :span="2">
                <el-row class="grid-head-stock-title">
                  <p>Volume</p>
                </el-row>
                <el-row class="grid-head-stock-data">
                  <p>{{ Math.round(depthsData.volume / 100) }}</p>
                </el-row>
              </el-col>
              <el-col :span="3">
                <el-row class="grid-head-stock-title">
                  <p>Date</p>
                </el-row>
                <el-row class="grid-head-stock-data">
                  <p>{{ depthsData.date }}</p>
                </el-row>
              </el-col>
              <el-col :span="1">
                <el-row class="grid-head-stock-title">
                  <p>Time</p>
                </el-row>
                <el-row class="grid-head-stock-data">
                  <p>{{ depthsData.time }}</p>
                </el-row>
              </el-col>
            </el-row>
          </grid-item>
          <grid-item
            :x="layout[1].x"
            :y="layout[1].y"
            :w="layout[1].w"
            :h="layout[1].h"
            :i="layout[1].i"
            class="dragger"
          >
            <title class="sonar-stock-grid-draggable-handle">
              <p>Order Book</p>
            </title>
            <el-row class="grid-row grid-border-bottom">
              <el-col :span="8"><div class="grid-content">五档</div></el-col>
              <el-col :span="8"><div class="grid-content">价格</div></el-col>
              <el-col :span="8"><div class="grid-content">量</div></el-col>
            </el-row>
            <el-row class="grid-border-bottom">
              <el-row class="grid-row-content" v-for="(i, j) in 5" :key="i">
                <el-col :span="8">
                  <div class="grid-content">卖{{ 6 - i }}</div>
                </el-col>
                <el-col :span="8">
                  <div
                    class="grid-content"
                    :style="getOrderBookColor('ENTRY_SELL_' + (6 - i))"
                  >
                    {{
                      depthsData.stockEntriesMap
                        ? depthsData.stockEntriesMap["ENTRY_SELL_" + (6 - i)]
                            .value
                        : "--"
                    }}
                  </div>
                </el-col>
                <el-col :span="8">
                  <div class="grid-content">
                    <div class="progressbar-wrapper">
                      {{
                        depthsData.stockEntriesMap
                          ? Math.round(
                              depthsData.stockEntriesMap[
                                "ENTRY_SELL_" + (6 - i)
                              ].size / 100
                            )
                          : "--"
                      }}
                      <div
                        class="progressbar sell-bg"
                        :style="
                          getOrderBookItemPercent('ENTRY_SELL_' + (6 - i))
                        "
                      ></div>
                    </div>
                  </div>
                </el-col>
              </el-row>
            </el-row>
            <div
              style="height: 5px; width: 100%; background: green; border: none"
            >
              <div
                style="height: inherit;background:red;position:absolute;top:0,left:0;border:none"
                :style="getOrderBookPercent()"
              ></div>
            </div>
            <el-row class="grid-border-top">
              <el-row class="grid-row-content" v-for="(i, j) in 5" :key="i">
                <el-col :span="8">
                  <div class="grid-content">买{{ i }}</div>
                </el-col>
                <el-col :span="8">
                  <div
                    class="grid-content"
                    :style="getOrderBookColor('ENTRY_BUY_' + i)"
                  >
                    {{
                      depthsData.stockEntriesMap
                        ? depthsData.stockEntriesMap["ENTRY_BUY_" + i].value
                        : "--"
                    }}
                  </div>
                </el-col>
                <el-col :span="8">
                  <div class="grid-content">
                    <div class="progressbar-wrapper">
                      {{
                        depthsData.stockEntriesMap
                          ? Math.round(
                              depthsData.stockEntriesMap["ENTRY_BUY_" + i]
                                .size / 100
                            )
                          : "--"
                      }}
                      <div
                        class="progressbar buy-bg"
                        :style="getOrderBookItemPercent('ENTRY_BUY_' + i)"
                      ></div>
                    </div>
                  </div>
                </el-col>
              </el-row>
            </el-row>
          </grid-item>
          <grid-item
            :x="layout[2].x"
            :y="layout[2].y"
            :w="layout[2].w"
            :h="layout[2].h"
            :i="layout[2].i"
            class="dragger"
          >
            <title class="sonar-stock-grid-draggable-handle">
              <p>Order Book</p>
            </title>
            <el-row class="grid-row grid-border-bottom">
              <el-col :span="8"><div class="grid-content">五档</div></el-col>
              <el-col :span="8"><div class="grid-content">价格</div></el-col>
              <el-col :span="8"><div class="grid-content">量</div></el-col>
            </el-row>
            <el-row class="grid-border-bottom">
              <el-row class="grid-row-content" v-for="(i, j) in 5" :key="i">
                <el-col :span="8">
                  <div class="grid-content">卖{{ 6 - i }}</div>
                </el-col>
                <el-col :span="8">
                  <div
                    class="grid-content"
                    :style="getOrderBookColor('ENTRY_SELL_' + (6 - i))"
                  >
                    {{
                      depthsData.stockEntriesMap
                        ? depthsData.stockEntriesMap["ENTRY_SELL_" + (6 - i)]
                            .value
                        : "--"
                    }}
                  </div>
                </el-col>
                <el-col :span="8">
                  <div class="grid-content">
                    <div class="progressbar-wrapper">
                      {{
                        depthsData.stockEntriesMap
                          ? Math.round(
                              depthsData.stockEntriesMap[
                                "ENTRY_SELL_" + (6 - i)
                              ].size / 100
                            )
                          : "--"
                      }}
                      <div
                        class="progressbar sell-bg"
                        :style="
                          getOrderBookItemPercent('ENTRY_SELL_' + (6 - i))
                        "
                      ></div>
                    </div>
                  </div>
                </el-col>
              </el-row> </el-row
          ></grid-item>
        </grid-layout>
      </el-main>
      <el-aside class="sonar-place-order">
        <title
          class="sonar-stock-grid-draggable-handle"
          style="margin-top: 5px"
        >
          <p>Place Order</p>
        </title>
        <div style="padding: 0px 10px">
          <el-radio-group
            style="width: 330px; margin-top: 5px"
            size="small"
            v-model="placeOption.type"
          >
            <el-radio-button label="Buy"></el-radio-button>
            <el-radio-button label="Sell"></el-radio-button>
          </el-radio-group>
          <el-row class="sonar-place-security">
            <el-col :span="12" style="text-align: left; padding-left: 20px">
              {{ depthsData.security.toUpperCase() }}
            </el-col>
            <el-col :span="12" style="text-align: right; padding-right: 20px">
              {{ depthsData.name }}
            </el-col>
          </el-row>
          <el-input-number
            size="small"
            style="margin-top: 5px; width: 280px"
            v-model="placeOption.value"
            placeholder="Price"
            :precision="2"
            :step="0.01"
            :max="10"
          ></el-input-number>
          <el-input-number
            size="small"
            style="margin-top: 5px; width: 280px"
            v-model="placeOption.volume"
            :step="100"
          ></el-input-number>
          <p
            class="grid-stock-title-color"
            style="font-size: 10px; margin-top: 5px"
          >
            可买
            <span style="color: orange">100</span>
            股
          </p>
          <el-row
            style="margin-top: 5px; width: 290px"
            type="flex"
            justify="space-between"
          >
            <el-col :span="6">
              <el-button size="mini" class="sonar-stock-button">
                全仓
              </el-button>
            </el-col>
            <el-col :span="6">
              <el-button size="mini" class="sonar-stock-button">
                半仓
              </el-button>
            </el-col>
            <el-col :span="6">
              <el-button size="mini" class="sonar-stock-button">
                1/3仓
              </el-button>
            </el-col>
            <el-col :span="6">
              <el-button size="mini" class="sonar-stock-button">
                1/4仓
              </el-button>
            </el-col>
          </el-row>
          <el-row>
            <el-button
              size="mini"
              style="margin-top: 5px; width: 280px"
              class="sonar-stock-button"
            >
              Buy
            </el-button>
          </el-row>
        </div>
      </el-aside>
    </el-container>
  </div>
</template>

<script>
import "swiper/dist/css/swiper.css";
import VueGridLayout from "vue-grid-layout";
import NavHeader from "components/nav-header/nav-header";
import { util } from "common/js/util";
import { tradeApi } from "api/trade";
import { homeApi } from "api/home";
import { OK } from "api/config";
import { stampToDate } from "common/js/date";
import { mapGetters } from "vuex";

export default {
  components: {
    NavHeader,
    GridLayout: VueGridLayout.GridLayout,
    GridItem: VueGridLayout.GridItem,
  },
  computed: {
    ...mapGetters(["token", "lang"]),
  },
  data() {
    return {
      //grid-layout
      placeOption: {
        type: "Buy",
        value: null,
        volume: null,
      },
      layout: [
        { x: 0, y: 0, w: 12, h: 2, i: "0" },
        { x: 12, y: 0, w: 2, h: 10, i: "1" },
        { x: 12, y: 10, w: 2, h: 10, i: "2" },
        { x: 0, y: 0, w: 8, h: 18, i: "3" },
        // { x: 12, y: 0, w: 4, h: 9, i: "3" },
        // { x: 0, y: 1, w: 12, h: 2, i: "4" },
      ],
      draggable: true,
      resizable: true,
      responsive: true,
      index: 0,
      eventLog: [],
      currentMarket: { symbol: "sz000068", title: "华控赛格" }, //当前市场
      timeStp: 0,
      //选项卡
      turnoverTbData: [], //成交记录
      entrustTbData: [], //委托定单
      //深度数据
      depthsData: {},
      domWidth: 0,
      asksDepth: 0,
      bidsDepth: 0,
      //交易信息
      tradesData: [],
      isUnfold: true,
      //交易面板
      userAccount: {
        buyAmount: 0,
        buyFreeze: 0,
        buyRate: 0,
        buyUnit: "",
        price: 0,
        sellAmount: 0,
        sellFreeze: 0,
        sellRate: 0,
        sellUnit: "",
        accountName: "",
        exchangeName: "",
      }, //用户关联
      buyRate: 0,
      sellRate: 0,
      currentBuyItem: {
        price: "",
        amount: "",
        disabled: true,
        rateCount: 0,
        canBuyAmount: "",
      }, //当前买的信息(价格／数量／面板禁用／费率计算／可买入量)
      currentSellItem: {
        price: "",
        amount: "",
        disabled: true,
        rateCount: 0,
        canSellAmount: "",
      }, //当前卖的信息
      sliderRate: { buy: 0, sell: 0, rateBuyAmount: 0, rateSellAmount: 0 }, //滑块比率及相关
      marketList: [], //市场列表
      switchMarketListDropdown: false,
      marketMapById: {},
      marketSearch: "",
      chooseMergeDepth: "DEFAULT",
      activeName: "",
      activeIndex: 0,
      currentSubscribePath: "",
      depthsSubscribe: null,
      tradesSubscribe: null,
      currentExchangeItem: { buyTurnover: 0, sellTurnover: 0 },
      preciseNum: 6,
      turnoverPageQuery: {
        page: 1,
        size: 100,
        totalRecords: 0,
      },
      entrustPageQuery: {
        page: 1,
        size: 100,
        totalRecords: 0,
      },
      userFavorites: [],
      symbol: "", //当前市场名
    };
  },
  filters: {
    formatDate: function (value, type) {
      let date = new Date(value);
      return stampToDate(date, type);
    },
  },
  created() {
    this.bus.$on("change:language", (lang) => {
      let kline = document.getElementById("kline-win");
      lang = lang.toLowerCase();
      if (kline) {
        let cw = kline.contentWindow;
        cw.chart_switch_language && cw.chart_switch_language(lang);
      }
    });
  },
  mounted() {
    this.clearTimer();
    this._getMarkList();
    this.symbol = this.$route.query.symbol;
    this._getDepth();
    this.timer = window.setInterval(this.flashProcess, 3000);
  },
  destroyed() {
    this.unsubscribeDepths();
    this.unsubscribeTrades();
    this.unsubscribeMarkets(this.activeName);
    this.unsubscribeEntrust();
    this.unsubscribeTurnover();
    this.unsubscribeAllMarkets();
    this.clearTimer();
  },
  methods: {
    flashProcess() {
      this._getDepth();
      this._getTrades();
    },
    clearTimer: function () {
      if (this.timer) {
        window.clearInterval(this.timer);
      }
    },
    prettierMoney: function (money) {
      if (money < 10000) {
        return money;
      } else if (money >= 10000 && money < 100000000) {
        return (money / 10000).toFixed(2) + "万";
      } else {
        return (money / 100000000).toFixed(2) + "亿";
      }
    },
    moveEvent: function (i, newX, newY) {
      const msg = "MOVE i=" + i + ", X=" + newX + ", Y=" + newY;
      this.eventLog.push(msg);
      console.log(msg);
    },
    movedEvent: function (i, newX, newY) {
      const msg = "MOVED i=" + i + ", X=" + newX + ", Y=" + newY;
      this.eventLog.push(msg);
      console.log(msg);
    },
    resizeEvent: function (i, newH, newW, newHPx, newWPx) {
      const msg =
        "RESIZE i=" +
        i +
        ", H=" +
        newH +
        ", W=" +
        newW +
        ", H(px)=" +
        newHPx +
        ", W(px)=" +
        newWPx;
      this.eventLog.push(msg);
      console.log(msg);
    },
    resizedEvent: function (i, newX, newY, newHPx, newWPx) {
      const msg =
        "RESIZED i=" +
        i +
        ", X=" +
        newX +
        ", Y=" +
        newY +
        ", H(px)=" +
        newHPx +
        ", W(px)=" +
        newWPx;
      this.eventLog.push(msg);
      console.log(msg);
    },
    containerResizedEvent: function (i, newH, newW, newHPx, newWPx) {
      const msg =
        "CONTAINER RESIZED i=" +
        i +
        ", H=" +
        newH +
        ", W=" +
        newW +
        ", H(px)=" +
        newHPx +
        ", W(px)=" +
        newWPx;
      this.eventLog.push(msg);
      console.log(msg);
    },
    layoutCreatedEvent: function (newLayout) {
      this.eventLog.push("Created layout");
      console.log("Created layout: ", newLayout);
    },
    layoutBeforeMountEvent: function (newLayout) {
      this.eventLog.push("beforeMount layout");
      console.log("beforeMount layout: ", newLayout);
    },
    layoutMountedEvent: function (newLayout) {
      this.eventLog.push("Mounted layout");
      console.log("Mounted layout: ", newLayout);
    },
    layoutReadyEvent: function (newLayout) {
      this.eventLog.push("Ready layout");
      console.log("Ready layout: ", newLayout);
    },
    layoutUpdatedEvent: function (newLayout) {
      this.eventLog.push("Updated layout");
      console.log("Updated layout: ", newLayout);
    },
    async _getDepth() {
      let symbol = this.currentMarket.symbol.toLowerCase();
      let mergeDepth = this.chooseMergeDepth;
      let res = await tradeApi.getDepth(symbol, mergeDepth);
      this.depthsData = res.data;
      console.log(this.depthsData);
      this.processDepthData();
    },
    async _getTrades() {
      let symbol = this.currentMarket.symbol;
      let res = await tradeApi.getTrades(symbol);
      this.tradesData = res.data;
    },
    scientificToNumber(value) {
      return util.scientificToNumber(value);
    },
    // maxNum 最大整数 scale 保留几位小数
    filterValue(value, event, maxNum = 8, scale = 2) {
      if (typeof value === "number") {
        value = value.toString();
      }
      if (event.keyCode === 16 || event.keyCode === 32) {
        value = value.replace(/[^\d+|\.{0,1}]/g, "");
      }
      if (/^\d+(?=\.{0,1}\d+$|\.{0,1}$|$)/.test(value)) {
        value = value.replace(/^0+/, "0");
      } else {
        value = value.replace(/[^\d+|\.{0,1}]/g, "");
      }
      // 如果存在小数点
      if (value.indexOf(".") !== -1) {
        let arr = value.split(".");
        if (arr.length > 2) {
          let lastStr = value.charAt(value.length - 1);
          if (lastStr === ".") {
            value = value.slice(0, value.length - 1);
          }
        } else {
          let tempArr = new Array(2);
          if (arr[0]) {
            let len = arr[0].length;
            if (len > maxNum) {
              tempArr[0] = arr[0].slice(0, 8);
            } else {
              tempArr[0] = arr[0];
            }
          }
          if (arr[1]) {
            let len = arr[1].length; // 小数位数
            if (len > scale) {
              tempArr[1] = arr[1].slice(0, scale);
            } else {
              tempArr[1] = arr[1];
            }
          }
          value = tempArr.join(".");
        }
      } else {
        let len = value.length;
        if (len > maxNum) {
          value = value.slice(0, maxNum);
        }
      }
      return value;
    },
    checkInputPrice(type, event) {
      let value = event.srcElement
        ? event.srcElement.value
        : event.target.value;
      let { priceScale } = this.currentMarket;
      value = this.filterValue(value, event, 8, priceScale);
      if (type === "buy") {
        this.computedBuyAmount(value);
      } else if (type === "sell") {
        this.computedSellAmount(value);
      }
    },
    computedBuyAmount(value) {
      let { priceScale, buyFeeRate } = this.currentMarket;
      this.currentBuyItem.price = value;
      if (value > 0) {
        this.currentBuyItem.canBuyAmount = (
          this.userAccount.buyAmount /
          (1 + buyFeeRate) /
          value
        ).toFixed(priceScale);
        this.sliderRate.buy =
          (this.currentBuyItem.amount / this.currentBuyItem.canBuyAmount) * 100;
        this.sliderRate.rateBuyAmount = (
          this.currentBuyItem.amount * value
        ).toFixed(priceScale);
      } else {
        this.currentBuyItem.canBuyAmount = 0;
        this.sliderRate.buy = 0;
      }
    },
    computedSellAmount(value) {
      let { sellAmount } = this.userAccount;
      let { priceScale, sellFeeRate } = this.currentMarket;
      this.currentSellItem.price = value;
      let totalAmount = sellAmount * value * (1 + sellFeeRate);
      this.currentSellItem.canSellAmount = totalAmount.toFixed(priceScale);
      this.sliderRate.rateSellAmount = (
        this.currentSellItem.amount * value
      ).toFixed(priceScale);
    },
    // 延迟2s刷新接口
    refreshRecord() {
      console.log("刷新4接口");
      //刷新自己的交易记录和委托记录 socket会推送消息过来

      // this._serverGetTurnoverOrderList();
      // this._serverGetEntrustOrderList();

      console.log("当前Symbol", this.currentMarket.symbol);
      this._getUserAccount(this.currentMarket.symbol);
    },
    async handleClick(tab) {
      if (tab.label === "自选") {
        let item = await this.getFavoriteData();
        this.marketList[tab.index].markets = item[0].markets;
        this.subscribeAllMarkets();
      } else {
        this.activeIndex = parseInt(tab.index);
        this.subscribeMarkets(this.activeName);
        this.unsubscribeAllMarkets();
      }
    },
    async getFavoriteData() {
      this.userFavorites = [];
      let item = await tradeApi.serverFavorite(this.token);
      item.data[0].markets.map((v) => {
        this.userFavorites.push(v.symbol.toLowerCase());
      });
      return item.data;
    },
    isNumber(val) {
      var regPos = /^\d+(\.\d+)?$/; //非负浮点数
      var regNeg =
        /^(-(([0-9]+\.[0-9]*[1-9][0-9]*)|([0-9]*[1-9][0-9]*\.[0-9]+)|([0-9]*[1-9][0-9]*)))$/; //负浮点数
      if (regPos.test(val) || regNeg.test(val)) {
        return true;
      } else {
        return false;
      }
    },

    //市场列表下拉框
    formatPrice(currentPrice, currentPriceCNY) {
      currentPrice = Number(currentPrice);
      currentPriceCNY = Number(currentPriceCNY);
      var p1 = currentPrice.toFixed(4);
      var p2 = "";

      if (currentPriceCNY != null) {
        p2 = currentPriceCNY.toFixed(6);
      }
      //        return "$ " + p1 + "/ <span>￥" + p2 + "</span>";
      return p1;
    },
    formatRange(currentPrice, closePrice) {
      return (
        "<i>" +
        Number((((currentPrice - closePrice) / closePrice) * 100).toFixed(2)) +
        "%</i>"
      );
    },
    selectorMarketlistMsover: function () {
      this.switchMarketListDropdown = true;
    },
    selectorMarketlistMsout: function () {
      this.switchMarketListDropdown = false;
    },
    //      marketListRowClick      : function (row) {
    //        this.marketChange(row.id, row.title)
    //      },
    marketChange(currentMarket) {
      this.currentMarket = currentMarket;
      console.log("marketChange", currentMarket);
      this.switchMarketListDropdown = false;
      this.timeStp = new Date().getTime();
      //依赖marketId
      this._getUserAccount(this.currentMarket.symbol);
      this._serverGetTurnoverOrderList();
      this._serverGetEntrustOrderList();

      this.subscribeEntrust();
      this.subscribeTurnover();

      this._getDepth();
      this._getTrades();

      this.subscribeDepths();
      this.subscribeTrades();

      // this.subscribeEntrust();

      let kline = document.getElementById("kline-win");
      let lang = this.lang.toLowerCase();
      kline.src = `../static/new_kline/trade.html?v=${this.timeStp}&symbol=${this.currentMarket.symbol}`;
      if (kline.attachEvent) {
        kline.attachEvent("onload", () => {
          kline.contentWindow.chart_switch_language(lang);
        });
      } else {
        kline.onload = () => {
          kline.contentWindow.chart_switch_language(lang);
        };
      }

      console.log("---------------------费率", this.buyRate, this.sellRate);

      this.currentSellItem.price = "";
      this.currentSellItem.amount = "";
      this.currentBuyItem.price = "";
      this.currentBuyItem.amount = "";
      this.currentBuyItem.canBuyAmount = "";
      this.currentSellItem.canSellAmount = "";
      this.sliderRate.rateBuyAmount = 0;
      this.sliderRate.rateSellAmount = 0;
      this.sliderRate.buy = 0;
      this.sliderRate.sell = 0;
    },

    depthAsksClick(price, amount) {
      this.currentBuyItem.amount = amount;
      this.currentSellItem.amount = amount;
      this.computedBuyAmount(price);
      this.computedSellAmount(price);
    },
    depthBidsClick(price, amount) {
      this.currentBuyItem.amount = amount;
      this.currentSellItem.amount = amount;
      this.computedBuyAmount(price);
      this.computedSellAmount(price);
    },
    // 显示小数位，不做四舍五入
    limitDecimal(value, numScale) {
      value = value.toString();
      let numArr = [];
      if (value.indexOf(".") !== -1) {
        let arr = value.split(".");
        numArr.push(arr[0]);
        if (arr[1]) {
          let len = arr[1].length;
          if (len > numScale) {
            numArr.push(arr[1].slice(0, numScale));
          } else {
            numArr.push(arr[1]);
          }
        }
      } else {
        numArr.push(value);
      }
      return numArr.join(".");
    },
    //交易滑块事件
    //新滑块事件
    sliderBuyChange(val) {
      let { priceScale, numScale, buyFeeRate } = this.currentMarket;
      this.sliderRate.buy = val;
      let rateBuyAmount = this.currentBuyItem.canBuyAmount * (val / 100) || 0;
      this.currentBuyItem.amount = this.limitDecimal(rateBuyAmount, numScale);
      this.sliderRate.rateBuyAmount = (
        this.currentBuyItem.price * this.currentBuyItem.amount
      ).toFixed(priceScale);
      this.currentBuyItem.rateCount = (
        this.sliderRate.rateBuyAmount * buyFeeRate
      ).toFixed(priceScale); //费率计算
      return val;
    },
    sliderSellChange(val) {
      let { priceScale, numScale } = this.currentMarket;
      this.sliderRate.sell = val;
      let amount = this.limitDecimal(
        this.userAccount.sellAmount * (val / 100),
        numScale
      );
      let rateSellAmount = this.currentSellItem.price * amount || 0;
      this.sliderRate.rateSellAmount = rateSellAmount.toFixed(priceScale);
      this.currentSellItem.amount = amount || 0;
      return val;
    },
    buyAmountLimit(event) {
      let canBuy = this.currentBuyItem.canBuyAmount,
        { numMax, numMin, numScale, buyFeeRate, priceScale } =
          this.currentMarket;
      let value = event.srcElement
        ? event.srcElement.value
        : event.target.value;
      value = this.filterValue(value, event, 8, numScale);
      let numValue = Number(value);
      // numMax 最大买入量大于0就做限制
      if (this.token) {
        if (numMax > 0) {
          if (numMax > canBuy) {
            if (numValue >= canBuy) {
              value = canBuy.toString();
            }
          } else {
            if (numValue >= numMax) {
              value = numMax.toString();
            }
          }
        } else {
          if (numValue >= canBuy) {
            value = canBuy.toString();
          }
        }
      }
      this.currentBuyItem.amount = value;
      this.sliderRate.buy = (value / canBuy) * 100;
      this.sliderRate.rateBuyAmount = (
        this.currentBuyItem.price * value
      ).toFixed(priceScale);
    },
    sellAmountLimit(event) {
      let canSell = this.userAccount.sellAmount,
        { numMax, numMin, numScale, sellFeeRate, priceScale } =
          this.currentMarket;
      let value = event.srcElement
        ? event.srcElement.value
        : event.target.value;
      value = this.filterValue(value, event, 8, numScale);
      let numValue = Number(value);
      if (this.token) {
        if (numMax > 0) {
          if (numMax > canSell) {
            if (numValue >= canSell) {
              value = canSell.toString();
            }
          } else {
            if (numValue >= numMax) {
              value = numMax.toString();
            }
          }
        } else {
          if (numValue >= canSell) {
            value = canSell.toString();
          }
        }
      }
      this.currentSellItem.amount = value;
      this.sliderRate.sell = (value / canSell) * 100;
      this.sliderRate.rateSellAmount = (
        this.currentSellItem.price * value
      ).toFixed(priceScale);
    },
    //交易提交
    createOrder(type) {
      // type 1 买入 type 2 卖出
      if (!this.token) {
        this.$message({
          message: this.$t("m.unlogin"),
          type: "error",
        });
        this.$router.push("/login");
      } else {
        let { numMin, numMax, symbol } = this.currentMarket;
        let { price, amount } =
          type == 1 ? this.currentBuyItem : this.currentSellItem;

        if (type === 1) {
          if (numMin > 0 && amount < numMin) {
            this.currentBuyItem.amount = numMin.toString();
            this.$message({
              message: this.$t("m.trade.minBuyAmountError"),
              error: "error",
            });
            return;
          }
          if (numMax > 0 && amount > numMax) {
            this.currentBuyItem.amount = numMax.toString();
            this.$message({
              message: this.$t("m.trade.maxBuyAmountError"),
              error: "error",
            });
            return;
          }

          if (this.sliderRate.rateBuyAmount > this.userAccount.buyAmount) {
            this.$message({
              message: this.$t("m.amountError"),
              type: "error",
            });
            return;
          }
        } else if (type === 2) {
          if (numMin > 0 && amount < numMin) {
            this.currentSellItem.amount = numMin.toString();
            this.$message({
              message: this.$t("m.trade.minSellAmountError"),
              error: "error",
            });
            return;
          }
          if (numMax > 0 && amount > numMax) {
            this.currentSellItem.amount = numMax.toString();
            this.$message({
              message: this.$t("m.trade.maxSellAmountError"),
              error: "error",
            });
            return;
          }
          if (this.currentSellItem.amount > this.userAccount.sellAmount) {
            this.$message({
              type: "error",
              message: this.$t("m.amountError"),
            });
            return;
          }
        }

        if (price > 0 && amount > 0) {
          //提交订单
          tradeApi
            .serverCreateOrder(price, symbol, type, amount, this.token)
            .then((res) => {
              this.$message({
                message: this.$t("m.trade.entrustSuccess"),
                type: "success",
              });
              if (type === 1) {
                this.currentBuyItem.price = "";
                this.currentBuyItem.amount = "";
              } else {
                this.currentSellItem.price = "";
                this.currentSellItem.amount = "";
              }
              setTimeout(() => {
                this.refreshRecord();
              }, 3000);
            })
            .catch((res) => {
              this.$message({
                message: res.errmsg,
                type: "error",
              });
            });
        } else {
          this.$message({
            message: this.$t("m.trade.plzEnterPriceAndAmount"),
            type: "error",
          });
        }
      }
    },
    formatNumber(value, scale) {
      let result = ["", ""];
      let num = value.toString();
      if (num.indexOf(".") !== -1) {
        let arr = num.split(".");
        result[0] = arr[0];
        if (arr[1].length === scale) {
          result[0] += "." + arr[1];
        } else if (arr[1].length > scale) {
          result[1] = ".";
          result[1] += arr[1].substring(0, scale - 1);
        } else if (arr[1].length < scale) {
          let zeros = scale + 1 - arr[1].length;
          result[0] += "." + arr[1];
          result[1] = Array(zeros).join(0);
        }
      } else {
        result[0] = num;
        result[1] = "." + Array(scale + 1).join(0);
      }
      return '<i class="test">' + result[0] + "</i>" + result[1];
    },
    turnoverPageChange(currentPage) {
      this.turnoverPageQuery.page = currentPage;
      this._serverGetTurnoverOrderList();
    },
    entrustPageChange(currentPage) {
      this.entrustPageQuery.page = currentPage;
      this._serverGetEntrustOrderList();
    },
    _serverGetTurnoverOrderList() {
      if (this.token) {
        tradeApi
          .serverGetTurnoverOrderList(
            this.turnoverPageQuery.page,
            this.turnoverPageQuery.size,
            this.currentMarket.symbol,
            this.token
          )
          .then((res) => {
            console.log("历史委托：", res);
            let result = res.data;
            this.turnoverPageQuery.page = result.current;
            this.turnoverPageQuery.totalRecords = result.total;
            this.turnoverTbData = result.records;
          });
      }
    },
    async _serverGetEntrustOrderList() {
      if (this.token) {
        let res = await tradeApi.serverGetEntrustOrderList(
          this.entrustPageQuery.page,
          this.entrustPageQuery.size,
          this.currentMarket.symbol,
          this.token
        );
        let result = res.data;
        this.entrustPageQuery.page = result.current;
        this.entrustPageQuery.totalRecords = result.total;
        console.log("未完成委托：", result);
        this.entrustTbData = result.records;
      }
    },
    //撤销定单
    cancelOrder(orderId) {
      this.$confirm(this.$t("m.trade.cancelHint"), this.$t("m.prompt"), {
        confirmButtonText: this.$t("m.yes"),
        cancelButtonText: this.$t("m.no"),
        type: "warning",
      }).then(() => {
        tradeApi.serverCancelOrder(orderId, this.token).then((res) => {
          this.$message({
            message: this.$t("m.trade.cancelSuccess"),
            type: "success",
          });
          this._serverGetEntrustOrderList();
        });
      });
    },
    async _getMarkList() {
      try {
        let res = await homeApi.getMarketListNew();
        if (this.token) {
          let data = await this.getFavoriteData();
          this.marketList = res.data.concat(data);
        } else {
          this.marketList = res.data;
        }
        console.log("全部市场", this.marketList);
        this.activeName = this.marketList[0].areaName;
        this.subscribeMarkets(this.activeName);
        this.currentMarket = this.marketList[0].markets[0];
        if (this.symbol !== undefined) {
          if (this.getCurrentMarket() != null) {
            this.currentMarket = this.getCurrentMarket();
          }
        }
        this.marketChange(this.currentMarket);
      } catch (e) {}
    },
    getCurrentMarket() {
      for (let i = 0; i < this.marketList.length; i++) {
        for (let j = 0; j < this.marketList[i].markets.length; j++) {
          if (this.marketList[i].markets[j].symbol === this.symbol) {
            return this.marketList[i].markets[j];
          }
        }
      }
      return null;
    },
    _getUserAccount(symbol) {
      if (this.token) {
        tradeApi.getUserAccount(symbol, this.token).then((res) => {
          this.userAccount = res.data;
        });
      }
    },
    subscribeDepths(kline) {
      let symbol = this.currentMarket.symbol.toLowerCase();
      let mergeDepth = this.chooseMergeDepth;

      this.$socket.subscribe(
        `market.${symbol}.depth.${mergeDepth}`,
        "market-depth"
      );

      this.$socket.on("market-depth", (data) => {
        this.depthsData = data.tick;
        if (kline && kline.contentWindow) {
          kline.contentWindow.set_current_depth(this.depthsData);
        }
        this.processDepthData();
      });
    },
    getOrderBookItemPercent(key) {
      return { width: this.depthsData.stockEntriesMap[key].percent };
    },
    getOrderBookPercent() {
      if (this.depthsData.stockEntries) {
        let buy = 0;
        let sell = 0;
        for (var i in this.depthsData.stockEntries) {
          let stock = this.depthsData.stockEntries[i];
          console.log(stock);
          if (stock.type == "SELL") {
            sell += stock.size;
          } else {
            buy += stock.size;
          }
        }
        return { width: (buy * 100) / (buy + sell) + "%" };
      }
      return { width: "50%" };
    },
    getOrderBookColor(key) {
      if (this.depthsData.stockEntriesMap) {
        let curr = this.depthsData.stockEntriesMap[key].value;
        let close = this.depthsData.close;
        if (curr > close) {
          return {
            color: "red",
          };
        } else if (curr < close) {
          return {
            color: "green",
          };
        }
      }
      return {};
    },
    processDepthData() {
      let { asks, bids } = this.depthsData;
      let { priceScale, buyFeeRate, sellFeeRate, numScale } =
        this.currentMarket;
      if (
        this.currentBuyItem.price === "" &&
        bids.length > 0 &&
        this.currentBuyItem.canBuyAmount === ""
      ) {
        let { buyAmount } = this.userAccount;
        if (asks[0]) {
          this.currentBuyItem.price = asks[0].price;
          //交易面板 计算可交易量
          // 扣除手续费之后的可买量算法
          this.currentBuyItem.canBuyAmount = (
            buyAmount /
            (1 + buyFeeRate) /
            this.currentBuyItem.price
          ).toFixed(numScale);
        }
      }
      if (
        this.currentSellItem.price === "" &&
        asks.length > 0 &&
        this.currentSellItem.canSellAmount === ""
      ) {
        let { sellAmount } = this.userAccount;
        if (bids[0]) {
          let bidPrice = bids[0].price;
          this.currentSellItem.price = bidPrice;
          this.currentSellItem.canSellAmount =
            bidPrice * sellAmount * (1 + sellFeeRate).toFixed(numScale);
        }
      }
      // console.log("深度数据",asks,bids)
      this.domWidth = document.querySelector("#depth-data-item").clientWidth;
      this.asksDepth = this.bidsDepth = 0;
      for (let i = 0; i < asks.length; i++) {
        this.asksDepth = Math.max(this.asksDepth, asks[i].volume);
      }
      for (let i = 0; i < bids.length; i++) {
        this.bidsDepth = Math.max(this.bidsDepth, bids[i].volume);
      }
      this.depthsData.asks.reverse();
    },
    unsubscribeDepths() {
      let symbol = this.currentMarket.symbol.toLowerCase();
      let mergeDepth = this.chooseMergeDepth;
      this.$socket.unsubscribe(
        `market.${symbol}.depth.${mergeDepth}`,
        "market-depth"
      );
    },
    subscribeTrades() {
      let symbol = this.currentMarket.symbol.toLowerCase();
      this.$socket.subscribe(`market.${symbol}.trade.detail`, "market-trade");
      this.$socket.on("market-trade", (data) => {
        // console.log("成交记录",data)
        this.tradesData = data.data;
      });
    },
    unsubscribeTrades() {
      let symbol = this.currentMarket.symbol.toLowerCase();
      this.$socket.unsubscribe(`market.${symbol}.trade.detail`, "market-trade");
    },
    subscribePath(market) {
      market = market.toLowerCase();
      return `market.${market}.ticker`;
    },

    /**
     * 订阅全部的市场对
     */
    subscribeAllMarkets() {
      this.$socket.subscribe("market.ticker", "all-market-area");
      this.$socket.on("all-market-area", (data) => {
        // console.log("全部市场订阅", data)
        if (data.markets) {
          let filteredFavorites = data.markets.filter((item) => {
            let itemSymbol = item.symbol.toLowerCase();
            return this.userFavorites.indexOf(itemSymbol) !== -1;
          });
          // console.log("过滤后的",filteredFavorites )
          let len = this.marketList.length;
          this.marketList[len - 1].markets = filteredFavorites;
        }
      });
    },
    unsubscribeAllMarkets() {
      this.$socket.unsubscribe("market.ticker", "all-market-area");
    },

    subscribeMarkets(market) {
      this.$socket.subscribe(this.subscribePath(market), "market-area");
      this.$socket.on("market-area", (data) => {
        // console.log("所有市场socket:",data)
        let index = this.activeIndex;
        this.marketList[index].markets = data.markets;
      });
    },
    unsubscribeMarkets(market) {
      this.$socket.unsubscribe(this.subscribePath(market), "market-area");
    },
    // 订阅未完成委托
    subscribeEntrust() {
      this.$socket.subscribe(
        `order.pending.update`,
        "order-pending",
        this.token
      );
      this.$socket.on("order-pending", (data) => {
        // console.log("未完成委托事件", data)
        this._serverGetEntrustOrderList();
      });
    },
    unsubscribeEntrust() {
      this.$socket.unsubscribe(`order.pending.update`, "order-pending");
    },
    //订阅历史委托
    subscribeTurnover() {
      this.$socket.subscribe(
        `order.finished.update`,
        "order-finished",
        this.token
      );
      this.$socket.on("order-finished", (data) => {
        // console.log("成交记录事件", data)
        this._serverGetTurnoverOrderList();
      });
    },
    unsubscribeTurnover() {
      this.$socket.unsubscribe(`order.finished.update`, "order-finished");
    },
  },
};
</script>
