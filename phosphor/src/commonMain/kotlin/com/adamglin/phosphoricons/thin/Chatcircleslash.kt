package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) {
            return _chatCircleSlash!!
        }
        _chatCircleSlash = Builder(name = "ChatCircleSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(57.83f, 56.76f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 40.53f, 176.5f)
                lineToRelative(-11.9f, 35.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.18f, 15.18f)
                lineToRelative(35.69f, -11.9f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 112.75f, -10.85f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -46.07f, -12.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.27f, -0.33f)
                lineTo(41.28f, 219.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.06f, -5.06f)
                lineToRelative(12.46f, -37.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.33f, -3.27f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 63.22f, 62.69f)
                lineToRelative(123.64f, 136.0f)
                arcTo(91.75f, 91.75f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(228.0f, 128.0f)
                arcToRelative(100.28f, 100.28f, 0.0f, false, true, -11.9f, 47.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.53f, 2.1f)
                arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.89f, -0.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.63f, -5.42f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 92.33f, 43.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.11f, -7.37f)
                arcTo(100.05f, 100.05f, 0.0f, false, true, 228.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
