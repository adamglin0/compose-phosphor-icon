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

public val LightGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.72f, 225.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.54f, 3.9f)
                lineTo(128.0f, 202.3f)
                lineTo(41.82f, 229.72f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.64f, -11.44f)
                lineToRelative(70.0f, -22.28f)
                lineToRelative(-70.0f, -22.28f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.64f, -11.44f)
                lineTo(128.0f, 189.7f)
                lineToRelative(86.18f, -27.42f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.64f, 11.44f)
                lineToRelative(-70.0f, 22.28f)
                lineToRelative(70.0f, 22.28f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 221.72f, 225.82f)
                close()
                moveTo(70.0f, 108.0f)
                curveToRelative(0.0f, -46.81f, 52.62f, -79.73f, 54.86f, -81.11f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.28f, 0.0f)
                curveTo(133.38f, 28.27f, 186.0f, 61.19f, 186.0f, 108.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -116.0f, 0.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f)
                curveToRelative(0.0f, -15.48f, -12.0f, -27.43f, -18.0f, -32.44f)
                curveToRelative(-6.0f, 5.0f, -18.0f, 17.0f, -18.0f, 32.44f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(45.93f, 45.93f, 0.0f, false, false, 17.0f, 35.67f)
                arcTo(29.87f, 29.87f, 0.0f, false, true, 98.0f, 136.0f)
                curveToRelative(0.0f, -26.9f, 25.58f, -44.27f, 26.67f, -45.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.66f, 0.0f)
                curveToRelative(1.09f, 0.72f, 26.67f, 18.09f, 26.67f, 45.0f)
                arcToRelative(29.87f, 29.87f, 0.0f, false, true, -1.0f, 7.67f)
                arcTo(45.93f, 45.93f, 0.0f, false, false, 174.0f, 108.0f)
                curveToRelative(0.0f, -34.06f, -35.15f, -61.22f, -46.0f, -68.78f)
                curveTo(117.15f, 46.78f, 82.0f, 73.93f, 82.0f, 108.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
