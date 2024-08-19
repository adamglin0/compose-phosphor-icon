package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Link-simple-fill`: ImageVector
    get() {
        if (`_link-simple-fill` != null) {
            return `_link-simple-fill`!!
        }
        `_link-simple-fill` = Builder(name = "Link-simple-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(144.56f, 173.66f)
                lineToRelative(-21.45f, 21.45f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -62.22f, -62.22f)
                lineToRelative(21.45f, -21.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f)
                lineTo(72.2f, 144.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 39.6f)
                lineToRelative(21.45f, -21.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 11.32f)
                close()
                moveTo(109.66f, 157.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
                moveTo(195.11f, 123.11f)
                lineTo(173.66f, 144.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.31f)
                lineTo(183.8f, 111.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, -39.6f)
                lineTo(122.74f, 93.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                lineToRelative(21.46f, -21.45f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 62.22f, 62.22f)
                close()
            }
        }
        .build()
        return `_link-simple-fill`!!
    }

private var `_link-simple-fill`: ImageVector? = null
