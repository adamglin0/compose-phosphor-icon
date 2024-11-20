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

public val LightGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.24f, 67.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(192.0f, 103.51f)
                lineTo(152.49f, 64.0f)
                lineToRelative(35.75f, -35.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f)
                lineTo(144.0f, 55.51f)
                lineTo(116.24f, 27.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f)
                lineTo(115.51f, 44.0f)
                lineTo(61.13f, 98.38f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, 53.75f)
                lineToRelative(17.13f, 17.12f)
                lineToRelative(-50.5f, 50.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineToRelative(50.51f, -50.5f)
                lineToRelative(17.13f, 17.13f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 53.74f, 0.0f)
                lineTo(212.0f, 140.49f)
                lineToRelative(7.76f, 7.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(200.49f, 112.0f)
                lineToRelative(35.75f, -35.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 67.76f)
                close()
                moveTo(149.13f, 186.38f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -36.77f, 0.0f)
                lineTo(69.62f, 143.64f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -36.77f)
                lineTo(124.0f, 52.49f)
                lineTo(203.51f, 132.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
