(ns sin-vawe.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [sin-vawe.core-test]
   [sin-vawe.common-test]))

(enable-console-print!)

(doo-tests 'sin-vawe.core-test
           'sin-vawe.common-test)
