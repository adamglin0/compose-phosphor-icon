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

public val ThinGroup.Bird: ImageVector
    get() {
        if (_bird != null) {
            return _bird!!
        }
        _bird = Builder(name = "Bird", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 68.0f)
                close()
                moveTo(236.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.78f, 3.33f)
                lineTo(212.0f, 98.14f)
                lineTo(212.0f, 120.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, true, 112.0f, 220.0f)
                lineTo(24.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.37f, -19.5f)
                lineTo(100.0f, 98.08f)
                lineTo(100.0f, 76.89f)
                curveToRelative(0.0f, -31.22f, 25.0f, -56.74f, 55.72f, -56.89f)
                lineTo(156.0f, 20.0f)
                arcToRelative(55.94f, 55.94f, 0.0f, false, true, 53.79f, 40.39f)
                lineToRelative(24.43f, 16.28f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 80.0f)
                close()
                moveTo(224.79f, 80.0f)
                lineTo(204.11f, 66.22f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -1.65f, -2.33f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 156.0f, 28.0f)
                horizontalLineToRelative(-0.24f)
                curveTo(129.43f, 28.13f, 108.0f, 50.06f, 108.0f, 76.89f)
                lineTo(108.0f, 99.52f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.93f, 2.56f)
                lineTo(20.84f, 205.56f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 212.0f)
                lineTo(52.79f, 212.0f)
                lineToRelative(72.14f, -86.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.14f, 5.12f)
                lineTo(63.21f, 212.0f)
                lineTo(112.0f, 212.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f)
                lineTo(204.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.78f, -3.33f)
                close()
            }
        }
        .build()
        return _bird!!
    }

private var _bird: ImageVector? = null
