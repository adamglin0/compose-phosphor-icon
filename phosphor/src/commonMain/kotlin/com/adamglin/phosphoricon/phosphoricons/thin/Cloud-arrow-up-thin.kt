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

public val ThinGroup.`Cloud-arrow-up-thin`: ImageVector
    get() {
        if (`_cloud-arrow-up-thin` != null) {
            return `_cloud-arrow-up-thin`!!
        }
        `_cloud-arrow-up-thin` = Builder(name = "Cloud-arrow-up-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.83f, 162.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                lineTo(156.0f, 137.66f)
                verticalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(137.66f)
                lineToRelative(-25.17f, 25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 186.83f, 162.83f)
                close()
                moveTo(160.0f, 44.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 83.61f, 93.13f)
                arcTo(60.0f, 60.0f, 0.0f, true, false, 72.0f, 212.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(72.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 8.57f, -103.27f)
                arcTo(83.45f, 83.45f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 106.4f, 69.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.6f, 7.66f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.6f, -0.33f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 160.0f, 44.0f)
                close()
            }
        }
        .build()
        return `_cloud-arrow-up-thin`!!
    }

private var `_cloud-arrow-up-thin`: ImageVector? = null
