package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.25f, 123.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f)
                lineToRelative(-82.06f, 82.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, -76.36f, -76.39f)
                lineTo(149.1f, 37.14f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 53.77f, 53.72f)
                lineTo(103.59f, 191.54f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -31.15f, -31.09f)
                lineToRelative(83.28f, -84.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.56f, 8.42f)
                lineTo(81.0f, 168.91f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 14.11f, 14.18f)
                lineTo(194.35f, 82.4f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -36.74f, -36.8f)
                lineTo(58.33f, 146.28f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, false, 59.37f, 59.44f)
                lineToRelative(82.06f, -82.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 208.25f, 123.76f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
