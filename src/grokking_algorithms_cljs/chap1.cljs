(ns grokking_algorithms_cljs.chap1)

(defn binary-search [list item]
  (loop [low 0
         high  (- (count list) 1)]
    (if (<= low high)
      (let [mid (quot (+ low high) 2)
            guess (nth list mid)]
        (cond
          (= guess item) mid
          (> guess item) (recur low (- mid 1))
          :else (recur (+ mid 1) high)))
      nil)))
