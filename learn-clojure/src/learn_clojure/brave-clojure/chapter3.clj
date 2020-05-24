(ns learn-clojure.brave-clojure.chapter3
  (:use clojure.repl))


;; https://www.braveclojure.com/do-things/

(println "Chapter 3 of Brave Clojure")


(if true
  "True statement"
  "False statement")


(if true
  (do (println "True Statement")
      "True case")

  (do (println "False statement")
      "False case"))

(when true
  (println "Success!")
  "abra cadabra")