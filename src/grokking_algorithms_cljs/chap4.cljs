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


(defn count
  [list]
  (if (empty? list)
    0
    (+ 1 (count (rest list)))))


(defn maximum
  ([x] x)
  ([x y] (if (> x y) x y))
  ([x y & more] (apply maximum (cons (maximum x y) more))))

(defn mymax
  [xs]
  (apply maximum xs))


(defn quicksort
  [xs]
  (if (< (count xs) 2)
    xs
    (let [pivot (nth xs 0)
          less    (filter #(<= % pivot) (rest xs))
          greater (filter #(>  % pivot) (rest xs))]
      (concat (quicksort less) [pivot] (quicksort greater)))))
