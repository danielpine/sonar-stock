// see http://vuejs-templates.github.io/webpack for documentation.
var path = require('path')
let env
if (process.env.NODE_ENV == 'production') {
  env = require('./prod.env')
} else if (process.env.NODE_ENV == 'sit') {
  env = require('./sit.env')
}
module.exports = {
  build: {
    env: env,
    port: 9000,
    index: path.resolve(__dirname, '../web/index.html'),
    assetsRoot: path.resolve(__dirname, '../web'),
    assetsSubDirectory: 'static',
    assetsPublicPath: '',
    productionSourceMap: true,
    // Gzip off by default as many popular static hosts such as
    // Surge or Netlify already gzip all static assets for you.
    // Before setting to `true`, make sure to:
    // npm install --save-dev compression-webpack-plugin
    productionGzip: false,
    productionGzipExtensions: ['js', 'css'],
    // Run the build command with an extra argument to
    // View the bundle analyzer report after build finishes:
    // `npm run build --report`
    // Set to `true` or `false` to always turn it on or off
    bundleAnalyzerReport: process.env.npm_config_report,
  },
  dev: {
    env: require('./dev.env'),
    port: 8081,
    autoOpenBrowser: false,
    assetsSubDirectory: 'static',
    assetsPublicPath: '/',
    proxyTable: {
      '/exchange': {
        target: 'http://localhost:8577', //后端接口地址
        changeOrigin: true, //是否允许跨越
        pathRewrite: {
          '^/exchange': '/exchange', //重写,
        },
      },
    },
    // CSS Sourcemaps off by default because relative paths are "buggy"
    // with this option, according to the CSS-Loader README
    // (https://github.com/webpack/css-loader#sourcemaps)
    // In our experience, they generally work as expected,
    // just be aware of this issue when enabling this option.
    cssSourceMap: false,
  },
}
