(ns learn_clojure.brave_clojure.chapter3
  (:use clojure.repl))

(println "Chapter 3 of Brave Clojure")

(if true
  "True statement"
  "False statement")


(if true
  (do (println "True Statement")
      "True case"))

  (do (println "False statement")
      "False case")

(when true
  (println "Success!")
  "abra cadabra")

(or false nil :large_I_mean_venti :why_cant_I_just_say_large)

(or (= 0 1) (= "yes" "no"))

(or nil)

(and :free_wifi :hot_coffee)

(and :feelin_super_cool nil false)

(and (= 1 1) (= 2 1))
  
(def failed-protagonist-names
    ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

failed-protagonist-names

(defn printByCondition [val]
  (str "Welcome to the " (if 
                          (= val "first") 
                           "first" 
                           "second") "episode" ))

(printByCondition "second")

;; def is similar to assignment
(def name "Chewbacca")

(str "\"Uggllglglglglglglglll\" - " name)

;; not string interpolation is allowed like replacing, only concat

(println name)

{:first-name "Charlie"
 :last-name "McFishwich"}

(def map_val {:name "vignesh"
              :age "27"})

(get map_val :age1)

;; if map has no values, return default

(get map_val :age1 "default")

(map_val :age) ;; can be fetched without the get


;; NEXT is Keywords ;;



