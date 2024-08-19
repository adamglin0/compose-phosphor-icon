package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Pushpin: ImageVector
    get() {
        if (_pushpin != null) {
            return _pushpin!!
        }
        _pushpin = Builder(name = "Pushpin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.32f, 81.37f)
                lineTo(174.63f, 20.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f)
                lineTo(98.37f, 74.49f)
                curveToRelative(-10.66f, -3.34f, -35.0f, -7.37f, -60.4f, 13.14f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.29f, 23.78f)
                lineTo(85.0f, 159.71f)
                lineTo(42.34f, 202.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f)
                lineTo(96.29f, 171.0f)
                lineToRelative(48.29f, 48.29f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 155.9f, 224.0f)
                curveToRelative(0.38f, 0.0f, 0.75f, 0.0f, 1.13f, 0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 11.64f, -6.33f)
                curveToRelative(19.64f, -26.1f, 17.75f, -47.32f, 13.19f, -60.0f)
                lineTo(235.33f, 104.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 235.32f, 81.37f)
                close()
                moveTo(224.0f, 92.69f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-57.27f, 57.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.49f, 9.22f)
                curveToRelative(9.46f, 18.93f, -1.8f, 38.59f, -9.34f, 48.62f)
                lineTo(48.0f, 100.08f)
                curveToRelative(12.08f, -9.74f, 23.64f, -12.31f, 32.48f, -12.31f)
                arcTo(40.13f, 40.13f, 0.0f, false, true, 96.81f, 91.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.25f, -1.51f)
                lineTo(163.32f, 32.0f)
                lineTo(224.0f, 92.68f)
                close()
            }
        }
        .build()
        return _pushpin!!
    }

private var _pushpin: ImageVector? = null
