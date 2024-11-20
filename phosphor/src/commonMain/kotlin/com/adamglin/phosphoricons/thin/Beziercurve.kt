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

public val ThinGroup.BezierCurve: ImageVector
    get() {
        if (_bezierCurve != null) {
            return _bezierCurve!!
        }
        _bezierCurve = Builder(name = "BezierCurve", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(217.83f, 148.07f)
                arcTo(92.6f, 92.6f, 0.0f, false, false, 165.53f, 84.0f)
                lineTo(240.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(155.71f, 76.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(16.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(90.47f, 84.0f)
                arcToRelative(92.6f, 92.6f, 0.0f, false, false, -52.3f, 64.07f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.07f, 0.64f)
                arcToRelative(84.51f, 84.51f, 0.0f, false, true, 55.0f, -60.36f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 53.46f, 0.0f)
                arcToRelative(84.53f, 84.53f, 0.0f, false, true, 55.0f, 60.36f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, 8.07f, -0.64f)
                close()
                moveTo(60.0f, 176.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 60.0f, 176.0f)
                close()
                moveTo(128.0f, 100.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 100.0f)
                close()
                moveTo(216.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 216.0f, 196.0f)
                close()
            }
        }
        .build()
        return _bezierCurve!!
    }

private var _bezierCurve: ImageVector? = null
