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

public val ThinGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 69.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(192.0f, 106.34f)
                lineTo(149.66f, 64.0f)
                lineToRelative(37.17f, -37.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineTo(144.0f, 58.34f)
                lineTo(114.83f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(118.34f, 44.0f)
                lineTo(62.54f, 99.8f)
                arcToRelative(36.05f, 36.05f, 0.0f, false, false, 0.0f, 50.91f)
                lineToRelative(18.55f, 18.54f)
                lineTo(29.17f, 221.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(51.92f, -51.92f)
                lineToRelative(18.54f, 18.55f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, 50.91f, 0.0f)
                lineToRelative(55.8f, -55.8f)
                lineToRelative(9.17f, 9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(197.66f, 112.0f)
                lineToRelative(37.17f, -37.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 69.17f)
                close()
                moveTo(150.54f, 187.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.59f, 0.0f)
                lineTo(68.2f, 145.05f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -39.59f)
                lineTo(124.0f, 49.66f)
                lineTo(206.34f, 132.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
