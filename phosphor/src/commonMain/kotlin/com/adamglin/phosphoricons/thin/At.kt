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

public val ThinGroup.At: ImageVector
    get() {
        if (_at != null) {
            return _at!!
        }
        _at = Builder(name = "At", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 0.0f, 200.0f)
                curveToRelative(20.76f, 0.0f, 42.52f, -6.23f, 58.21f, -16.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.43f, -6.67f)
                curveTo(167.35f, 214.27f, 147.24f, 220.0f, 128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                curveToRelative(0.0f, 31.32f, -15.0f, 36.0f, -24.0f, 36.0f)
                reflectiveCurveToRelative(-24.0f, -4.68f, -24.0f, -36.0f)
                lineTo(172.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(14.75f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 2.82f, 45.94f)
                curveTo(171.46f, 163.58f, 181.66f, 172.0f, 196.0f, 172.0f)
                curveToRelative(20.0f, 0.0f, 32.0f, -16.45f, 32.0f, -44.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _at!!
    }

private var _at: ImageVector? = null
