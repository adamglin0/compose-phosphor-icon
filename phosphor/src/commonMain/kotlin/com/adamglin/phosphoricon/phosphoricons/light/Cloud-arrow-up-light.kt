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

public val LightGroup.`Cloud-arrow-up-light`: ImageVector
    get() {
        if (`_cloud-arrow-up-light` != null) {
            return `_cloud-arrow-up-light`!!
        }
        `_cloud-arrow-up-light` = Builder(name = "Cloud-arrow-up-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.24f, 164.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineTo(158.0f, 142.49f)
                verticalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(142.49f)
                lineToRelative(-21.76f, 21.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 188.24f, 164.24f)
                close()
                moveTo(160.0f, 42.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 82.43f, 90.88f)
                arcTo(62.0f, 62.0f, 0.0f, true, false, 72.0f, 214.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(72.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 0.0f, -100.0f)
                arcToRelative(50.68f, 50.68f, 0.0f, false, true, 5.91f, 0.36f)
                arcTo(85.54f, 85.54f, 0.0f, false, false, 74.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 103.6f, 67.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.8f, 11.0f)
                arcTo(86.0f, 86.0f, 0.0f, false, false, 160.0f, 42.0f)
                close()
            }
        }
        .build()
        return `_cloud-arrow-up-light`!!
    }

private var `_cloud-arrow-up-light`: ImageVector? = null
