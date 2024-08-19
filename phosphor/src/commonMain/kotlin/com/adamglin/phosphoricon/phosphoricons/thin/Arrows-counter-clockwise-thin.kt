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

public val ThinGroup.`Arrows-counter-clockwise-thin`: ImageVector
    get() {
        if (`_arrows-counter-clockwise-thin` != null) {
            return `_arrows-counter-clockwise-thin`!!
        }
        `_arrows-counter-clockwise-thin` = Builder(name = "Arrows-counter-clockwise-thin",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 100.0f)
                lineTo(40.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(44.0f, 86.34f)
                lineTo(65.46f, 64.89f)
                arcTo(91.39f, 91.39f, 0.0f, false, true, 130.0f, 37.94f)
                horizontalLineToRelative(0.51f)
                arcTo(91.43f, 91.43f, 0.0f, false, true, 194.8f, 64.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 5.72f)
                arcToRelative(83.44f, 83.44f, 0.0f, false, false, -58.68f, -23.91f)
                horizontalLineToRelative(-0.47f)
                arcToRelative(83.52f, 83.52f, 0.0f, false, false, -58.94f, 24.6f)
                lineTo(49.66f, 92.0f)
                lineTo(88.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(216.0f, 156.0f)
                lineTo(168.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(38.34f)
                lineToRelative(-21.45f, 21.46f)
                arcTo(83.52f, 83.52f, 0.0f, false, true, 126.0f, 210.06f)
                horizontalLineToRelative(-0.47f)
                arcTo(83.44f, 83.44f, 0.0f, false, true, 66.8f, 186.15f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.72f)
                arcToRelative(91.43f, 91.43f, 0.0f, false, false, 64.28f, 26.19f)
                lineTo(126.0f, 218.06f)
                arcToRelative(91.39f, 91.39f, 0.0f, false, false, 64.55f, -26.95f)
                lineTo(212.0f, 169.66f)
                lineTo(212.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(220.0f, 160.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 156.0f)
                close()
            }
        }
        .build()
        return `_arrows-counter-clockwise-thin`!!
    }

private var `_arrows-counter-clockwise-thin`: ImageVector? = null
