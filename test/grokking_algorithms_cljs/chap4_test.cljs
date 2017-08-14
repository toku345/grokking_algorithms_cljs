(ns grokking_algorithms_cljs.chap4-test
  (:require [cljs.test :refer-macros [deftest is]]
            [grokking_algorithms_cljs.chap4 :refer [sum]]))

(deftest return-sum-total
  (is (= 10 (sum [1 2 3 4])))
  (is (= 1 (sum [1])))
  (is (= 0 (sum []))))
