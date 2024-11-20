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

public val ThinGroup.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) {
            return _starOfDavid!!
        }
        _starOfDavid = Builder(name = "StarOfDavid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.61f, 128.0f)
                lineToRelative(30.86f, -54.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 68.0f)
                lineTo(162.33f, 68.0f)
                lineTo(131.47f, 14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.94f, 0.0f)
                lineTo(93.66f, 68.0f)
                lineTo(32.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.47f, 6.0f)
                lineToRelative(30.85f, 54.0f)
                lineTo(28.53f, 182.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 188.0f)
                lineTo(93.66f, 188.0f)
                lineToRelative(30.87f, 54.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, 0.0f)
                lineToRelative(30.86f, -54.0f)
                lineTo(224.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.47f, -6.0f)
                close()
                moveTo(217.11f, 76.0f)
                lineTo(192.0f, 119.94f)
                lineTo(166.9f, 76.0f)
                close()
                moveTo(187.39f, 128.0f)
                lineTo(157.69f, 180.0f)
                lineTo(98.3f, 180.0f)
                lineTo(68.59f, 128.0f)
                lineTo(98.3f, 76.0f)
                lineToRelative(59.39f, 0.0f)
                close()
                moveTo(128.0f, 24.06f)
                lineToRelative(25.12f, 44.0f)
                lineTo(102.87f, 68.06f)
                close()
                moveTo(38.89f, 76.0f)
                lineTo(89.08f, 76.0f)
                lineTo(64.0f, 119.94f)
                close()
                moveTo(38.89f, 179.92f)
                lineTo(64.0f, 136.06f)
                lineTo(89.08f, 180.0f)
                close()
                moveTo(128.0f, 231.92f)
                lineTo(102.87f, 187.92f)
                horizontalLineToRelative(50.25f)
                close()
                moveTo(166.9f, 180.0f)
                lineTo(192.0f, 136.06f)
                lineTo(217.11f, 180.0f)
                close()
            }
        }
        .build()
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
