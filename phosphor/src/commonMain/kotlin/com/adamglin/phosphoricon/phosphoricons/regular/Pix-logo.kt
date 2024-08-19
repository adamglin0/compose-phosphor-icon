package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Pix-logo`: ImageVector
    get() {
        if (`_pix-logo` != null) {
            return `_pix-logo`!!
        }
        `_pix-logo` = Builder(name = "Pix-logo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.34f, 116.72f)
                lineTo(139.28f, 20.66f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.56f, 0.0f)
                lineTo(20.66f, 116.72f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.56f)
                lineToRelative(96.06f, 96.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, 0.0f)
                lineToRelative(96.06f, -96.06f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 235.34f, 116.72f)
                close()
                moveTo(128.0f, 32.0f)
                lineTo(184.0f, 88.0f)
                lineTo(160.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineTo(128.0f, 116.68f)
                lineTo(101.66f, 90.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 88.0f)
                lineTo(72.0f, 88.0f)
                close()
                moveTo(56.0f, 104.0f)
                lineTo(92.68f, 104.0f)
                lineToRelative(24.0f, 24.0f)
                lineToRelative(-24.0f, 24.0f)
                lineTo(56.0f, 152.0f)
                lineTo(32.0f, 128.0f)
                close()
                moveTo(128.0f, 224.0f)
                lineTo(72.0f, 168.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineTo(128.0f, 139.31f)
                lineToRelative(26.34f, 26.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 168.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(200.0f, 152.0f)
                lineTo(163.32f, 152.0f)
                lineToRelative(-24.0f, -24.0f)
                lineToRelative(24.0f, -24.0f)
                lineTo(200.0f, 104.0f)
                lineToRelative(24.0f, 24.0f)
                close()
            }
        }
        .build()
        return `_pix-logo`!!
    }

private var `_pix-logo`: ImageVector? = null
