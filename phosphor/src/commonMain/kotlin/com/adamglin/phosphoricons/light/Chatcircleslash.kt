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

public val LightGroup.ChatCircleSlash: ImageVector
    get() {
        if (_chatCircleSlash != null) {
            return _chatCircleSlash!!
        }
        _chatCircleSlash = Builder(name = "ChatCircleSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(55.07f, 56.7f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -16.72f, 120.0f)
                lineTo(26.73f, 211.56f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.71f, 17.71f)
                lineToRelative(34.87f, -11.62f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 192.0f, 207.37f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.06f, -12.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.91f, -0.5f)
                lineTo(40.65f, 217.88f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.53f, -2.53f)
                lineTo(50.58f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, -4.91f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 63.16f, 65.6f)
                lineTo(184.0f, 198.47f)
                arcTo(89.74f, 89.74f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(230.0f, 128.0f)
                arcToRelative(102.25f, 102.25f, 0.0f, false, true, -12.14f, 48.31f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.29f, 3.15f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.28f, -8.84f)
                arcTo(90.05f, 90.05f, 0.0f, false, false, 93.1f, 45.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 88.45f, 34.0f)
                arcTo(102.06f, 102.06f, 0.0f, false, true, 230.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatCircleSlash!!
    }

private var _chatCircleSlash: ImageVector? = null
