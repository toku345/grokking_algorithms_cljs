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
