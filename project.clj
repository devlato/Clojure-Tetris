(defproject tetris "0.1.0-SNAPSHOT"
  :description "a simple Tetris game"
  :url "https://github.com/yogthos/Clojure-Tetris"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :dependencies [[org.clojure/clojure "1.4.0"]]
  :plugins [[lein-cljsbuild "0.2.9"]]
  
  :source-paths ["src"]
  :main tetris.core
  ;;cljsbuild does not like cljs files being in the root source folder
  :cljsbuild {:crossovers [tetris.game]
              :builds 
              [{:source-path "src-cljs"
                :compiler 
                {:output-to "js/tetris.js"
                 :optimizations :advanced
                 :pretty-print false}}]})
