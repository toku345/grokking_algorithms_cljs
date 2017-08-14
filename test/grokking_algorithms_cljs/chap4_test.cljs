(ns grokking_algorithms_cljs.chap4-test
  (:require [cljs.test :refer-macros [deftest is]]
            [grokking_algorithms_cljs.chap4 :refer [sum count]]))

(deftest return-sum-total
  (is (= 10 (sum [1 2 3 4])))
  (is (= 1 (sum [1])))
  (is (= 0 (sum []))))

(deftest return-number-of-passed-list-elements
  (is (= 5 (count [1 2 3 4 5])))
  (is (= 0 (count []))))
