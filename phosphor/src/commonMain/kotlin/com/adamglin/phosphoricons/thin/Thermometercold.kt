package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Thermometercold: ImageVector
    get() {
        if (_thermometercold != null) {
            return _thermometercold!!
        }
        _thermometercold = Builder(name = "Thermometercold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.67f, 73.92f)
                lineToRelative(-25.2f, 8.18f)
                lineTo(238.0f, 103.54f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.47f, 4.7f)
                lineTo(216.0f, 86.81f)
                lineToRelative(-15.57f, 21.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.24f, 1.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.23f, -6.35f)
                lineTo(209.53f, 82.1f)
                lineToRelative(-25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.47f, -7.61f)
                lineTo(212.0f, 74.49f)
                lineTo(212.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(220.0f, 74.49f)
                lineToRelative(25.2f, -8.18f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.47f, 7.61f)
                close()
                moveTo(148.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -32.0f, -27.71f)
                lineTo(116.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(36.29f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 148.0f, 184.0f)
                close()
                moveTo(140.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 140.0f, 184.0f)
                close()
                moveTo(180.0f, 184.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -96.0f, -48.0f)
                lineTo(84.0f, 48.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(88.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, true, 180.0f, 184.0f)
                close()
                moveTo(172.0f, 184.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -22.29f, -42.68f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 148.0f, 138.0f)
                lineTo(148.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f)
                verticalLineToRelative(90.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.71f, 3.28f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 172.0f, 184.0f)
                close()
            }
        }
        .build()
        return _thermometercold!!
    }

private var _thermometercold: ImageVector? = null
