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

public val FillGroup.`Music-notes-plus-fill`: ImageVector
    get() {
        if (`_music-notes-plus-fill` != null) {
            return `_music-notes-plus-fill`!!
        }
        `_music-notes-plus-fill` = Builder(name = "Music-notes-plus-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(208.0f, 56.0f)
                lineTo(208.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(192.0f, 56.0f)
                lineTo(176.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(192.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(208.0f, 40.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(160.6f, 77.86f)
                lineToRelative(-6.76f, -6.76f)
                arcTo(32.85f, 32.85f, 0.0f, false, true, 144.0f, 49.33f)
                arcToRelative(31.87f, 31.87f, 0.0f, false, true, 1.67f, -11.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.76f, -5.14f)
                lineTo(78.06f, 48.25f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 56.0f)
                lineTo(72.0f, 166.1f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 52.42f, 232.0f)
                curveTo(72.25f, 231.77f, 88.0f, 215.13f, 88.0f, 195.3f)
                lineTo(88.0f, 102.25f)
                lineToRelative(70.74f, -17.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.6f, 77.86f)
                close()
                moveTo(210.71f, 102.17f)
                arcToRelative(31.91f, 31.91f, 0.0f, false, true, -7.14f, 1.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.57f, 4.0f)
                lineTo(200.0f, 134.1f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 180.42f, 200.0f)
                curveToRelative(19.83f, -0.23f, 35.58f, -16.86f, 35.58f, -36.7f)
                lineTo(216.0f, 106.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 210.71f, 102.17f)
                close()
            }
        }
        .build()
        return `_music-notes-plus-fill`!!
    }

private var `_music-notes-plus-fill`: ImageVector? = null
