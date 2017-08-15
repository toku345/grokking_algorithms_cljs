(ns grokking_algorithms_cljs.chap4-test
  (:require [cljs.test :refer-macros [deftest is]]
            [grokking_algorithms_cljs.chap4 :refer [sum count mymax
                                                    quicksort]]))

(deftest return-sum-total
  (is (= 10 (sum [1 2 3 4])))
  (is (= 1  (sum [1])))
  (is (= 0  (sum []))))

(deftest return-number-of-passed-list-elements
  (is (= 5 (count [1 2 3 4 5])))
  (is (= 0 (count []))))

(deftest return-mux-number
  (is (= 5  (mymax [1 5 3 4 2])))
  (is (= 1  (mymax [1])))
  (is (= -1 (mymax [-100 -1 -10]))))

(deftest return-sorted-list
  (is (= [] (quicksort [])))
  (is (= [10] (quicksort [10])))
  (is (= [1 10] (quicksort [10 1])))
  (is (= [2 3 5 10] (quicksort [10 5 2 3]))))
