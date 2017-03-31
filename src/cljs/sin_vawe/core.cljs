(ns sin-vawe.core)

(def main [])

(def canvas (.getElementById js/document "myCanvas"))
(def ctx (.getContext canvas "2d"))

(.clearRect ctx  0 0 (.-width canvas) (.-height canvas))

(.log js/console ctx)