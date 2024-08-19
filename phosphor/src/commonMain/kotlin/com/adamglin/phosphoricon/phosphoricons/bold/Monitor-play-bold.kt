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

public val BoldGroup.`Monitor-play-bold`: ImageVector
    get() {
        if (`_monitor-play-bold` != null) {
            return `_monitor-play-bold`!!
        }
        `_monitor-play-bold` = Builder(name = "Monitor-play-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.12f, 9.83f)
                lineToRelative(-40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 148.0f)
                lineTo(104.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.88f, -9.83f)
                lineToRelative(40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 168.0f, 120.0f)
                close()
                moveTo(236.0f, 64.0f)
                lineTo(236.0f, 176.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(20.0f, 64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 236.0f, 64.0f)
                close()
                moveTo(212.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(44.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(208.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
                moveTo(160.0f, 216.0f)
                lineTo(96.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return `_monitor-play-bold`!!
    }

private var `_monitor-play-bold`: ImageVector? = null
