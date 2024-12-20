package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.StarOfDavid: ImageVector
    get() {
        if (_starOfDavid != null) {
            return _starOfDavid!!
        }
        _starOfDavid = Builder(name = "StarOfDavid", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.21f, 128.0f)
                lineTo(231.0f, 76.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 64.0f)
                lineTo(164.65f, 64.0f)
                lineTo(135.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.9f, 0.0f)
                lineTo(91.33f, 64.0f)
                lineTo(32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.95f, 12.0f)
                lineToRelative(29.72f, 52.0f)
                lineTo(25.05f, 180.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.0f, 12.0f)
                lineTo(91.33f, 192.0f)
                lineToRelative(29.72f, 52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.9f, 0.0f)
                lineToRelative(29.7f, -52.0f)
                lineTo(224.0f, 192.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 231.0f, 180.0f)
                close()
                moveTo(182.79f, 128.0f)
                lineTo(155.37f, 176.0f)
                lineTo(100.62f, 176.0f)
                lineTo(73.2f, 128.0f)
                lineToRelative(27.42f, -48.0f)
                lineToRelative(54.75f, 0.0f)
                close()
            }
        }
        .build()
        return _starOfDavid!!
    }

private var _starOfDavid: ImageVector? = null
