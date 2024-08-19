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

public val ThinGroup.`Arrows-clockwise-thin`: ImageVector
    get() {
        if (`_arrows-clockwise-thin` != null) {
            return `_arrows-clockwise-thin`!!
        }
        `_arrows-clockwise-thin` = Builder(name = "Arrows-clockwise-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 48.0f)
                verticalLineTo(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(38.34f)
                lineTo(184.89f, 70.54f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 66.8f, 69.85f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.6f, -5.72f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 129.34f, 0.76f)
                lineTo(212.0f, 86.34f)
                verticalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(189.2f, 186.15f)
                arcToRelative(83.44f, 83.44f, 0.0f, false, true, -58.68f, 23.91f)
                horizontalLineToRelative(-0.47f)
                arcToRelative(83.52f, 83.52f, 0.0f, false, true, -58.94f, -24.6f)
                lineTo(49.66f, 164.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(169.66f)
                lineToRelative(21.46f, 21.45f)
                arcTo(91.43f, 91.43f, 0.0f, false, false, 130.0f, 218.06f)
                horizontalLineToRelative(0.51f)
                arcToRelative(91.45f, 91.45f, 0.0f, false, false, 64.28f, -26.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, -5.72f)
                close()
            }
        }
        .build()
        return `_arrows-clockwise-thin`!!
    }

private var `_arrows-clockwise-thin`: ImageVector? = null
