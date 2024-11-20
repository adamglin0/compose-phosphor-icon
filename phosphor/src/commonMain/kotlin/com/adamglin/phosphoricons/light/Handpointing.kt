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

public val LightGroup.HandPointing: ImageVector
    get() {
        if (_handPointing != null) {
            return _handPointing!!
        }
        _handPointing = Builder(name = "HandPointing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 90.0f)
                arcToRelative(25.87f, 25.87f, 0.0f, false, false, -14.59f, 4.49f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 142.0f, 78.1f)
                lineTo(142.0f, 44.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -52.0f, 0.0f)
                verticalLineToRelative(87.0f)
                lineToRelative(-7.53f, -12.1f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -45.0f, 26.07f)
                lineToRelative(4.67f, 8.25f)
                curveToRelative(34.0f, 60.0f, 48.07f, 84.77f, 93.86f, 84.77f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, 86.0f, -86.0f)
                lineTo(222.0f, 116.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 196.0f, 90.0f)
                close()
                moveTo(210.0f, 152.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, 74.0f)
                curveToRelative(-38.8f, 0.0f, -50.0f, -19.83f, -83.42f, -78.69f)
                lineTo(47.89f, 139.0f)
                lineToRelative(0.0f, 0.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 53.0f, 119.88f)
                arcTo(13.87f, 13.87f, 0.0f, false, true, 60.0f, 118.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 12.15f, 7.0f)
                lineToRelative(0.1f, 0.17f)
                lineToRelative(18.68f, 30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 102.0f, 152.0f)
                lineTo(102.0f, 44.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(142.0f, 100.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
