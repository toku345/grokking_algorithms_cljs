(ns grokking_algorithms_cljs.test-runner
  (:require [cljs.test :refer-macros [run-tests]]
            [grokking_algorithms_cljs.chap1-test]
            [grokking_algorithms_cljs.chap2-test]))

(enable-console-print!)

(defn run-all-tests
  []
  (run-tests 'grokking_algorithms_cljs.chap1-test)
  (run-tests 'grokking_algorithms_cljs.chap2-test))
