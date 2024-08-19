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

public val LightGroup.Rainbowcloud: ImageVector
    get() {
        if (_rainbowcloud != null) {
            return _rainbowcloud!!
        }
        _rainbowcloud = Builder(name = "Rainbowcloud", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 114.0f)
                arcToRelative(46.18f, 46.18f, 0.0f, false, false, -43.35f, 30.59f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -4.65f, -0.37f)
                curveToRelative(-16.54f, 0.0f, -30.0f, 13.86f, -30.0f, 30.89f)
                reflectiveCurveTo(135.46f, 206.0f, 152.0f, 206.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f)
                close()
                moveTo(200.0f, 194.0f)
                lineTo(152.0f, 194.0f)
                curveToRelative(-9.93f, 0.0f, -18.0f, -8.47f, -18.0f, -18.89f)
                reflectiveCurveToRelative(8.07f, -18.89f, 18.0f, -18.89f)
                arcToRelative(17.12f, 17.12f, 0.0f, false, true, 6.53f, 1.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.16f, -4.35f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 200.0f, 194.0f)
                close()
                moveTo(22.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(10.0f, 160.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 183.11f, 86.87f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.37f, 8.61f)
                arcTo(90.0f, 90.0f, 0.0f, false, false, 22.0f, 160.0f)
                close()
                moveTo(112.0f, 102.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 160.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, true, 111.42f, -56.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.11f, 9.66f)
                arcTo(57.5f, 57.5f, 0.0f, false, false, 112.0f, 102.0f)
                close()
                moveTo(118.0f, 134.7f)
                arcToRelative(26.59f, 26.59f, 0.0f, false, false, -6.0f, -0.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, 26.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(74.0f, 160.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 46.81f, -37.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 118.0f, 134.7f)
                close()
            }
        }
        .build()
        return _rainbowcloud!!
    }

private var _rainbowcloud: ImageVector? = null
