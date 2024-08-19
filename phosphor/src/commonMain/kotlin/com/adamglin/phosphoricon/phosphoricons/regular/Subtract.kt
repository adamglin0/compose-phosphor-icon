package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Subtract: ImageVector
    get() {
        if (_subtract != null) {
            return _subtract!!
        }
        _subtract = Builder(name = "Subtract", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.63f, 81.35f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.28f, 93.28f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.28f, -93.28f)
                close()
                moveTo(224.0f, 160.0f)
                curveToRelative(0.0f, 1.52f, -0.07f, 3.0f, -0.18f, 4.51f)
                lineToRelative(-50.0f, -50.0f)
                arcTo(80.14f, 80.14f, 0.0f, false, false, 176.0f, 98.0f)
                arcTo(63.81f, 63.81f, 0.0f, false, true, 224.0f, 160.0f)
                close()
                moveTo(146.6f, 157.91f)
                lineTo(199.21f, 210.53f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 183.0f, 219.7f)
                lineToRelative(-51.86f, -51.86f)
                arcTo(80.5f, 80.5f, 0.0f, false, false, 146.6f, 157.91f)
                close()
                moveTo(157.91f, 146.6f)
                arcToRelative(80.5f, 80.5f, 0.0f, false, false, 9.93f, -15.44f)
                lineTo(219.7f, 183.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -9.17f, 16.19f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, 64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(98.0f, 176.0f)
                arcToRelative(80.14f, 80.14f, 0.0f, false, false, 16.5f, -2.13f)
                lineToRelative(50.0f, 50.0f)
                curveToRelative(-1.49f, 0.11f, -3.0f, 0.18f, -4.51f, 0.18f)
                arcTo(63.81f, 63.81f, 0.0f, false, true, 98.0f, 176.0f)
                close()
            }
        }
        .build()
        return _subtract!!
    }

private var _subtract: ImageVector? = null
