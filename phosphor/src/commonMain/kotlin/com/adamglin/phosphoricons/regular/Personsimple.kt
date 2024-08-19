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

public val RegularGroup.Personsimple: ImageVector
    get() {
        if (_personsimple != null) {
            return _personsimple!!
        }
        _personsimple = Builder(name = "Personsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 48.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(230.86f, 132.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.0f, 2.74f)
                curveToRelative(-0.35f, -0.21f, -35.11f, -20.59f, -83.88f, -22.67f)
                lineTo(135.98f, 149.0f)
                lineToRelative(62.0f, 69.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, 10.62f)
                lineTo(128.0f, 164.0f)
                lineTo(70.0f, 229.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.0f, -10.62f)
                lineTo(120.0f, 149.0f)
                lineTo(120.0f, 112.18f)
                curveToRelative(-49.0f, 2.08f, -83.52f, 22.46f, -83.88f, 22.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.23f, -13.72f)
                curveTo(29.6f, 120.11f, 70.45f, 96.0f, 128.0f, 96.0f)
                reflectiveCurveToRelative(98.4f, 24.11f, 100.12f, 25.14f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 230.86f, 132.12f)
                close()
            }
        }
        .build()
        return _personsimple!!
    }

private var _personsimple: ImageVector? = null
