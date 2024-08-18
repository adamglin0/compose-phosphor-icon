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

public val RegularGroup.`Cloud-lightning`: ImageVector
    get() {
        if (`_cloud-lightning` != null) {
            return `_cloud-lightning`!!
        }
        `_cloud-lightning` = Builder(name = "Cloud-lightning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 16.0f)
                arcTo(76.2f, 76.2f, 0.0f, false, false, 84.92f, 64.76f)
                arcTo(53.26f, 53.26f, 0.0f, false, false, 76.0f, 64.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 104.0f)
                horizontalLineToRelative(37.87f)
                lineTo(97.14f, 195.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 208.0f)
                horizontalLineToRelative(25.87f)
                lineToRelative(-16.73f, 27.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.72f, 8.24f)
                lineToRelative(24.0f, -40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 192.0f)
                lineTo(118.13f, 192.0f)
                lineToRelative(14.4f, -24.0f)
                lineTo(156.0f, 168.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f)
                close()
                moveTo(156.0f, 152.0f)
                lineTo(76.0f, 152.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, -72.0f)
                arcToRelative(38.11f, 38.11f, 0.0f, false, true, 4.78f, 0.31f)
                quadToRelative(-0.56f, 3.57f, -0.77f, 7.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.92f)
                arcTo(60.06f, 60.06f, 0.0f, true, true, 156.0f, 152.0f)
                close()
            }
        }
        .build()
        return `_cloud-lightning`!!
    }

private var `_cloud-lightning`: ImageVector? = null
