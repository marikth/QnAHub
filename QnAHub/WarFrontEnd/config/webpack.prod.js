var path = require('path');

const helpers = require('./helpers');
const webpack = require('webpack');
const autoprefixer = require('autoprefixer');
const webpackMerge = require('webpack-merge'); // used to merge webpack configs
const commonConfig = require('./webpack.common.js');
const HtmlWebpackPlugin = require('html-webpack-plugin');

const DefinePlugin = require('webpack/lib/DefinePlugin');
const UglifyJsPlugin = require('webpack/lib/optimize/UglifyJsPlugin');
const ExtractTextPlugin = require("extract-text-webpack-plugin");

const METADATA = webpackMerge(commonConfig.metadata, {
  siteTitle: 'QNA-Hub',
  baseUrl: '/qnahub/'
});

module.exports = webpackMerge(commonConfig, {

  module: {

    loaders: [
      {
        test: /\.css$/,
        loaders: ['to-string-loader', 'css-loader']
      },

      {
        test: /\.scss$/,
        loader: 'style!css!sass'
      },
  //     {
  //       test: /\.css$/,
  //       loader: ExtractTextPlugin.extract({ fallbackLoader: 'style-loader', loader: ['css', 'postcss']})
  //     },
  //     {test: /\.scss$/, loader: 'raw!postcss!sass'},
  //
  //     {
  //       test: /\.scss$/,
  //        loader: ExtractTextPlugin.extract({ fallbackLoader: 'style-loader', loader: ['css', 'postcss', 'sass']})
  //     },
    ]
  },

  plugins: [
    //  new ExtractTextPlugin("styles.css"),
     new HtmlWebpackPlugin({
       filename: 'index.html',
       chunksSortMode: 'dependency',
       template: 'fe_src/index.ejs',
       baseUrl: METADATA.baseUrl,
       siteTitle: METADATA.siteTitle
     })
     /**
      * Plugin: UglifyJsPlugin
      * Description: Minimize all JavaScript output of chunks.
      * Loaders are switched into minimizing mode.
      *
      * See: https://webpack.github.io/docs/list-of-plugins.html#uglifyjsplugin
      */
     // NOTE: To debug prod builds uncomment //debug lines and comment //prod lines
    //  new UglifyJsPlugin({
    //    // beautify: true, //debug
    //    // mangle: false, //debug
    //    // dead_code: false, //debug
    //    // unused: false, //debug
    //    // deadCode: false, //debug
    //    // compress: {
    //    //   screw_ie8: true,
    //    //   keep_fnames: true,
    //    //   drop_debugger: false,
    //    //   dead_code: false,
    //    //   unused: false
    //    // }, // debug
    //    // comments: true, //debug
     //
     //
    //    beautify: false, //prod
    //    mangle: { screw_ie8 : true, keep_fnames: true }, //prod
    //    compress: { screw_ie8: true }, //prod
    //    comments: false //prod
    //  }),
    // new webpack.LoaderOptionsPlugin({
    //      options: {
    //
    //        /**
    //         * Sass
    //         * Reference: https://github.com/jtangelder/sass-loader
    //         * Transforms .scss files to .css
    //         */
    //        sassLoader: {
    //          //includePaths: [path.resolve(__dirname, "node_modules/foundation-sites/scss")]
    //        },
    //        /**
    //         * PostCSS
    //         * Reference: https://github.com/postcss/autoprefixer-core
    //         * Add vendor prefixes to your css
    //         */
    //        postcss: [
    //          autoprefixer({
    //            browsers: ['last 2 version']
    //          })
    //        ]
    //      }
        // })
   ],
});
