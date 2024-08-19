package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.66f, 122.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-82.05f, 82.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -79.2f, -79.21f)
                lineTo(147.67f, 35.73f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 56.61f, 56.55f)
                lineTo(105.0f, 193.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 71.0f, 159.0f)
                lineTo(154.3f, 74.38f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 165.7f, 85.6f)
                lineTo(82.39f, 170.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.27f, 11.36f)
                lineTo(192.93f, 81.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 159.0f, 47.0f)
                lineTo(59.76f, 147.68f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.53f, 56.62f)
                lineToRelative(82.06f, -82.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 209.66f, 122.34f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
