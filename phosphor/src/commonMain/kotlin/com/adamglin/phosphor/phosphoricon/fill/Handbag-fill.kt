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

public val FillGroup.`Handbag-fill`: ImageVector
    get() {
        if (`_handbag-fill` != null) {
            return `_handbag-fill`!!
        }
        `_handbag-fill` = Builder(name = "Handbag-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.89f, 198.12f)
                lineToRelative(-14.26f, -120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -14.12f)
                lineTo(176.0f, 64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -96.0f, 0.0f)
                lineTo(46.33f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 14.12f)
                lineToRelative(-14.26f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 20.0f, 210.6f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, 12.0f, 5.4f)
                lineTo(223.92f, 216.0f)
                arcTo(16.13f, 16.13f, 0.0f, false, false, 236.0f, 210.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 239.89f, 198.12f)
                close()
                moveTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(80.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(96.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(176.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(160.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_handbag-fill`!!
    }

private var `_handbag-fill`: ImageVector? = null
