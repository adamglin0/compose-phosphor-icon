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

public val RegularGroup.`Folder-open`: ImageVector
    get() {
        if (`_folder-open` != null) {
            return `_folder-open`!!
        }
        `_folder-open` = Builder(name = "Folder-open", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.0f, 110.64f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 104.0f)
                lineTo(216.0f, 104.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(130.67f, 72.0f)
                lineTo(102.94f, 51.2f)
                arcToRelative(16.14f, 16.14f, 0.0f, false, false, -9.6f, -3.2f)
                lineTo(40.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 64.0f)
                lineTo(24.0f, 208.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(211.1f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -5.47f)
                lineToRelative(28.49f, -85.47f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 245.0f, 110.64f)
                close()
                moveTo(93.34f, 64.0f)
                lineTo(123.2f, 86.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 88.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(16.0f)
                lineTo(69.77f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.18f, 10.94f)
                lineTo(40.0f, 158.7f)
                lineTo(40.0f, 64.0f)
                close()
                moveTo(205.34f, 200.0f)
                lineTo(43.1f, 200.0f)
                lineToRelative(26.67f, -80.0f)
                lineTo(232.0f, 120.0f)
                close()
            }
        }
        .build()
        return `_folder-open`!!
    }

private var `_folder-open`: ImageVector? = null
