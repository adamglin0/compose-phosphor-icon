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

public val LightGroup.Power: ImageVector
    get() {
        if (_power != null) {
            return _power!!
        }
        _power = Builder(name = "Power", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(122.0f, 128.0f)
                lineTo(122.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(179.28f, 51.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 172.72f, 61.0f)
                curveTo(196.41f, 76.47f, 210.0f, 100.88f, 210.0f, 128.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, -164.0f, 0.0f)
                curveToRelative(0.0f, -27.12f, 13.59f, -51.53f, 37.28f, -67.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 76.72f, 51.0f)
                curveTo(49.57f, 68.68f, 34.0f, 96.75f, 34.0f, 128.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, false, 188.0f, 0.0f)
                curveTo(222.0f, 96.75f, 206.43f, 68.68f, 179.28f, 51.0f)
                close()
            }
        }
        .build()
        return _power!!
    }

private var _power: ImageVector? = null
