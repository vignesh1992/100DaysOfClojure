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

{conj {:first-name "Charlie"
:last-name "McFishwich"} :test "vignesh"}

(def map_val {:name "vignesh"
              :age "27"})

(get map_val :age1)

;; if map has no values, return default

(get map_val :age1 "default")

(map_val :age) ;; can be fetched without the get


;; NEXT is Keywords ;;

(:age map_val)

;; vectors are index based

([3 2 1] 0)

(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)

;; initialization of vectors

(vector "creepy" "full" "moon")

(conj [1 2 3] 4)

;; List -> we cant use get

'(1 2 3 4)

(nth '(:a :b :c) 0)

(list 1 "two" {3 4})

(conj '(1 2 3) 4)

;; conj adds to the front of the list whereas it adds to back in a vector

;;When should you use a list and when should you use a vector? 
;;A good rule of thumb is that if you need to easily add items to the beginning of a sequence or if you’re writing a macro, you should use a list. 
;;Otherwise, you should use a vector. As you learn more, you’ll get a good feel for when to use which.


#{"kurt vonnegut" 20 :icicle}

(hash-set 1 1 2 2)

(conj #{:a :b} :b)

(contains? #{:a :b} :a)

(contains? #{:a :b} 3)

(contains? #{nil} nil)

(:a #{:a :b})

(get #{:a :b} :a)

;; NEXT is Functions