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

public val FillGroup.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 40.0f)
                curveToRelative(8.15f, 0.0f, 24.0f, 31.06f, 24.0f, 88.0f)
                curveToRelative(0.0f, 8.24f, -0.34f, 15.92f, -0.93f, 23.07f)
                curveToRelative(-7.15f, 0.59f, -14.83f, 0.93f, -23.07f, 0.93f)
                curveToRelative(-56.94f, 0.0f, -88.0f, -15.85f, -88.0f, -24.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 40.0f)
                close()
                moveTo(43.4f, 152.26f)
                curveTo(63.28f, 162.65f, 95.76f, 168.0f, 128.0f, 168.0f)
                curveToRelative(7.09f, 0.0f, 14.19f, -0.26f, 21.17f, -0.77f)
                curveTo(144.23f, 199.0f, 134.0f, 216.0f, 128.0f, 216.0f)
                arcTo(88.17f, 88.17f, 0.0f, false, true, 43.4f, 152.26f)
                close()
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
