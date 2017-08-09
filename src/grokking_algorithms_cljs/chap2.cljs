(ns grokking_algorithms_cljs.chap2)

;;; Inspired by `sorting-algorithms.utils/remove-val` in Dwlo/clj-sorting-algorithms
;; https://github.com/Dwlo/clj-sorting-algorithms/blob/master/src/sorting_algorithms/utils.clj
(defn remove-item
  "Remove the first given item from sequences."
  [item items]
  (let [[heads tails] (split-with #(not= % item) items)]
    (concat heads (rest tails))))

;;; For studying
(defn mymin
  ([x] x)
  ([x y] (if (< x y) x y))
  ([x y & more] (apply mymin (cons (mymin x y) more)))) ; There seems to be a better way...?

(defn find-smallest
  [items]
  (apply mymin items))

(defn selection-sort
  [items]
  (if (empty? items)
    items
    (cons (find-smallest items)
          (selection-sort (remove-item (find-smallest items) items)))))
