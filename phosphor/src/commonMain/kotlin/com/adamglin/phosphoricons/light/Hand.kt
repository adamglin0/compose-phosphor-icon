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

public val LightGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 50.0f)
                arcToRelative(25.8f, 25.8f, 0.0f, false, false, -14.0f, 4.11f)
                lineTo(174.0f, 44.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -51.41f, -5.51f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 82.0f, 60.0f)
                verticalLineToRelative(71.0f)
                lineToRelative(-7.53f, -12.1f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -45.11f, 25.87f)
                curveTo(60.76f, 211.0f, 78.51f, 238.0f, 128.0f, 238.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, 86.0f, -86.0f)
                lineTo(214.0f, 76.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 188.0f, 50.0f)
                close()
                moveTo(202.0f, 152.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, 74.0f)
                curveToRelative(-21.0f, 0.0f, -34.51f, -5.05f, -46.75f, -17.45f)
                curveTo(67.81f, 195.0f, 55.54f, 172.0f, 40.1f, 139.43f)
                lineToRelative(-0.23f, -0.43f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 24.25f, -14.0f)
                lineToRelative(0.1f, 0.17f)
                lineToRelative(18.68f, 30.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 152.0f)
                lineTo(94.0f, 60.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 44.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 76.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
