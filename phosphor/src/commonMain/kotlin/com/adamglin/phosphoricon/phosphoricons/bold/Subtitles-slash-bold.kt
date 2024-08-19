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

public val BoldGroup.`Subtitles-slash-bold`: ImageVector
    get() {
        if (`_subtitles-slash-bold` != null) {
            return `_subtitles-slash-bold`!!
        }
        `_subtitles-slash-bold` = Builder(name = "Subtitles-slash-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(76.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(60.0f, 140.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 128.0f)
                close()
                moveTo(216.88f, 207.93f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f)
                lineToRelative(-11.0f, -12.07f)
                lineTo(32.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 44.0f)
                horizontalLineToRelative(4.68f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.2f, -12.07f)
                close()
                moveTo(166.33f, 188.0f)
                lineToRelative(-10.91f, -12.0f)
                lineTo(60.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(73.6f)
                lineToRelative(-10.91f, -12.0f)
                lineTo(116.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.1f, -18.47f)
                lineTo(57.24f, 68.0f)
                lineTo(36.0f, 68.0f)
                lineTo(36.0f, 188.0f)
                close()
                moveTo(224.0f, 44.0f)
                lineTo(116.6f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(220.0f, 68.0f)
                lineTo(220.0f, 182.94f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(244.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(196.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(182.06f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
            }
        }
        .build()
        return `_subtitles-slash-bold`!!
    }

private var `_subtitles-slash-bold`: ImageVector? = null
