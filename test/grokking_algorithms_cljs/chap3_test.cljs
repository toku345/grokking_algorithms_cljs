(ns grokking_algorithms_cljs.chap3-test
  (:require [cljs.test :refer-macros [deftest is]]
            [grokking_algorithms_cljs.chap3 :refer [countdown]]))

(deftest return-input-number-to-1-descending-vector
  (is (= [10 9 8 7 6 5 4 3 2 1] (countdown 10))))

(deftest return-empty-vector-if-0-or-negative-number
  (is (= [] (countdown 0)))
  (is (= [] (countdown -1))))
