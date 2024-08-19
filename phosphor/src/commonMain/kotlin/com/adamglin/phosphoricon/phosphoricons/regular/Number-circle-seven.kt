package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Number-circle-seven`: ImageVector
    get() {
        if (`_number-circle-seven` != null) {
            return `_number-circle-seven`!!
        }
        `_number-circle-seven` = Builder(name = "Number-circle-seven", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(158.55f, 83.41f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.0f, 7.32f)
                lineToRelative(-32.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 184.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.73f, -0.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.79f, -10.25f)
                lineTo(140.58f, 96.0f)
                lineTo(104.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 158.55f, 83.41f)
                close()
            }
        }
        .build()
        return `_number-circle-seven`!!
    }

private var `_number-circle-seven`: ImageVector? = null
