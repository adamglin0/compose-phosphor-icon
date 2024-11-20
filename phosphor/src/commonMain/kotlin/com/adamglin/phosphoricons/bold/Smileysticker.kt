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

public val BoldGroup.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) {
            return _smileySticker!!
        }
        _smileySticker = Builder(name = "SmileySticker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 31.74f, 211.26f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.0f, -3.0f)
                lineToRelative(63.57f, -63.57f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, 3.0f, -5.0f)
                arcTo(108.08f, 108.08f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(209.12f, 149.91f)
                lineTo(149.92f, 209.11f)
                arcToRelative(83.87f, 83.87f, 0.0f, true, true, 59.2f, -59.2f)
                close()
                moveTo(76.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 108.0f)
                close()
                moveTo(180.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 108.0f)
                close()
                moveTo(178.39f, 158.0f)
                curveToRelative(-11.0f, 19.06f, -29.39f, 30.0f, -50.39f, 30.0f)
                reflectiveCurveToRelative(-39.36f, -10.93f, -50.39f, -30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.78f, -12.0f)
                curveToRelative(3.89f, 6.73f, 12.91f, 18.0f, 29.61f, 18.0f)
                reflectiveCurveToRelative(25.72f, -11.28f, 29.61f, -18.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.78f, 12.0f)
                close()
            }
        }
        .build()
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
