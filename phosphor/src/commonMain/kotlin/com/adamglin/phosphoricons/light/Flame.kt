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

public val LightGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.34f, 52.86f)
                arcToRelative(218.34f, 218.34f, 0.0f, false, false, -41.25f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.18f, 0.0f)
                arcToRelative(218.34f, 218.34f, 0.0f, false, false, -41.25f, 34.0f)
                curveTo(56.4f, 81.48f, 42.0f, 113.0f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.0f, 199.6f, 81.48f, 172.34f, 52.86f)
                close()
                moveTo(94.0f, 184.0f)
                curveToRelative(0.0f, -29.8f, 25.11f, -50.41f, 34.0f, -56.78f)
                curveToRelative(8.91f, 6.35f, 34.0f, 26.87f, 34.0f, 56.78f)
                arcToRelative(34.05f, 34.05f, 0.0f, false, true, -32.25f, 34.0f)
                curveToRelative(-0.59f, 0.0f, -1.16f, 0.0f, -1.75f, 0.0f)
                reflectiveCurveToRelative(-1.16f, 0.0f, -1.75f, 0.0f)
                arcTo(34.05f, 34.05f, 0.0f, false, true, 94.0f, 184.0f)
                close()
                moveTo(168.42f, 205.94f)
                arcTo(45.68f, 45.68f, 0.0f, false, false, 174.0f, 184.0f)
                curveToRelative(0.0f, -42.9f, -41.16f, -68.09f, -42.91f, -69.14f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.18f, 0.0f)
                curveTo(123.16f, 115.91f, 82.0f, 141.1f, 82.0f, 184.0f)
                arcToRelative(45.68f, 45.68f, 0.0f, false, false, 5.58f, 21.94f)
                arcTo(74.0f, 74.0f, 0.0f, false, true, 54.0f, 144.0f)
                curveToRelative(0.0f, -59.83f, 59.62f, -103.26f, 74.0f, -112.86f)
                curveToRelative(14.39f, 9.6f, 74.0f, 53.0f, 74.0f, 112.86f)
                arcTo(74.0f, 74.0f, 0.0f, false, true, 168.42f, 205.94f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
