
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
    'vendor':    './fe_src/vendor.browser.ts',
    'main':      './fe_src/main.ts'
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
    loaders: [

         /*
          * Typescript loader support for .ts and Angular 2 async routes via .async.ts
          * Replace templateUrl and stylesUrl with require()
          *
          * See: https://github.com/s-panferov/awesome-typescript-loader
          * See: https://github.com/TheLarkInn/angular2-template-loader
          */
         {
           test: /\.ts$/,
           loaders: [
             'awesome-typescript-loader',
             'angular2-template-loader'
           ],
           exclude: [/\.(spec|e2e)\.ts$/]
         },

         /*
          * Json loader support for *.json files.
          *
          * See: https://github.com/webpack/json-loader
          */
         {
           test: /\.json$/,
           loader: 'json-loader'
         },

         /*
          * to string and css loader support for *.css files
          * Returns file content as string
          *
          */
          {
            test: /\.css$/,
            loaders: ['to-string-loader', 'css-loader']
          },

          {
            test: /\.scss$/,
            loader: 'style!css!sass'
          },
         /* Raw loader support for *.html
          * Returns file content as string
          *
          * See: https://github.com/webpack/raw-loader
          */
         {
           test: /\.html$/,
           loader: 'raw-loader',
         },

         /* File loader for supporting images, for example, in CSS files.
         */
         {
           test: /\.(jpg|png|gif)$/,
           loader: 'file'
         }
       ],
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
