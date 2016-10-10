
var path = require('path');
const webpack = require('webpack');
const helpers = require('./helpers');
const HtmlWebpackPlugin = require('html-webpack-plugin');


const METADATA = {
  title: 'QNA-Hub',
  baseUrl: '/',
  isDevServer: helpers.isWebpackDevServer()
};

module.exports = {


  entry: {
    'polyfills': './fe_src/polyfills.browser.ts',
    'vendor':    './fe_src/vendor.browser.ts'
    // 'main':      './fe_src/main.ts'
  },

  output: {
    path: helpers.root('src/main/webapp'),
    filename: '[name].bundle.js',
    sourceMapFilename: '[name].map',
    chunkFilename: '[id].chunk.js',
    library: 'ac_[name]',
    libraryTarget: 'var',
  },

  module: {
    rules: [
      {
        test: /\.ts$/,
        use: [
          'awesome-typescript?tsconfig=tsconfig.json',
          'angular2-template'
        ]
      },
      {
        test: /\.html$/,
        use: 'raw'
      }
    ]
  },

  resolve: {
    extensions: ['.ts', '.js', '.json', '.css', '.scss', '.html'],
  },

  plugins: [
     new HtmlWebpackPlugin({
       filename: 'index.html',
       chunksSortMode: 'dependency',
       template: 'fe_src/index.html'
     }),
     new webpack.ProgressPlugin(),
     new webpack.ContextReplacementPlugin(
       // The (\\|\/) piece accounts for path separators in *nix and Windows
       /angular(\\|\/)core(\\|\/)(esm(\\|\/)src|src)(\\|\/)linker/,
       path.join(process.cwd(), 'app')
     )
   ],

};
