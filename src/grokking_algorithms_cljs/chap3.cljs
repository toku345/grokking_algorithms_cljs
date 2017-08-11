(ns grokking_algorithms_cljs.chap3)

#_(defn countdown
  [i]
  (println i)
  (if (<= i 0)
    nil
    (countdown (- i 1))))

(defn countdown
  [i]
  (if (> i 0)
    (cons i (countdown (- i 1)))
    []))


(defn greet2
  [name]
  (println (str "how are you " name "?")))

(defn bye
  []
  (println "ok bye!"))

(defn greet
  [name]
  (println (str "hello, " name "!"))
  (greet2 name)
  (println "getting ready to say bye...")
  (bye))


(defn fact
  [x]
  (if (= x 1)
    1
    (* x (fact (- x 1)))))
