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

public val LightGroup.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) {
            return _bezierCurve!!
        }
        _bezierCurve = Builder(name = "BezierCurve", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.44f, 146.2f)
                arcTo(94.66f, 94.66f, 0.0f, false, false, 173.92f, 86.0f)
                lineTo(240.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(157.4f, 74.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(16.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(82.08f, 86.0f)
                arcToRelative(94.66f, 94.66f, 0.0f, false, false, -45.52f, 60.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.09f, 1.08f)
                arcToRelative(82.53f, 82.53f, 0.0f, false, true, 51.4f, -56.39f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 55.9f, 0.0f)
                arcToRelative(82.53f, 82.53f, 0.0f, false, true, 51.4f, 56.39f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.09f, -1.08f)
                close()
                moveTo(58.0f, 176.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 58.0f, 176.0f)
                close()
                moveTo(128.0f, 98.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 98.0f)
                close()
                moveTo(216.0f, 194.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 216.0f, 194.0f)
                close()
            }
        }
        .build()
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
