package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`File-audio-light`: ImageVector
    get() {
        if (`_file-audio-light` != null) {
            return `_file-audio-light`!!
        }
        `_file-audio-light` = Builder(name = "File-audio-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.3f, 130.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.54f, 1.3f)
                lineTo(69.51f, 154.0f)
                lineTo(48.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(69.51f, 206.0f)
                lineToRelative(22.25f, 22.24f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 102.0f, 224.0f)
                lineTo(102.0f, 136.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 98.3f, 130.46f)
                close()
                moveTo(90.0f, 209.46f)
                lineTo(76.24f, 195.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 72.0f, 194.0f)
                lineTo(54.0f, 194.0f)
                lineTo(54.0f, 166.0f)
                lineTo(72.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, -1.76f)
                lineTo(90.0f, 150.49f)
                close()
                moveTo(150.0f, 180.0f)
                arcToRelative(38.53f, 38.53f, 0.0f, false, true, -19.0f, 33.18f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 125.0f, 202.82f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, false, 0.0f, -45.64f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 131.0f, 146.82f)
                arcTo(38.53f, 38.53f, 0.0f, false, true, 150.0f, 180.0f)
                close()
                moveTo(212.24f, 83.76f)
                lineTo(156.24f, 27.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                lineTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(168.0f, 218.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 212.24f, 83.76f)
                close()
                moveTo(158.0f, 46.48f)
                lineTo(193.52f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
            }
        }
        .build()
        return `_file-audio-light`!!
    }

private var `_file-audio-light`: ImageVector? = null
