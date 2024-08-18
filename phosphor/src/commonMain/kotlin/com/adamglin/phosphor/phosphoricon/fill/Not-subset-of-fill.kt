package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Not-subset-of-fill`: ImageVector
    get() {
        if (`_not-subset-of-fill` != null) {
            return `_not-subset-of-fill`!!
        }
        `_not-subset-of-fill` = Builder(name = "Not-subset-of-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 80.0f)
                horizontalLineToRelative(31.37f)
                lineTo(90.83f, 158.33f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 128.0f, 80.0f)
                close()
                moveTo(224.0f, 48.0f)
                lineTo(224.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(208.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f)
                close()
                moveTo(189.27f, 58.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.29f, 0.75f)
                lineTo(173.37f, 64.0f)
                lineTo(128.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 80.19f, 170.49f)
                lineTo(66.0f, 186.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.0f, 10.54f)
                lineTo(92.22f, 181.0f)
                arcTo(63.62f, 63.62f, 0.0f, false, false, 128.0f, 192.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(128.0f, 176.0f)
                arcToRelative(47.63f, 47.63f, 0.0f, false, true, -25.13f, -7.13f)
                lineTo(190.0f, 69.27f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 189.27f, 58.0f)
                close()
            }
        }
        .build()
        return `_not-subset-of-fill`!!
    }

private var `_not-subset-of-fill`: ImageVector? = null
