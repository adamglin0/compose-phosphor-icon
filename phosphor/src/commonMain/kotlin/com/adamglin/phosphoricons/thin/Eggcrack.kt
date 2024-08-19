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

public val ThinGroup.Eggcrack: ImageVector
    get() {
        if (_eggcrack != null) {
            return _eggcrack!!
        }
        _eggcrack = Builder(name = "Eggcrack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                curveTo(92.87f, 20.0f, 44.0f, 86.52f, 44.0f, 152.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 86.52f, 163.13f, 20.0f, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -28.46f, 10.0f, -59.73f, 27.33f, -85.78f)
                curveTo(94.81f, 43.0f, 113.91f, 28.0f, 128.0f, 28.0f)
                curveToRelative(11.39f, 0.0f, 26.05f, 9.8f, 39.42f, 25.82f)
                lineTo(125.0f, 101.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 6.54f)
                lineToRelative(28.3f, 7.08f)
                lineToRelative(-7.25f, 36.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.14f, 4.7f)
                arcToRelative(3.44f, 3.44f, 0.0f, false, false, 0.78f, 0.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.92f, -3.22f)
                lineToRelative(8.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.95f, -4.66f)
                lineToRelative(-25.58f, -6.4f)
                lineTo(172.44f, 60.2f)
                quadToRelative(2.16f, 2.91f, 4.23f, 6.0f)
                curveTo(194.0f, 92.27f, 204.0f, 123.54f, 204.0f, 152.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return _eggcrack!!
    }

private var _eggcrack: ImageVector? = null
