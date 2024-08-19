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

public val LightGroup.Golf: ImageVector
    get() {
        if (_golf != null) {
            return _golf!!
        }
        _golf = Builder(name = "Golf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 100.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 100.0f)
                close()
                moveTo(132.0f, 122.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 132.0f, 122.0f)
                close()
                moveTo(214.0f, 96.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, true, true, -86.0f, -86.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, true, 214.0f, 96.0f)
                close()
                moveTo(202.0f, 96.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, false, -74.0f, 74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, false, 202.0f, 96.0f)
                close()
                moveTo(165.86f, 194.4f)
                curveToRelative(-13.38f, 5.11f, -25.77f, 7.6f, -37.86f, 7.6f)
                reflectiveCurveToRelative(-24.48f, -2.49f, -37.86f, -7.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.28f, 11.2f)
                arcTo(122.32f, 122.32f, 0.0f, false, false, 122.0f, 213.81f)
                lineTo(122.0f, 248.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 213.81f)
                arcToRelative(122.32f, 122.32f, 0.0f, false, false, 36.14f, -8.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.28f, -11.2f)
                close()
            }
        }
        .build()
        return _golf!!
    }

private var _golf: ImageVector? = null
