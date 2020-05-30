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

(+ 1 2 3 4)

(* 1 2 3 4)

(first '(1 2 3))

(inc 1.1)

(map inc [0 1 2 3])

(defn too-enthusiastic
    "Return a cheer that might be a bit too enthusiastic"
    [name]
    (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
             "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

(too-enthusiastic "Zelda")


(defn no-params
  []
  "I take no parameters!")
(defn one-param
  [x]
  (str "I take one parameter: " x))
(defn two-params
  [x y]
  (str "Two parameters! That's nothing! Pah! I will smoosh them "
       "together to spite you! " x y))

(no-params)

(one-param "one param")

(two-params "one" "two")

(defn multi-arity
  ;; 2-arity arguments and body
  ([first-arg second-arg]
   (two-params first-arg second-arg))
  ;; 1-arity arguments and body
  ([first-arg]
   (one-param first-arg)))

(multi-arity "vignesh")

(defn weird-arity
  ([]
   "Destiny dressed you this morning, my friend, and now Fear is
     trying to pull off your pants. If you give up, if you give in,
     you're gonna end up naked with Fear just standing there laughing
     at your dangling unmentionables! - the Tick")
  ([number]
   (inc number)))

(weird-arity 5)

(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))

(defn codger
    [& whippersnappers]
  (map codger-communication whippersnappers))

(codger "Billy" "Anne-Marie" "The Incredible Bulk")


(defn simulate-loop
  [& list_values]
  (str "value " list_values)
  )

(simulate-loop 1 2 3)

;; next is Destructuring
;; The basic idea behind destructuring is that it lets you concisely bind names to values within a collection.

(defn my-first
  [[first-thing, second-thing]] ; Notice that first-thing is within a vector
  (str first-thing second-thing))

(my-first ["vignesh","sharan"])


(defn announce-treasure-location
  [{:keys [lat lng]}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(announce-treasure-location {:lat 28.22 :lng 81.33})

(defn illustrative-function
  []
  (+ 1 304)
  30
  "joe")

(illustrative-function) ;; Executes the last form


(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

((fn [x] (* x 3)) 8)

;; Function call
(* 8 3)

;; Anonymous function
#(* % 3)

(#(str %1 " and " %2) "cornbread" "butter beans")

(#(identity %&) 1 "blarg" :yip "Vignesh")

(defn inc-maker
  "Create a custom incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))

(inc3 7)

;; Next is The Shire’s Next Top Model
