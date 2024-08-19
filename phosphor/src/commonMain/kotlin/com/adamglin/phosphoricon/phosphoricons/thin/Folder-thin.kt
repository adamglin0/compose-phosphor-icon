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

public val ThinGroup.`Folder-thin`: ImageVector
    get() {
        if (`_folder-thin` != null) {
            return `_folder-thin`!!
        }
        `_folder-thin` = Builder(name = "Folder-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 76.0f)
                horizontalLineTo(129.66f)
                lineTo(101.17f, 47.52f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 92.69f, 44.0f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineTo(200.62f)
                arcTo(11.4f, 11.4f, 0.0f, false, false, 39.38f, 212.0f)
                horizontalLineTo(216.89f)
                arcTo(11.12f, 11.12f, 0.0f, false, false, 228.0f, 200.89f)
                verticalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 76.0f)
                close()
                moveTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(92.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineTo(118.34f, 76.0f)
                horizontalLineTo(36.0f)
                close()
                moveTo(220.0f, 200.89f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, -3.11f, 3.11f)
                horizontalLineTo(39.38f)
                arcTo(3.39f, 3.39f, 0.0f, false, true, 36.0f, 200.62f)
                verticalLineTo(84.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_folder-thin`!!
    }

private var `_folder-thin`: ImageVector? = null
