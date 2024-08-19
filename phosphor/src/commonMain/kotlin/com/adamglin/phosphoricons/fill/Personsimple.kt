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

public val FillGroup.Personsimple: ImageVector
    get() {
        if (_personsimple != null) {
            return _personsimple!!
        }
        _personsimple = Builder(name = "Personsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(95.89f, 48.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 95.89f, 48.0f)
                close()
                moveTo(228.12f, 121.14f)
                curveTo(226.4f, 120.11f, 185.55f, 96.0f, 128.0f, 96.0f)
                reflectiveCurveTo(29.6f, 120.11f, 27.88f, 121.14f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.24f, 13.72f)
                curveToRelative(0.36f, -0.22f, 34.91f, -20.6f, 83.88f, -22.68f)
                lineTo(120.0f, 149.0f)
                lineTo(58.0f, 218.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.0f, 10.62f)
                lineTo(128.0f, 164.0f)
                lineToRelative(58.0f, 65.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.0f, -10.62f)
                lineTo(136.0f, 149.0f)
                lineTo(136.0f, 112.19f)
                curveToRelative(48.77f, 2.08f, 83.53f, 22.46f, 83.88f, 22.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.24f, -13.72f)
                close()
            }
        }
        .build()
        return _personsimple!!
    }

private var _personsimple: ImageVector? = null
