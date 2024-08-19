package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Queue-thin`: ImageVector
    get() {
        if (`_queue-thin` != null) {
            return `_queue-thin`!!
        }
        `_queue-thin` = Builder(name = "Queue-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(40.0f, 68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 64.0f)
                close()
                moveTo(136.0f, 124.0f)
                lineTo(40.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(136.0f, 188.0f)
                lineTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(244.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.88f, 3.39f)
                lineToRelative(-64.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 176.0f, 204.0f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -1.94f, -0.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 200.0f)
                lineTo(172.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.12f, -3.39f)
                lineToRelative(64.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 160.0f)
                close()
                moveTo(232.45f, 160.0f)
                lineTo(180.0f, 127.22f)
                verticalLineToRelative(65.56f)
                close()
            }
        }
        .build()
        return `_queue-thin`!!
    }

private var `_queue-thin`: ImageVector? = null
