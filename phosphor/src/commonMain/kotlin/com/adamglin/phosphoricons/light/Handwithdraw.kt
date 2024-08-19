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

public val LightGroup.Handwithdraw: ImageVector
    get() {
        if (_handwithdraw != null) {
            return _handwithdraw!!
        }
        _handwithdraw = Builder(name = "Handwithdraw", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 198.65f)
                lineTo(230.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 198.65f)
                arcToRelative(76.83f, 76.83f, 0.0f, false, false, -28.0f, -59.08f)
                verticalLineToRelative(62.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, 3.28f)
                lineToRelative(-10.68f, -16.3f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -0.17f, -0.29f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.33f, 13.87f)
                lineTo(166.0f, 236.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.0f, 6.58f)
                lineToRelative(-22.26f, -34.0f)
                curveToRelative(-0.06f, -0.1f, -0.12f, -0.19f, -0.17f, -0.29f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 178.0f, 182.14f)
                lineTo(178.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(160.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(60.69f)
                arcTo(88.88f, 88.88f, 0.0f, false, true, 230.0f, 198.65f)
                close()
                moveTo(86.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(64.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 64.0f)
                lineTo(50.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(62.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(80.0f, 62.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 86.0f, 56.0f)
                close()
                moveTo(156.24f, 99.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(126.0f, 121.51f)
                lineTo(126.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(114.0f, 121.51f)
                lineTo(92.24f, 99.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 0.0f)
                lineToRelative(32.0f, -32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 156.24f, 99.76f)
                close()
            }
        }
        .build()
        return _handwithdraw!!
    }

private var _handwithdraw: ImageVector? = null
