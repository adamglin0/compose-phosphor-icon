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

public val LightGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.57f, 117.78f)
                lineToRelative(-14.0f, -35.0f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, -13.0f, -8.8f)
                lineTo(190.0f, 73.98f)
                lineTo(190.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(32.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 72.0f)
                lineTo(18.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(50.6f, 198.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                horizontalLineToRelative(53.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                lineTo(240.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(254.0f, 120.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 253.57f, 117.78f)
                close()
                moveTo(190.0f, 86.0f)
                horizontalLineToRelative(36.58f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.86f, 1.26f)
                lineTo(239.14f, 114.0f)
                lineTo(190.0f, 114.0f)
                close()
                moveTo(30.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(178.0f, 70.0f)
                verticalLineToRelative(68.0f)
                lineTo(30.0f, 138.0f)
                close()
                moveTo(80.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 80.0f, 210.0f)
                close()
                moveTo(162.6f, 186.0f)
                lineTo(109.4f, 186.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(32.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 150.0f)
                lineTo(178.0f, 150.0f)
                verticalLineToRelative(15.48f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 162.6f, 186.0f)
                close()
                moveTo(192.0f, 210.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 210.0f)
                close()
                moveTo(242.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(221.4f, 186.0f)
                arcTo(30.05f, 30.05f, 0.0f, false, false, 192.0f, 162.0f)
                curveToRelative(-0.67f, 0.0f, -1.34f, 0.0f, -2.0f, 0.07f)
                lineTo(190.0f, 126.0f)
                horizontalLineToRelative(52.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
