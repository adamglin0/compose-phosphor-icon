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

public val FillGroup.`Folders-fill`: ImageVector
    get() {
        if (`_folders-fill` != null) {
            return `_folders-fill`!!
        }
        `_folders-fill` = Builder(name = "Folders-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                lineTo(154.67f, 64.0f)
                lineTo(126.93f, 43.2f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f)
                lineTo(72.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 56.0f)
                lineTo(56.0f, 72.0f)
                lineTo(40.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 88.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.89f, 216.0f)
                arcTo(15.13f, 15.13f, 0.0f, false, false, 208.0f, 200.89f)
                lineTo(208.0f, 184.0f)
                horizontalLineToRelative(16.89f)
                arcTo(15.13f, 15.13f, 0.0f, false, false, 240.0f, 168.89f)
                lineTo(240.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 64.0f)
                close()
                moveTo(224.0f, 168.0f)
                lineTo(208.0f, 168.0f)
                lineTo(208.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(122.67f, 96.0f)
                lineTo(94.93f, 75.2f)
                arcToRelative(16.12f, 16.12f, 0.0f, false, false, -9.6f, -3.2f)
                lineTo(72.0f, 72.0f)
                lineTo(72.0f, 56.0f)
                horizontalLineToRelative(45.33f)
                lineTo(147.2f, 78.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 80.0f)
                horizontalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return `_folders-fill`!!
    }

private var `_folders-fill`: ImageVector? = null
