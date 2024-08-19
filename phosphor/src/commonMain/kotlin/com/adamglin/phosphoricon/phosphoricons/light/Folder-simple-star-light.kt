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

public val LightGroup.`Folder-simple-star-light`: ImageVector
    get() {
        if (`_folder-simple-star-light` != null) {
            return `_folder-simple-star-light`!!
        }
        `_folder-simple-star-light` = Builder(name = "Folder-simple-star-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.0f, 64.0f)
                lineTo(38.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f)
                lineTo(93.33f, 50.0f)
                arcToRelative(14.06f, 14.06f, 0.0f, false, true, 8.4f, 2.8f)
                lineTo(130.0f, 74.0f)
                horizontalLineToRelative(86.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(128.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.6f, -1.2f)
                lineTo(94.53f, 62.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.2f, -0.4f)
                lineTo(40.0f, 62.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 38.0f, 64.0f)
                close()
                moveTo(235.82f, 166.24f)
                lineToRelative(-23.49f, 19.39f)
                lineToRelative(7.16f, 28.93f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, 6.61f)
                lineTo(184.0f, 205.5f)
                lineToRelative(-26.62f, 15.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.87f, -6.61f)
                lineToRelative(7.16f, -28.93f)
                lineToRelative(-23.49f, -19.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, -10.61f)
                lineToRelative(31.0f, -2.4f)
                lineToRelative(11.91f, -27.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.0f, 0.0f)
                lineToRelative(11.91f, 27.61f)
                lineToRelative(31.0f, 2.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.36f, 10.61f)
                close()
                moveTo(216.72f, 166.45f)
                lineTo(196.89f, 164.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -3.61f)
                lineTo(184.0f, 143.14f)
                lineToRelative(-7.84f, 18.17f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 3.61f)
                lineToRelative(-19.83f, 1.53f)
                lineToRelative(14.94f, 12.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, 6.07f)
                lineToRelative(-4.63f, 18.74f)
                lineTo(181.0f, 193.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.08f, 0.0f)
                lineToRelative(17.37f, 10.23f)
                lineToRelative(-4.64f, -18.74f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.0f, -6.07f)
                close()
            }
        }
        .build()
        return `_folder-simple-star-light`!!
    }

private var `_folder-simple-star-light`: ImageVector? = null
