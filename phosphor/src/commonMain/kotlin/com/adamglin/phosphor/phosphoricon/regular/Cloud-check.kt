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

public val RegularGroup.`Cloud-check`: ImageVector
    get() {
        if (`_cloud-check` != null) {
            return `_cloud-check`!!
        }
        `_cloud-check` = Builder(name = "Cloud-check", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 40.0f)
                arcTo(88.09f, 88.09f, 0.0f, false, false, 81.29f, 88.67f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 72.0f, 216.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 0.0f, -176.0f)
                close()
                moveTo(160.0f, 200.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.29f, 0.11f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, 72.0f)
                close()
                moveTo(197.66f, 106.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(144.0f, 148.69f)
                lineToRelative(42.34f, -42.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 197.66f, 106.34f)
                close()
            }
        }
        .build()
        return `_cloud-check`!!
    }

private var `_cloud-check`: ImageVector? = null
