module.exports = function (grunt) {
    'use strict';

    require('load-grunt-tasks')(grunt);

    grunt.initConfig({
        ts: {
            base : {
              src: ["src/main/webapp/app/**/*.ts"],
              dest: 'src/main/webapp/dist',
              options: {
               module: 'system',
               moduleResolution: 'node',
               target: 'es6',
               experimentalDecorators: true,
               emitDecoratorMetadata: true,
               noImplicitAny: false
            }
          }
        },
        sass: {
            options: {
                sourceMap: true,
                outputStyle: 'expanded'
            },
            dist: {
                files: {
                    'src/main/webapp/app/css/app.css': 'src/main/webapp/app/scss/app.scss'
                }
            }
        },
        autoprefixer: {
            options: {
                browsers: ['last 2 versions', 'ie >= 9']
            },
            dist: {
                files: {
                    'src/main/webapp/app/css/app.css': 'src/main/webapp/app/css/app.css'
                }
            }
        },
        uglify: {
          my_target: {
              files: [{
                 expand: true,
                 cwd: 'src/js',
                 src: '**/*.js',
                 dest: 'dest/js'
              }]
            }
        },
        connect: {
            server: {
                options: {
                    port: 9000,
                    open: true,
                    livereload: 35729
                }
            }
        },
        watch: {
            options: {
                livereload: 35729
            },
            css: {
                files: ['src/main/webapp/app/scss/*.scss', 'src/main/webapp/app/scss/**/*.scss', 'src/main/webapp/app/components/**/*.scss'],
                tasks: ['css']
            },
            js: {
                files: ['src/main/webapp/app/*.ts', 'src/main/webapp/app/**/*.ts'],
                tasks: ['typescript']
            },
            app: {
                files: ['src/main/webapp/index.html', 'src/main/webapp/app/components/**/*.html'],
            }
        }
    });


    grunt.registerTask('js', ['ts','uglify']);
    grunt.registerTask('css', ['sass', 'autoprefixer']);
    grunt.registerTask('build', ['js', 'css']);
    grunt.registerTask('server', ['build', 'connect', 'watch']);
}
;
