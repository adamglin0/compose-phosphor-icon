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

public val BoldGroup.`Video-bold`: ImageVector
    get() {
        if (`_video-bold` != null) {
            return `_video-bold`!!
        }
        `_video-bold` = Builder(name = "Video-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 160.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 180.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(212.0f, 156.0f)
                lineTo(44.0f, 156.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
                moveTo(236.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(224.0f, 196.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 236.0f, 208.0f)
                close()
                moveTo(104.0f, 128.0f)
                lineTo(104.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.36f, -10.18f)
                lineToRelative(32.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 20.36f)
                lineToRelative(-32.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_video-bold`!!
    }

private var `_video-bold`: ImageVector? = null
