(ns vharmain.clj-gis-study
  (:require [oz.core :as oz])
  (:gen-class))

(comment
  (oz/start-server!))

(def world (oz/load "resources/world-map.json"))

(oz/view! world :mode :vega)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
