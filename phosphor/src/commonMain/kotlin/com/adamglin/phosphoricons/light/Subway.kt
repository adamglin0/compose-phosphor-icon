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

public val LightGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 96.0f)
                lineTo(222.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 96.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, -58.0f)
                lineTo(104.0f, 38.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, false, 46.0f, 96.0f)
                lineTo(46.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 96.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, true, 70.0f, -70.0f)
                horizontalLineToRelative(48.0f)
                arcTo(70.08f, 70.08f, 0.0f, false, true, 222.0f, 96.0f)
                close()
                moveTo(182.0f, 96.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -20.33f, 21.93f)
                lineToRelative(3.7f, 7.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.74f, 5.36f)
                lineTo(148.29f, 190.0f)
                lineTo(107.71f, 190.0f)
                lineToRelative(-6.34f, 12.68f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f)
                lineToRelative(3.7f, -7.39f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 74.0f, 168.0f)
                lineTo(74.0f, 96.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 96.0f, 74.0f)
                horizontalLineToRelative(64.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 182.0f, 96.0f)
                close()
                moveTo(86.0f, 96.0f)
                verticalLineToRelative(50.0f)
                horizontalLineToRelative(84.0f)
                lineTo(170.0f, 96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(96.0f, 86.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 86.0f, 96.0f)
                close()
                moveTo(118.0f, 158.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(20.0f)
                lineTo(138.0f, 158.0f)
                close()
                moveTo(96.0f, 178.0f)
                horizontalLineToRelative(10.0f)
                lineTo(106.0f, 158.0f)
                lineTo(86.0f, 158.0f)
                verticalLineToRelative(10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 96.0f, 178.0f)
                close()
                moveTo(170.0f, 168.0f)
                lineTo(170.0f, 158.0f)
                lineTo(150.0f, 158.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 170.0f, 168.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
