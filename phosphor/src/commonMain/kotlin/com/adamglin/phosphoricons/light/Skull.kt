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

public val LightGroup.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 106.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 92.0f, 106.0f)
                close()
                moveTo(92.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 92.0f, 146.0f)
                close()
                moveTo(164.0f, 106.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 164.0f, 106.0f)
                close()
                moveTo(164.0f, 146.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 164.0f, 146.0f)
                close()
                moveTo(128.0f, 18.0f)
                curveTo(71.76f, 18.0f, 26.0f, 62.0f, 26.0f, 116.0f)
                curveToRelative(0.0f, 33.77f, 18.3f, 65.31f, 48.0f, 83.15f)
                lineTo(74.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(182.0f, 199.15f)
                curveToRelative(29.7f, -17.84f, 48.0f, -49.38f, 48.0f, -83.15f)
                curveTo(230.0f, 62.0f, 184.24f, 18.0f, 128.0f, 18.0f)
                close()
                moveTo(173.09f, 190.44f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.09f, 5.25f)
                lineTo(170.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(150.0f, 218.0f)
                lineTo(150.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                lineTo(118.0f, 218.0f)
                lineTo(118.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                lineTo(88.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(86.0f, 195.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.09f, -5.25f)
                curveTo(55.21f, 175.09f, 38.0f, 146.56f, 38.0f, 116.0f)
                curveToRelative(0.0f, -47.42f, 40.37f, -86.0f, 90.0f, -86.0f)
                reflectiveCurveToRelative(90.0f, 38.58f, 90.0f, 86.0f)
                curveTo(218.0f, 146.56f, 200.79f, 175.09f, 173.09f, 190.44f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
