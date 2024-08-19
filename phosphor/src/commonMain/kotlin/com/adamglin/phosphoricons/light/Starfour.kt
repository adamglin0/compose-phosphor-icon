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

public val LightGroup.Starfour: ImageVector
    get() {
        if (_starfour != null) {
            return _starfour!!
        }
        _starfour = Builder(name = "Starfour", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.81f, 114.89f)
                lineTo(164.5f, 91.5f)
                lineTo(141.11f, 27.19f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, -26.22f, 0.0f)
                lineTo(91.5f, 91.5f)
                lineTo(27.19f, 114.89f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, 0.0f, 26.22f)
                lineTo(91.5f, 164.5f)
                lineToRelative(23.39f, 64.31f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, 26.22f, 0.0f)
                lineTo(164.5f, 164.5f)
                lineToRelative(64.31f, -23.39f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, 0.0f, -26.22f)
                close()
                moveTo(224.71f, 129.89f)
                lineTo(157.77f, 154.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.59f, 3.59f)
                lineToRelative(-24.34f, 66.94f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.68f, 0.0f)
                lineToRelative(-24.34f, -66.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.59f, -3.59f)
                lineTo(31.29f, 129.84f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.68f)
                lineToRelative(66.94f, -24.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.59f, -3.59f)
                lineToRelative(24.34f, -66.94f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.68f, 0.0f)
                lineToRelative(24.34f, 66.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.59f, 3.59f)
                lineToRelative(66.94f, 24.34f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.68f)
                close()
            }
        }
        .build()
        return _starfour!!
    }

private var _starfour: ImageVector? = null
