(ns grokking_algorithms_cljs.chap6-test
  (:require [cljs.test :refer-macros [deftest is]]
            [grokking_algorithms_cljs.chap6 :refer [graph search]]))

(deftest return-true-when-name-find
  (is (= true (search :you)))
  (is (= false (search :bob)))
  (is (= true (search :claire))))
