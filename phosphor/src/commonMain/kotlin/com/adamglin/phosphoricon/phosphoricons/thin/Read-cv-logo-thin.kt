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

public val ThinGroup.`Read-cv-logo-thin`: ImageVector
    get() {
        if (`_read-cv-logo-thin` != null) {
            return `_read-cv-logo-thin`!!
        }
        `_read-cv-logo-thin` = Builder(name = "Read-cv-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.09f, 43.19f)
                lineToRelative(-130.25f, -23.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.91f, 9.73f)
                lineToRelative(-29.75f, 169.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.73f, 13.9f)
                lineToRelative(130.26f, 23.0f)
                arcToRelative(11.58f, 11.58f, 0.0f, false, false, 2.11f, 0.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.79f, -9.92f)
                lineToRelative(29.75f, -169.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 210.09f, 43.19f)
                close()
                moveTo(211.94f, 55.7f)
                lineTo(182.19f, 224.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.63f, 3.25f)
                lineToRelative(-130.26f, -23.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.24f, -4.63f)
                lineToRelative(29.75f, -169.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.63f, -3.25f)
                lineToRelative(130.26f, 23.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 211.94f, 55.7f)
                close()
                moveTo(184.14f, 75.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.93f, 3.3f)
                arcToRelative(4.14f, 4.14f, 0.0f, false, true, -0.7f, -0.06f)
                lineToRelative(-83.0f, -14.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.39f, -7.88f)
                lineToRelative(83.0f, 14.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 184.14f, 75.17f)
                close()
                moveTo(178.6f, 106.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.31f)
                arcToRelative(3.39f, 3.39f, 0.0f, false, true, -0.7f, -0.07f)
                lineTo(91.0f, 95.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.39f, -7.88f)
                lineToRelative(83.0f, 14.66f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 178.6f, 106.68f)
                close()
                moveTo(131.6f, 130.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, 3.3f)
                arcToRelative(4.23f, 4.23f, 0.0f, false, true, -0.7f, -0.06f)
                lineToRelative(-41.49f, -7.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.39f, -7.87f)
                lineToRelative(41.49f, 7.32f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 131.56f, 130.87f)
                close()
            }
        }
        .build()
        return `_read-cv-logo-thin`!!
    }

private var `_read-cv-logo-thin`: ImageVector? = null
