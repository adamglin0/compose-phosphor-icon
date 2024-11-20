package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(165.66f, 74.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(87.09f, 143.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 121.0f, 177.0f)
                lineToRelative(49.32f, -50.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.42f, 11.2f)
                lineToRelative(-49.37f, 50.38f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -56.62f, -56.51f)
                lineTo(143.0f, 63.09f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 177.0f, 97.0f)
                lineTo(109.71f, 165.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.42f, -11.2f)
                lineTo(165.6f, 85.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.06f, -11.37f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
