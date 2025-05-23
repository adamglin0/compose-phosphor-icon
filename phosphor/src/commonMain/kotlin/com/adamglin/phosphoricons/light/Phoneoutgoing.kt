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

public val LightGroup.PhoneOutgoing: ImageVector
    get() {
        if (_phoneOutgoing != null) {
            return _phoneOutgoing!!
        }
        _phoneOutgoing = Builder(name = "PhoneOutgoing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.76f, 108.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f)
                lineTo(185.52f, 62.0f)
                lineTo(160.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                lineTo(206.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(194.0f, 70.48f)
                lineToRelative(-37.76f, 37.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                close()
                moveTo(221.89f, 182.83f)
                arcTo(54.25f, 54.25f, 0.0f, false, true, 168.0f, 230.0f)
                curveTo(89.7f, 230.0f, 26.0f, 166.3f, 26.0f, 88.0f)
                arcTo(54.24f, 54.24f, 0.0f, false, true, 73.17f, 34.11f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.56f, 8.38f)
                lineToRelative(21.1f, 47.11f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -1.12f, 13.27f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, true, -0.42f, 0.58f)
                lineToRelative(-21.07f, 25.0f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, 0.0f, 1.68f)
                curveToRelative(7.66f, 15.68f, 24.1f, 32.0f, 40.0f, 39.65f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, false, 1.68f, -0.06f)
                lineToRelative(24.69f, -21.0f)
                arcToRelative(4.81f, 4.81f, 0.0f, false, true, 0.56f, -0.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 13.28f, -1.22f)
                lineToRelative(47.24f, 21.17f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 221.89f, 182.83f)
                close()
                moveTo(210.0f, 181.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.21f, -2.0f)
                lineToRelative(-47.25f, -21.17f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, false, -1.6f, 0.1f)
                lineToRelative(-24.68f, 21.0f)
                curveToRelative(-0.18f, 0.15f, -0.37f, 0.29f, -0.56f, 0.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.77f, 1.0f)
                curveToRelative(-18.36f, -8.87f, -36.66f, -27.0f, -45.53f, -45.19f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.91f, -13.73f)
                arcToRelative(4.73f, 4.73f, 0.0f, false, true, 0.43f, -0.57f)
                lineTo(97.79f, 96.09f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -1.67f)
                lineTo(76.74f, 47.31f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 74.9f, 46.0f)
                horizontalLineToRelative(-0.23f)
                arcTo(42.23f, 42.23f, 0.0f, false, false, 38.0f, 88.0f)
                curveToRelative(0.0f, 71.68f, 58.32f, 130.0f, 130.0f, 130.0f)
                arcTo(42.24f, 42.24f, 0.0f, false, false, 210.0f, 181.32f)
                close()
            }
        }
        .build()
        return _phoneOutgoing!!
    }

private var _phoneOutgoing: ImageVector? = null
