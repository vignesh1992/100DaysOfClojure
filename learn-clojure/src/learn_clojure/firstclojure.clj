(ns learn-clojure.firstclojure
  (:use clojure.repl))


;; 1. Print your name (hint: use print/println)

(println "Vignesh T I")

;; 2. Create a no-arity function that prints a message

(defn printMessage []
  println "Welcome to the first function")

(printMessage)

;; 3. Create a function that squares a given number

(defn squareNumber [number]
  (* number number))

(squareNumber 5)

;; 4. Create a function that accepts a number and check if its in range of 1 to 10 (inclusive) (int: descending or ascending)

(defn checkNumberRange [number]
  (<= 1 number 10))

(checkNumberRange 10)

;; 5. Create a function that finds average of 2 given numbers (hint: nested s-expressions)

(defn check-average-of-two [number1 number2]
  (double
   (/ (+ number1 number2)
      2)))

(check-average-of-two 3 2)

(defn check-avg-exp [num1 num2]
  (-> (+ num1 num2)
      (/ 2)
      double))

(check-avg-exp 3 2)
;; 6. Write a function that finds max of 2 given numbers (hint: if-else)

(defn max-of-two [number1 number2]
  (if (> number1 number2)
    number1
    number2))

(max-of-two 2 3)









