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

public val LightGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 34.0f)
                lineTo(72.0f, 34.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 42.0f, 64.0f)
                lineTo(42.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(80.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(94.0f, 190.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 64.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 184.0f, 34.0f)
                close()
                moveTo(54.0f, 178.0f)
                lineTo(54.0f, 118.0f)
                lineTo(202.0f, 118.0f)
                verticalLineToRelative(60.0f)
                close()
                moveTo(54.0f, 78.0f)
                lineTo(202.0f, 78.0f)
                verticalLineToRelative(28.0f)
                lineTo(54.0f, 106.0f)
                close()
                moveTo(72.0f, 46.0f)
                lineTo(184.0f, 46.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(54.0f, 66.0f)
                lineTo(54.0f, 64.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 72.0f, 46.0f)
                close()
                moveTo(82.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 190.0f)
                lineTo(82.0f, 190.0f)
                close()
                moveTo(200.0f, 210.0f)
                lineTo(176.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(174.0f, 190.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 200.0f, 210.0f)
                close()
                moveTo(102.0f, 148.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 148.0f)
                close()
                moveTo(174.0f, 148.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 148.0f)
                close()
                moveTo(246.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(234.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(22.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(10.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
