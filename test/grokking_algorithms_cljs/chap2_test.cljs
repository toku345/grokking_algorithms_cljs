(ns grokking_algorithms_cljs.chap2-test
  (:require [cljs.test :refer-macros [deftest is]]
            [grokking_algorithms_cljs.chap2 :refer [remove-item
                                                    selection-sort
                                                    mymin]]))

(deftest return-vector-given-item-removed
  (is (= [2 1 5 4] (remove-item 3 [2 1 3 5 4])))
  (is (= [2 3 4 1 5] (remove-item 3 [3 2 3 4 1 5]))))

(deftest return-input-vector-if-given-item-not-found
  (is (= [2 1 5 4] (remove-item 6 [2 1 5 4]))))

(deftest return-samllest-val
  (is (= 3 (mymin 3)))
  (is (= 3 (mymin 3 4)))
  (is (= 2 (mymin 3 2)))
  (is (= 5 (mymin 6 5 7 9)))
  ;; (is (= 0 (apply mymin (range 10000)))) ; Raise [RangeError: Maximum call stack size exceeded] ...
  (is (= 0 (apply min (range 10000))))              ; Work fine!
  )

(deftest return-sorted-vector
  (is (= [] (selection-sort [])))
  (is (= [3 4 5] (selection-sort [5 4 3]))))
