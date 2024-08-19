package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Note-pencil-bold`: ImageVector
    get() {
        if (`_note-pencil-bold` != null) {
            return `_note-pencil-bold`!!
        }
        `_note-pencil-bold` = Builder(name = "Note-pencil-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 55.51f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 128.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineToRelative(96.0f, -96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.49f, 55.51f)
                close()
                moveTo(192.0f, 49.0f)
                lineToRelative(15.0f, 15.0f)
                lineTo(196.0f, 75.0f)
                lineTo(181.0f, 60.0f)
                close()
                moveTo(123.0f, 148.0f)
                lineTo(108.0f, 148.0f)
                lineTo(108.0f, 133.0f)
                lineToRelative(56.0f, -56.0f)
                lineToRelative(15.0f, 15.0f)
                close()
                moveTo(228.0f, 140.57f)
                lineTo(228.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 28.0f)
                horizontalLineToRelative(67.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 204.0f)
                lineTo(204.0f, 204.0f)
                lineTo(204.0f, 140.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return `_note-pencil-bold`!!
    }

private var `_note-pencil-bold`: ImageVector? = null
