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

public val ThinGroup.`Package-thin`: ImageVector
    get() {
        if (`_package-thin` != null) {
            return `_package-thin`!!
        }
        `_package-thin` = Builder(name = "Package-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.76f, 69.66f)
                lineToRelative(-88.0f, -48.18f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.52f, 0.0f)
                lineToRelative(-88.0f, 48.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.18f)
                verticalLineToRelative(95.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.24f, 10.52f)
                lineToRelative(88.0f, 48.18f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, 11.52f, 0.0f)
                lineToRelative(88.0f, -48.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 175.82f)
                lineTo(228.0f, 80.18f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 221.76f, 69.66f)
                close()
                moveTo(126.08f, 28.5f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, 3.84f, 0.0f)
                lineTo(216.67f, 76.0f)
                lineTo(178.5f, 96.89f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.58f, -0.4f)
                lineToRelative(-88.0f, -48.18f)
                close()
                moveTo(128.0f, 124.5f)
                lineTo(39.33f, 76.0f)
                lineTo(81.56f, 52.87f)
                lineToRelative(88.67f, 48.54f)
                close()
                moveTo(38.08f, 179.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.08f, -3.5f)
                lineTo(36.0f, 83.29f)
                lineToRelative(88.0f, 48.16f)
                verticalLineToRelative(94.91f)
                close()
                moveTo(217.92f, 179.3f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-85.92f, 47.0f)
                lineTo(132.0f, 131.45f)
                lineToRelative(40.0f, -21.89f)
                lineTo(172.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(180.0f, 105.18f)
                lineToRelative(40.0f, -21.89f)
                verticalLineToRelative(92.53f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 217.92f, 179.32f)
                close()
            }
        }
        .build()
        return `_package-thin`!!
    }

private var `_package-thin`: ImageVector? = null
