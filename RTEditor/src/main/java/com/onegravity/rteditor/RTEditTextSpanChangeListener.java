package com.onegravity.rteditor;

import com.onegravity.rteditor.spans.MediaSpan;

public interface RTEditTextSpanChangeListener {

    /**
     * A MediaSpan object has been removed
     * @param editor
     * @param mediaSpan
     */
    void onMediaSpanRemoved(RTEditText editor, MediaSpan mediaSpan);
}
