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

public val ThinGroup.Sphere: ImageVector
    get() {
        if (_sphere != null) {
            return _sphere!!
        }
        _sphere = Builder(name = "Sphere", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(220.0f, 128.0f)
                curveToRelative(0.0f, 10.16f, -22.26f, 21.21f, -57.11f, 25.8f)
                curveTo(163.61f, 145.62f, 164.0f, 137.0f, 164.0f, 128.0f)
                curveToRelative(0.0f, -41.16f, -8.07f, -75.0f, -20.28f, -90.65f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(128.0f, 36.0f)
                curveToRelative(13.24f, 0.0f, 28.0f, 37.78f, 28.0f, 92.0f)
                curveToRelative(0.0f, 9.45f, -0.46f, 18.39f, -1.27f, 26.73f)
                curveToRelative(-8.34f, 0.81f, -17.28f, 1.27f, -26.73f, 1.27f)
                curveToRelative(-54.22f, 0.0f, -92.0f, -14.76f, -92.0f, -28.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(37.35f, 143.72f)
                curveTo(53.0f, 155.93f, 86.84f, 164.0f, 128.0f, 164.0f)
                curveToRelative(9.0f, 0.0f, 17.62f, -0.39f, 25.8f, -1.11f)
                curveTo(149.21f, 197.74f, 138.16f, 220.0f, 128.0f, 220.0f)
                arcTo(92.14f, 92.14f, 0.0f, false, true, 37.35f, 143.72f)
                close()
                moveTo(143.72f, 218.65f)
                curveToRelative(8.63f, -11.06f, 15.19f, -31.22f, 18.3f, -56.63f)
                curveToRelative(25.41f, -3.11f, 45.57f, -9.67f, 56.63f, -18.3f)
                arcTo(92.23f, 92.23f, 0.0f, false, true, 143.72f, 218.65f)
                close()
            }
        }
        .build()
        return _sphere!!
    }

private var _sphere: ImageVector? = null
