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

public val FillGroup.`Files-fill`: ImageVector
    get() {
        if (`_files-fill` != null) {
            return `_files-fill`!!
        }
        `_files-fill` = Builder(name = "Files-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 66.34f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 24.0f)
                lineTo(88.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 40.0f)
                lineTo(72.0f, 56.0f)
                lineTo(56.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 72.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(168.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(184.0f, 200.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 66.34f)
                close()
                moveTo(136.0f, 192.0f)
                lineTo(88.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(136.0f, 160.0f)
                lineTo(88.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(200.0f, 184.0f)
                lineTo(184.0f, 184.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineToRelative(-40.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 56.0f)
                lineTo(88.0f, 56.0f)
                lineTo(88.0f, 40.0f)
                horizontalLineToRelative(76.69f)
                lineTo(200.0f, 75.31f)
                close()
            }
        }
        .build()
        return `_files-fill`!!
    }

private var `_files-fill`: ImageVector? = null
