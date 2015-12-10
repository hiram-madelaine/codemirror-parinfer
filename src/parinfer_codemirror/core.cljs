(ns ^:figwheel-always parinfer-codemirror.core
  (:require
    [parinfer.string :refer [get-lines]]
    [parinfer-codemirror.editor :refer [create-editor!
                                  create-regular-editor!
                                  start-editor-sync!]]
    [parinfer-codemirror.editor-support :refer [get-prev-state]]
    [parinfer-codemirror.state :refer [state]]))

(enable-console-print!)


(defn render-dev! []
  (create-editor! "code-indent-mode" :indent-mode)
  (create-editor! "code-paren-mode" :paren-mode {:parinfer-mode :paren-mode})
  (start-editor-sync!))

(render-dev!)
