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

public val RegularGroup.`Folder-star`: ImageVector
    get() {
        if (`_folder-star` != null) {
            return `_folder-star`!!
        }
        `_folder-star` = Builder(name = "Folder-star", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.56f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 88.0f)
                lineTo(216.0f, 88.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(131.31f, 72.0f)
                lineTo(104.0f, 44.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 92.69f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.62f)
                arcTo(15.4f, 15.4f, 0.0f, false, false, 39.38f, 216.0f)
                horizontalLineToRelative(81.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(92.69f, 56.0f)
                lineToRelative(16.0f, 16.0f)
                lineTo(40.0f, 72.0f)
                lineTo(40.0f, 56.0f)
                close()
                moveTo(239.63f, 159.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.0f, -5.56f)
                lineToRelative(-29.84f, -2.31f)
                lineToRelative(-11.43f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.7f, 0.0f)
                lineToRelative(-11.43f, 26.5f)
                lineToRelative(-29.84f, 2.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.47f, 14.14f)
                lineToRelative(22.51f, 18.59f)
                lineToRelative(-6.85f, 27.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.82f, 8.81f)
                lineTo(184.0f, 207.82f)
                lineToRelative(25.61f, 15.07f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.82f, -8.81f)
                lineToRelative(-6.85f, -27.71f)
                lineToRelative(22.51f, -18.59f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 239.63f, 159.2f)
                close()
                moveTo(200.51f, 177.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.68f, 8.09f)
                lineToRelative(3.5f, 14.12f)
                lineToRelative(-13.27f, -7.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.12f, 0.0f)
                lineToRelative(-13.27f, 7.81f)
                lineToRelative(3.5f, -14.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.68f, -8.09f)
                lineToRelative(-11.11f, -9.18f)
                lineToRelative(14.89f, -1.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.73f, -4.8f)
                lineToRelative(6.0f, -13.92f)
                lineToRelative(6.0f, 13.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.73f, 4.8f)
                lineToRelative(14.89f, 1.15f)
                close()
            }
        }
        .build()
        return `_folder-star`!!
    }

private var `_folder-star`: ImageVector? = null
