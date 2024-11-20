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

public val ThinGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.9f, 54.24f)
                arcToRelative(216.79f, 216.79f, 0.0f, false, false, -40.84f, -33.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.12f, 0.0f)
                arcTo(216.79f, 216.79f, 0.0f, false, false, 85.1f, 54.24f)
                curveTo(58.21f, 82.48f, 44.0f, 113.51f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 113.51f, 197.79f, 82.48f, 170.9f, 54.24f)
                close()
                moveTo(92.0f, 184.0f)
                curveToRelative(0.0f, -32.11f, 28.07f, -53.75f, 36.0f, -59.21f)
                curveToRelative(7.93f, 5.47f, 36.0f, 27.1f, 36.0f, 59.21f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f)
                close()
                moveTo(161.94f, 212.0f)
                arcTo(43.82f, 43.82f, 0.0f, false, false, 172.0f, 184.0f)
                curveToRelative(0.0f, -41.78f, -40.23f, -66.4f, -41.94f, -67.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.12f, 0.0f)
                curveTo(124.23f, 117.6f, 84.0f, 142.22f, 84.0f, 184.0f)
                arcToRelative(43.82f, 43.82f, 0.0f, false, false, 10.06f, 28.0f)
                arcTo(76.07f, 76.07f, 0.0f, false, true, 52.0f, 144.0f)
                curveToRelative(0.0f, -62.48f, 63.64f, -107.17f, 76.0f, -115.26f)
                curveToRelative(12.36f, 8.09f, 76.0f, 52.78f, 76.0f, 115.26f)
                arcTo(76.07f, 76.07f, 0.0f, false, true, 161.94f, 212.0f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
