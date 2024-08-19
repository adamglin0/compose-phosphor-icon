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

public val LightGroup.Ambulance: ImageVector
    get() {
        if (_ambulance != null) {
            return _ambulance!!
        }
        _ambulance = Builder(name = "Ambulance", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(82.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(18.0f)
                lineTo(106.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(118.0f, 126.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(106.0f, 126.0f)
                lineTo(88.0f, 126.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 82.0f, 120.0f)
                close()
                moveTo(254.0f, 120.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(221.4f, 198.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -58.8f, 0.0f)
                lineTo(109.4f, 198.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -58.8f, 0.0f)
                lineTo(32.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(18.0f, 72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 58.0f)
                lineTo(184.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                lineTo(190.0f, 74.0f)
                horizontalLineToRelative(36.58f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, true, 13.0f, 8.8f)
                lineToRelative(14.0f, 35.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 254.0f, 120.0f)
                close()
                moveTo(190.0f, 86.0f)
                verticalLineToRelative(28.0f)
                horizontalLineToRelative(49.14f)
                lineToRelative(-10.7f, -26.74f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 226.58f, 86.0f)
                close()
                moveTo(32.0f, 186.0f)
                lineTo(50.6f, 186.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 58.8f, 0.0f)
                horizontalLineToRelative(53.2f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 178.0f, 165.48f)
                lineTo(178.0f, 70.0f)
                lineTo(32.0f, 70.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(30.0f, 184.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 32.0f, 186.0f)
                close()
                moveTo(98.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 98.0f, 192.0f)
                close()
                moveTo(210.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, false, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 210.0f, 192.0f)
                close()
                moveTo(242.0f, 184.0f)
                lineTo(242.0f, 126.0f)
                lineTo(190.0f, 126.0f)
                verticalLineToRelative(36.07f)
                curveToRelative(0.66f, 0.0f, 1.33f, -0.07f, 2.0f, -0.07f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, true, 29.4f, 24.0f)
                lineTo(240.0f, 186.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 242.0f, 184.0f)
                close()
            }
        }
        .build()
        return _ambulance!!
    }

private var _ambulance: ImageVector? = null
