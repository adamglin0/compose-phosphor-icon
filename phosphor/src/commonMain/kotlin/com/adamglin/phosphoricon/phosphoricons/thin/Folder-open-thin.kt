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

public val ThinGroup.`Folder-open-thin`: ImageVector
    get() {
        if (`_folder-open-thin` != null) {
            return `_folder-open-thin`!!
        }
        `_folder-open-thin` = Builder(name = "Folder-open-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(241.72f, 113.0f)
                arcToRelative(11.88f, 11.88f, 0.0f, false, false, -9.73f, -5.0f)
                lineTo(212.0f, 108.0f)
                lineTo(212.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(129.33f, 76.0f)
                lineToRelative(-28.8f, -21.6f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, -7.2f, -2.4f)
                lineTo(40.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(211.09f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.79f, -2.74f)
                lineToRelative(28.49f, -85.47f)
                arcTo(11.86f, 11.86f, 0.0f, false, false, 241.72f, 113.0f)
                close()
                moveTo(40.0f, 60.0f)
                lineTo(93.33f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.4f, 0.8f)
                lineTo(125.6f, 83.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 0.8f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(69.76f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.38f, 8.21f)
                lineTo(36.0f, 183.35f)
                lineTo(36.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 60.0f)
                close()
                moveTo(235.78f, 121.26f)
                lineTo(208.2f, 204.0f)
                lineTo(37.55f, 204.0f)
                lineTo(66.0f, 118.74f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 69.76f, 116.0f)
                lineTo(232.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.79f, 5.26f)
                close()
            }
        }
        .build()
        return `_folder-open-thin`!!
    }

private var `_folder-open-thin`: ImageVector? = null
