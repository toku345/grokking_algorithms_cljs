(ns grokking_algorithms_cljs.chap4)

(defn sum
  [arr]
  (if (empty? arr)
    0
    (let [head (first arr)
          tail (rest arr)]
      (+ head (sum tail)))))

#_(defn sum
  [arr]
  (reduce + 0 arr))
