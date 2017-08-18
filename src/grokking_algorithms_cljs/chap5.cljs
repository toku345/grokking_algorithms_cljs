(ns grokking_algorithms_cljs.chap5)

(def voted (atom {}))

(defn check-voter
  [name]
  (if (get @voted name)
    (println "kick them out!")
    (do
      (swap! voted assoc name true)
      (println "let them vote"))))
