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

public val LightGroup.`Package-light`: ImageVector
    get() {
        if (`_package-light` != null) {
            return `_package-light`!!
        }
        `_package-light` = Builder(name = "Package-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.72f, 67.91f)
                lineToRelative(-88.0f, -48.18f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -13.44f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.28f, 12.27f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 13.44f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 230.0f, 175.82f)
                verticalLineTo(80.18f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 222.72f, 67.91f)
                close()
                moveTo(127.0f, 30.25f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.92f, 0.0f)
                lineTo(212.51f, 76.0f)
                lineTo(178.57f, 94.57f)
                lineTo(94.05f, 48.31f)
                close()
                moveTo(122.0f, 223.0f)
                lineTo(39.0f, 177.57f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, -1.75f)
                verticalLineTo(86.66f)
                lineToRelative(84.0f, 46.0f)
                close()
                moveTo(43.49f, 76.0f)
                lineTo(81.56f, 55.15f)
                lineToRelative(84.51f, 46.26f)
                lineTo(128.0f, 122.24f)
                close()
                moveTo(218.0f, 175.82f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.0f, 1.75f)
                horizontalLineToRelative(0.0f)
                lineTo(134.0f, 223.0f)
                verticalLineTo(132.64f)
                lineToRelative(36.0f, -19.71f)
                verticalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(106.37f)
                lineToRelative(36.0f, -19.71f)
                close()
            }
        }
        .build()
        return `_package-light`!!
    }

private var `_package-light`: ImageVector? = null
