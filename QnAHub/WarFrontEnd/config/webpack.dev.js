
const helpers = require('./helpers');
const webpackMerge = require('webpack-merge'); // used to merge webpack configs
const commonConfig = require('./webpack.common.js');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const DefinePlugin = require('webpack/lib/DefinePlugin');
var OpenBrowserPlugin = require('open-browser-webpack-plugin');

const ENV = process.env.ENV = process.env.NODE_ENV = 'development';
const HOST = process.env.HOST || 'localhost';
const PORT = process.env.PORT || 3000;

const METADATA = webpackMerge(commonConfig.metadata, {
  siteTitle: 'QNA-Hub-Dev',
  baseUrl: '/',
  isDevServer: helpers.isWebpackDevServer(),
  host: HOST,
  port: PORT,
  ENV: ENV
});

module.exports = webpackMerge(commonConfig, {

  metadata: METADATA,

  devServer: {
    port: METADATA.port,
    host: METADATA.host,
    historyApiFallback: true,
    watchOptions: {
      aggregateTimeout: 300,
      poll: 1000
    },
    outputPath: helpers.root('src/main/webapp/')
  },

  plugins: [
     new OpenBrowserPlugin({ url: 'http://localhost:3000' }),
     new HtmlWebpackPlugin({
       filename: 'index.html',
       chunksSortMode: 'dependency',
       template: 'fe_src/index.ejs',
       baseUrl: METADATA.baseUrl,
       siteTitle: METADATA.siteTitle
     })],
});
