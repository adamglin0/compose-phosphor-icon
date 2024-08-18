package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`File-txt`: ImageVector
    get() {
        if (`_file-txt` != null) {
            return `_file-txt`!!
        }
        `_file-txt` = Builder(name = "File-txt", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 120.0f)
                close()
                moveTo(160.0f, 51.31f)
                lineTo(188.69f, 80.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(154.51f, 156.65f)
                lineTo(137.83f, 180.0f)
                lineToRelative(16.68f, 23.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, 9.3f)
                lineTo(128.0f, 193.76f)
                lineToRelative(-13.49f, 18.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.3f)
                lineTo(118.17f, 180.0f)
                lineToRelative(-16.68f, -23.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.0f, -9.3f)
                lineTo(128.0f, 166.24f)
                lineToRelative(13.49f, -18.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, 9.3f)
                close()
                moveTo(92.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(72.0f, 160.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(56.0f, 160.0f)
                lineTo(44.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(84.0f, 144.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 152.0f)
                close()
                moveTo(220.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(200.0f, 160.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(184.0f, 160.0f)
                lineTo(172.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 220.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_file-txt`!!
    }

private var `_file-txt`: ImageVector? = null
