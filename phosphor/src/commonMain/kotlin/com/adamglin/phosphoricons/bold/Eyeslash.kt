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

public val BoldGroup.Eyeslash: ImageVector
    get() {
        if (_eyeslash != null) {
            return _eyeslash!!
        }
        _eyeslash = Builder(name = "Eyeslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineToRelative(16.0f, 17.65f)
                curveTo(20.67f, 88.66f, 5.72f, 121.58f, 5.0f, 123.13f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, false, 0.0f, 9.75f)
                curveToRelative(0.37f, 0.82f, 9.13f, 20.26f, 28.49f, 39.61f)
                curveTo(59.37f, 198.34f, 92.0f, 212.0f, 128.0f, 212.0f)
                arcToRelative(131.34f, 131.34f, 0.0f, false, false, 51.0f, -10.0f)
                lineToRelative(20.09f, 22.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(128.0f, 188.0f)
                curveToRelative(-29.59f, 0.0f, -55.47f, -10.73f, -76.91f, -31.88f)
                arcTo(130.69f, 130.69f, 0.0f, false, true, 29.52f, 128.0f)
                curveToRelative(5.27f, -9.31f, 18.79f, -29.9f, 42.0f, -44.29f)
                lineToRelative(90.09f, 99.11f)
                arcTo(109.33f, 109.33f, 0.0f, false, true, 128.0f, 188.0f)
                close()
                moveTo(251.0f, 132.88f)
                curveToRelative(-0.36f, 0.81f, -9.0f, 20.0f, -28.0f, 39.16f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -16.9f)
                arcTo(130.48f, 130.48f, 0.0f, false, false, 226.48f, 128.0f)
                arcToRelative(130.36f, 130.36f, 0.0f, false, false, -21.57f, -28.12f)
                curveTo(183.46f, 78.73f, 157.59f, 68.0f, 128.0f, 68.0f)
                curveToRelative(-3.35f, 0.0f, -6.7f, 0.14f, -10.0f, 0.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -2.0f, -23.91f)
                curveToRelative(3.93f, -0.34f, 8.0f, -0.51f, 12.0f, -0.51f)
                curveToRelative(36.0f, 0.0f, 68.63f, 13.67f, 94.49f, 39.52f)
                curveToRelative(19.35f, 19.35f, 28.11f, 38.8f, 28.48f, 39.61f)
                arcTo(12.08f, 12.08f, 0.0f, false, true, 251.0f, 132.88f)
                close()
            }
        }
        .build()
        return _eyeslash!!
    }

private var _eyeslash: ImageVector? = null
