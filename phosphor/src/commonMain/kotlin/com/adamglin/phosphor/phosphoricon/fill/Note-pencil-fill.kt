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

public val FillGroup.`Note-pencil-fill`: ImageVector
    get() {
        if (`_note-pencil-fill` != null) {
            return `_note-pencil-fill`!!
        }
        `_note-pencil-fill` = Builder(name = "Note-pencil-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(48.0f, 48.0f)
                lineTo(48.0f, 208.0f)
                lineTo(208.0f, 208.0f)
                lineTo(208.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(229.66f, 69.66f)
                lineTo(133.66f, 165.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 168.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(88.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.66f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 229.66f, 69.66f)
                close()
                moveTo(212.66f, 64.0f)
                lineTo(192.0f, 43.31f)
                lineTo(179.31f, 56.0f)
                lineTo(200.0f, 76.69f)
                close()
            }
        }
        .build()
        return `_note-pencil-fill`!!
    }

private var `_note-pencil-fill`: ImageVector? = null
