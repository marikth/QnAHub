
const helpers = require('./helpers');
const webpackMerge = require('webpack-merge'); // used to merge webpack configs
const commonConfig = require('./webpack.common.js');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const DefinePlugin = require('webpack/lib/DefinePlugin');

const METADATA = webpackMerge(commonConfig.metadata, {
  siteTitle: 'QNA-Hub',
  baseUrl: '/qnahub/'
});

module.exports = webpackMerge(commonConfig, {

  plugins: [
     new HtmlWebpackPlugin({
       filename: 'index.html',
       chunksSortMode: 'dependency',
       template: 'fe_src/index.ejs',
       baseUrl: METADATA.baseUrl,
       siteTitle: METADATA.siteTitle
     })],
});
