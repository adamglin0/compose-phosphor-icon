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

public val LightGroup.Handtap: ImageVector
    get() {
        if (_handtap != null) {
            return _handtap!!
        }
        _handtap = Builder(name = "Handtap", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.0f, 76.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, 116.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(196.0f, 122.0f)
                arcToRelative(25.87f, 25.87f, 0.0f, false, false, -14.59f, 4.49f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 142.0f, 110.1f)
                lineTo(142.0f, 76.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                verticalLineToRelative(87.0f)
                lineToRelative(-7.53f, -12.1f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -45.0f, 26.13f)
                lineToRelative(29.32f, 50.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 77.16f, 221.0f)
                lineTo(47.87f, 171.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 24.25f, -14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.1f, 0.17f)
                lineToRelative(18.68f, 30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 102.0f, 184.0f)
                lineTo(102.0f, 76.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(142.0f, 132.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(36.0f)
                curveToRelative(0.0f, 22.13f, -7.3f, 37.18f, -7.37f, 37.32f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.69f, 8.0f)
                arcTo(5.83f, 5.83f, 0.0f, false, false, 208.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.38f, -3.32f)
                curveToRelative(0.35f, -0.7f, 8.63f, -17.55f, 8.63f, -42.68f)
                lineTo(222.01f, 148.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 196.0f, 122.0f)
                close()
            }
        }
        .build()
        return _handtap!!
    }

private var _handtap: ImageVector? = null
