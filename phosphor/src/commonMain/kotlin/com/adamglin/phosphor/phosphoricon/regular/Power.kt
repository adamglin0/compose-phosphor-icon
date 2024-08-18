package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 128.0f)
                lineTo(120.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(180.37f, 49.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.74f, 13.4f)
                curveTo(194.74f, 77.77f, 208.0f, 101.57f, 208.0f, 128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f)
                curveToRelative(0.0f, -26.43f, 13.26f, -50.23f, 36.37f, -65.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.74f, -13.4f)
                curveTo(47.9f, 67.38f, 32.0f, 96.06f, 32.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 192.0f, 0.0f)
                curveTo(224.0f, 96.06f, 208.1f, 67.38f, 180.37f, 49.3f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
