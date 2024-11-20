package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.48f, 136.49f)
                lineToRelative(-82.06f, 82.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -84.85f, -84.88f)
                lineToRelative(98.16f, -97.89f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.56f, 56.59f)
                lineToRelative(-0.17f, 0.16f)
                lineToRelative(-95.8f, 92.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -16.64f, -17.3f)
                lineToRelative(95.71f, -92.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.7f, -22.56f)
                lineTo(62.53f, 150.57f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 50.93f, 50.91f)
                lineToRelative(82.06f, -82.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
