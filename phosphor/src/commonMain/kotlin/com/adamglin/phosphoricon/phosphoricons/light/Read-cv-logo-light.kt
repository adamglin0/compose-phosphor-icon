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

public val LightGroup.`Read-cv-logo-light`: ImageVector
    get() {
        if (`_read-cv-logo-light` != null) {
            return `_read-cv-logo-light`!!
        }
        `_read-cv-logo-light` = Builder(name = "Read-cv-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(210.43f, 41.22f)
                lineToRelative(-130.25f, -23.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 64.0f, 29.58f)
                lineToRelative(-29.75f, 169.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.36f, 16.22f)
                lineToRelative(130.25f, 23.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(13.64f, 13.64f, 0.0f, false, false, 2.46f, 0.22f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 226.42f)
                lineToRelative(29.75f, -169.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 210.43f, 41.22f)
                close()
                moveTo(210.0f, 55.36f)
                lineToRelative(-29.75f, 169.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.82f, 1.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.49f, 0.33f)
                lineTo(47.65f, 203.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 200.64f)
                lineToRelative(29.75f, -169.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.82f, -1.3f)
                arcTo(2.06f, 2.06f, 0.0f, false, true, 78.1f, 30.0f)
                lineTo(208.35f, 53.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 55.36f)
                close()
                moveTo(186.11f, 75.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, 5.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.05f, -0.09f)
                lineToRelative(-83.0f, -14.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.09f, -11.81f)
                lineToRelative(83.0f, 14.65f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 186.11f, 75.51f)
                close()
                moveTo(180.56f, 107.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, 5.0f)
                arcToRelative(5.48f, 5.48f, 0.0f, false, true, -1.0f, -0.1f)
                lineToRelative(-83.0f, -14.65f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.09f, -11.82f)
                lineToRelative(83.0f, 14.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 180.56f, 107.0f)
                close()
                moveTo(133.56f, 131.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, 4.95f)
                arcToRelative(6.38f, 6.38f, 0.0f, false, true, -1.05f, -0.09f)
                lineToRelative(-41.49f, -7.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.09f, -11.81f)
                lineToRelative(41.49f, 7.32f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 133.53f, 131.22f)
                close()
            }
        }
        .build()
        return `_read-cv-logo-light`!!
    }

private var `_read-cv-logo-light`: ImageVector? = null
