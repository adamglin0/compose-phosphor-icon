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

public val LightGroup.`Folder-user-light`: ImageVector
    get() {
        if (`_folder-user-light` != null) {
            return `_folder-user-light`!!
        }
        `_folder-user-light` = Builder(name = "Folder-user-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.28f, 199.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -38.56f, 0.0f)
                arcToRelative(38.09f, 38.09f, 0.0f, false, false, -18.52f, 23.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.26f, 7.34f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, false, 1.54f, 0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.8f, -4.46f)
                curveTo(168.86f, 214.0f, 179.63f, 206.0f, 192.0f, 206.0f)
                reflectiveCurveToRelative(23.14f, 8.0f, 26.2f, 19.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.6f, -3.09f)
                arcTo(38.09f, 38.09f, 0.0f, false, false, 211.28f, 199.0f)
                close()
                moveTo(192.0f, 158.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 192.0f, 158.0f)
                close()
                moveTo(216.0f, 74.0f)
                lineTo(130.48f, 74.0f)
                lineTo(102.59f, 46.1f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, -4.1f)
                lineTo(40.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f)
                lineTo(26.0f, 200.61f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 39.38f, 214.0f)
                horizontalLineToRelative(81.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(39.38f, 202.0f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 38.0f, 200.61f)
                lineTo(38.0f, 86.0f)
                lineTo(216.0f, 86.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 74.0f)
                close()
                moveTo(40.0f, 54.0f)
                lineTo(92.69f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.59f)
                lineTo(113.51f, 74.0f)
                lineTo(38.0f, 74.0f)
                lineTo(38.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f)
                close()
            }
        }
        .build()
        return `_folder-user-light`!!
    }

private var `_folder-user-light`: ImageVector? = null
